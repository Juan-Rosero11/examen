package Examen1;

import javax.swing.*;

public class SuscripcionDigital {

    //atributos
    private int id;
    private Spring nombre;
    private int mesesDisponibles;

    private static int contadorSuscripciones = 0;

    //Constructor

    private SuscripcionDigital (int id,String nombre nombre){
        int i = contadorSuscripciones++;}
    this.id=id

    if nombre ! = null&&

    private int getId() {
        return id;
    }

    public Spring getNombre() {
        return nombre;
    }

    private static void setContadorSuscripciones(int contadorSuscripciones) {
        SuscripcionDigital.contadorSuscripciones = contadorSuscripciones;
    }

    private static int getContadorSuscripciones() {

        return contadorSuscripciones;
    }

    private int getMesesDisponibles() {
        return mesesDisponibles;
    }



}


