package com.example.ejercicio2registrarprograma;

public class Persistencia {
    public static final String RUTA_FXML="Ejercicio2-RegistrarPrograma/src/main/resources/Programas.xml";
    public static void guardarProgramaXml(Programa programa) {
        try {
            ArchivoUtil.salvarRecursoSerializadoXML(RUTA_FXML, programa);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
