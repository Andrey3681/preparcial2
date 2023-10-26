package com.example.plantillahilos.hilos;

public class HiloThrear extends Thread{

    boolean runHilo;

    @Override
    public void run(){
        while (runHilo){
            //aca va lo que hace el hilo
        }

    }

    public HiloThrear(){
        this.runHilo=true;
        start();
    }

    public void detener(){
        this.runHilo=false;
    }
}
