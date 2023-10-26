package com.example.ejercicio5syncronizaciondehilos;

import java.util.Scanner;

public class HiloController implements Runnable{
    Thread hilo1=new Thread(this);
    Thread hilo2=new Thread(this);

    Long tiempoTranscurrido;
    Long tiempoInicial;


    String variable;

    boolean runHilo1,runHilo2;

    public void starHilo1() throws InterruptedException {
        hilo1.start();
        hilo1.join();
        runHilo1=true;
    }

    public void starHilo2() throws InterruptedException{
        hilo2.start();
        hilo2.join();
        runHilo2=true;
    }

    public void detenerHilo1(){
        runHilo1=false;
    }

    public void detenerHilo2(){
        runHilo2=false;
    }






    @Override
    public void run() {
        tiempoInicial=System.currentTimeMillis();
        Thread hiloActual=Thread.currentThread();
        if(hiloActual==hilo1||runHilo1){
            try {
                Scanner scanner=new Scanner(System.in);
                this.variable=scanner.nextLine();
                Thread.sleep(6000);//esperar 6 segundos
                tiempoTranscurrido= System.currentTimeMillis() - tiempoInicial;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(hiloActual==hilo2||runHilo2){
            try {
                Thread.sleep(2222);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
