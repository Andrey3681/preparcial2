package com.example.ejercicio1registrarestudiante;

import java.io.IOException;

public class Persistencia {
    public static final String RUTA_ESTUDIANTE= "Ejercicio1-RegistrarEstudiante//src//main//resources//Estudiante.txt";
    public static final String RUTA_LOG="Ejercicio1-RegistrarEstudiante//src//main//resources//MyLog.txt";

    public static void guardarEstudiante(Estudiante estudiante) throws IOException {
        String contenido="";
        if(estudiante!=null){
            contenido=estudiante.getNombre()+"@"+
                    estudiante.getCodigo()+"@"+
                    estudiante.getNotas().get(0)+"@"+
                    estudiante.getNotas().get(1)+"@"+
                    estudiante.getNotas().get(2) + "\n";
        }
        ArchivoUtil.guardarArchivo(RUTA_ESTUDIANTE,contenido,true);
    }

    public static void registrarLog(String mensaje,String accion,int nivel){
        ArchivoUtil.guardarRegistroLog(mensaje,nivel,accion,RUTA_LOG);
    }
}
