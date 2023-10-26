package com.example.plantillamodelfactory.utils;

import com.example.plantillamodelfactory.model.ClasePrincipal;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Persistencia {

    //poner al model
    //  private static final long serialVersionUID = 1L;
    public static final String RUTA_ARCHIVO_XML ="nombreProyecto/src/main/resource/nombredearchivo.xml";
    public static final String RUTA_ARCHIVO_BINARIO="nombreProyecto/src/main/resource/nombredearchivo.dat";
    public static final String RUTA_ARCHIVO_LOG="nombreProyecto/src/main/resource/nombredearchivo.txt";

    public static final String RUTA_ARCHIVO_OBJETO1="nombreProyecto/src/main/resource/nombredearchivo.txt";



    public static void cargarDatosArchivos(ClasePrincipal clasePrincipal)throws FileNotFoundException, IOException{

    }

    public static void guardaRegistroLog(String mensajeLog, int nivel, String accion)
    {
        ArchivoUtil.guardarRegistroLog(mensajeLog, nivel, accion, RUTA_ARCHIVO_LOG);
    }

    public static ClasePrincipal cargarRecursoSubastaBinario() {

        ClasePrincipal clasePrincipal = null;

        try {
            clasePrincipal = (ClasePrincipal) ArchivoUtil.cargarRecursoSerializado(RUTA_ARCHIVO_BINARIO);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return clasePrincipal;
    }

    public static void guardarRecursoSubastaBinario(ClasePrincipal clasePrincipal) {
        try {
            ArchivoUtil.salvarRecursoSerializado(RUTA_ARCHIVO_BINARIO, clasePrincipal);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void guardarRecursoSubastaXML(ClasePrincipal clasePrincipal) {

        try {
            ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_XML, clasePrincipal);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static ClasePrincipal cargarArchivoXML() {
        ClasePrincipal clasePrincipal  = null;
        try {
             clasePrincipal= (ClasePrincipal) ArchivoUtil.cargarRecursoSerializadoXML(RUTA_ARCHIVO_XML);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return clasePrincipal ;
    }
}
