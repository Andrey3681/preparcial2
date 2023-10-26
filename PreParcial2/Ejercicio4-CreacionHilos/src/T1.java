import java.util.ArrayList;

public class T1 extends Thread {

    private String palabra;
    private int numeroVocales;

    public T1(String palabra) {
        this.palabra = palabra;
        this.numeroVocales=0;
    }

    @Override
    public void run() {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)=='a'||palabra.charAt(i)=='e'||palabra.charAt(i)=='i'||palabra.charAt(i)=='o'||palabra.charAt(i)=='u'||
            palabra.charAt(i)=='A'||palabra.charAt(i)=='E'||palabra.charAt(i)=='I'||palabra.charAt(i)=='O'||palabra.charAt(i)=='U') {
                numeroVocales+=1;
            }
        }
    }

    public int getNumeroVocales() {
        return numeroVocales;
    }
}
