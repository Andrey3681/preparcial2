import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int N=10;
       String  palabra = "otorrinolaringologia";
       T1 t1=new T1(palabra);
       T2 t2=new T2(N);
       t1.run();
       t1.join();
       t2.run();
       t2.join();
       System.out.println(t1.getNumeroVocales());
       System.out.println(t2.getTotalSuma());
       System.out.println(t1.getNumeroVocales()*t2.getTotalSuma());


    }
}