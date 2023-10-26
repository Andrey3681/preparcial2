package com.example.ejercicio1registrarestudiante;

import java.util.ArrayList;

public class Estudiante {
   // código, nombre y tres notas
    private String codigo;
    private String nombre;
    private ArrayList<Float> notas=new ArrayList<>();

    public Estudiante( String codigo,String nombre) {
        this.codigo=codigo;
        this.nombre=nombre;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }
}
