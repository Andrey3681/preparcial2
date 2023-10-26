package com.example.plantillahilos.hilos;

public class ManejadorHilo implements Runnable {


    HiloThrear hiloThrear;

    Thread hiloNoPropio;
    boolean runHiloNoPropio;

    public ManejadorHilo(){
    }
    public void starHilo() throws InterruptedException {
        hiloThrear=new HiloThrear();
        hiloThrear.start();
        hiloThrear.join();
    }
    public void detenerHilo(){
        if(hiloThrear !=null)
            hiloThrear.detener();
    }

    public void starHiloNoPropio(){
        this.runHiloNoPropio=true;
        hiloNoPropio=new Thread(this);
        hiloNoPropio.start();
    }

    public void detenerHiloNoPropio(){
        this.runHiloNoPropio=false;
    }



    @Override
    public void run() {
        Thread hiloEjecucion= Thread.currentThread();
        if(hiloEjecucion==hiloNoPropio){
            ejecutarHiloNoPropio();
        }
    }

    private void ejecutarHiloNoPropio() {
        while (runHiloNoPropio){

        }
    }
}
