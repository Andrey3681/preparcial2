public class T2 extends Thread{
    private int n;
    private int totalSuma;

    public T2(int n) {
        this.n = n;
    }

    @Override
    public void run(){
        totalSuma=sumaRecursiva(n,0);
    }

    private int sumaRecursiva(int n,int i) {
        if (i == 3) {
            return n;
        }else {
           return sumaRecursiva(n,i+1)+n;
        }
    }

    public int getTotalSuma() {
        return totalSuma;
    }
}
