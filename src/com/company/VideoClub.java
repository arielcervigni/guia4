package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SplittableRandom;
import com.company.Alquiler;
import com.company.Pelicula;
import com.company.Cliente;

public class VideoClub {

    protected ArrayList <Cliente> listaDeClientes;
    protected ArrayList <Pelicula> listaDePeliculas;
    protected ArrayList <Alquiler> listaDeAlquileres;

    public VideoClub (ArrayList clientes, ArrayList pelis, ArrayList alqui)
    {
        this.listaDeAlquileres = alqui;
        this.listaDeClientes = clientes;
        this.listaDePeliculas = pelis;
    }

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

    public ArrayList <Alquiler> getVigentes ()
    {
        ArrayList <Alquiler> vigentes = new ArrayList<>();
        int i;
        for (i=0; i<listaDeAlquileres.size(); i++)
        {
            if (listaDeAlquileres.get(i).getDevuelta() == false)
            {
                vigentes.add(listaDeAlquileres.get(i));
            }
        }
        return vigentes;
    }

    /// Ejercicio 2
    public ArrayList getDevolucionesDelDia (String fechaDevolucion) {

        int i;
        ArrayList<Alquiler> devolucionesDelDia = new ArrayList<>();

        for (i = 0; i < listaDeAlquileres.size(); i++) {
            //String fecha = listaDeAlquileres.get(i).getDevolucion();
            if (( listaDeAlquileres.get(i).getDevolucion() == fechaDevolucion) && (listaDeAlquileres.get(i).getDevuelta()==false)) {
                devolucionesDelDia.add(listaDeAlquileres.get(i));
            }
        }
        return devolucionesDelDia;
    }

    /// Ejercicio 3
    public ArrayList getAlquilerPorCliente (Cliente unCliente)
    {
        ArrayList <Alquiler> alquilerCliente = new ArrayList<>();

        for (int i=0; i <listaDeAlquileres.size(); i++)
        {
            if (listaDeAlquileres.get(i).getUnCliente() == unCliente)
            {
                alquilerCliente.add(listaDeAlquileres.get(i));
            }
        }
        return alquilerCliente;
    }

    /// Ejercicio 5

    public ArrayList busquedaPorGenero (String aBuscar)
    {
        ArrayList<Pelicula> listaPorGenero = new ArrayList<>();

        for (int i = 0; i < listaDePeliculas.size(); i++) {
            if (listaDePeliculas.get(i).getGenero() == aBuscar)
            {
                listaPorGenero.add(listaDePeliculas.get(i));
            }
        }
        listaPorGenero.sort(Comparator.comparingInt(Pelicula::getCantAlquiler).reversed());

        return listaPorGenero;
    }

    public Pelicula buscarPelicula (String titulo)
    {
        Pelicula encontrada =null;

        for (int i =0; i<listaDePeliculas.size(); i++)
        {
            if (listaDePeliculas.get(i).getTitulo() == titulo)
            {
                encontrada = listaDePeliculas.get(i);
            }
        }
        return encontrada;
    }

    public void mostrarLista (ArrayList lista)
    {
        for (int i =0; i <lista.size(); i++)
        {
            System.out.println(lista.get(i).toString());
        }
    }

}
