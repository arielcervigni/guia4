package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;
import com.company.Alquiler;
import com.company.Pelicula;
import com.company.Cliente;

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
    //Quiere una forma de poder consultar los alquileres vigentes.
    public ArrayList  alquileresVigentes (List arregloDeAlquieres, String dia)
    {
        ArrayList <Alquiler> arregloVigente =  new ArrayList<>();
        int i;
            for (i=0; i <arregloDeAlquieres.size(); i++)
            {
                if (arregloDeAlquieres.get(i)== )
                {
                   arregloVigente.add(arregloDeAlquieres.get(i));
                }
            }
        return arregloVigente;
    }

    /// Ejercicio 2
    public StringBuilder devolucionesDelDia (ArrayList arregloDeAlquileres, String diaDevolucion) {

        StringBuilder devoluciones = new StringBuilder();

        if (arregloDeAlquileres != null) {

            int i;
            String fechaDevolucion;
            Alquiler unAlquiler;

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
