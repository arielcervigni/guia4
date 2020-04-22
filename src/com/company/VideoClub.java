package com.company;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class VideoClub {

    public void nuevoAlquiler (Alquiler unAlquiler)
    {
        if (unAlquiler!=null) {
            int i, cant;
            for (i = 0; i < unAlquiler.arregloDePeliculas.length; i++) {
                if (unAlquiler.arregloDePeliculas[i] != null) /// Si el arreglo no está vacío, sumo uno a catidad de veces alquilado.
                {
                    cant = unAlquiler.arregloDePeliculas[i].getCantAlquiler();
                    unAlquiler.arregloDePeliculas[i].setCantAlquiler(cant + 1);
                }
            }
        }
    }
    /// Ejercicio 1
    public StringBuilder devolucionesDelDia (ArrayList arregloDeAlquileres, String diaDevolucion) {

        StringBuilder devoluciones = new StringBuilder();

        if (arregloDeAlquileres != null) {

            int i;
            String fechaDevolucion;
            Alquiler unAlquiler;
            System.out.println(devoluciones);

            for (i = 0; i < arregloDeAlquileres.size(); i++) {
                unAlquiler = (Alquiler) arregloDeAlquileres.get(i);
                fechaDevolucion = unAlquiler.getDevolucion();
                if (diaDevolucion == fechaDevolucion) {
                    devoluciones.append(unAlquiler.toString());
                }
            }
        }
        else
            devoluciones.append("Error en el programa");
        return devoluciones;
    }
}
