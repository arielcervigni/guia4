package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ejercicio1();
        
    }

    public static void ejercicio1() {
        /// Inicializo todos los array list y un objeto videoClub para poder acceder a sus métodos.
        VideoClub unVideoClub = new VideoClub();
        ArrayList<Pelicula> arregloDePeliculas = new ArrayList<>();
        ArrayList<Cliente> arregloDeClientes = new ArrayList<>();
        ArrayList<Alquiler> arregloDeAlquileres = new ArrayList<>(); // Este tiene que tener todas las listas de los clientes.

        //Instancio Peliculas
        Pelicula elPadrino = new Pelicula("El Padrino", "Crimen, Drama", "20/09/1972", "R", "USA", "El viejo y querido Padrino", 175, 5);
        Pelicula rapidoYFurioso = new Pelicula("Rapido y Furioso 1", "Acción, Aventura", "22/06/2001", "PG", "USA", "La primera de R Y F", 107, 8);
        // Instancio Clientes
        Cliente ariel = new Cliente("Ariel Cervigni", 5939221, "Buenos Aires 4675");
        Cliente leroy = new Cliente("Leroy Sane", 6008004, "Manchester City");
        // Instancio Alquileres
        Alquiler unAlquiler = new Alquiler(ariel, "20/04/2020", "27/04/2020", elPadrino, rapidoYFurioso);
        Alquiler alquiler2 = new Alquiler(leroy, "21/04/2020", "28/04/2020", elPadrino, null);

        ///Acá trabajo con el alquier, tendria que hacerse automatico.
        unVideoClub.nuevoAlquiler(unAlquiler); /// Este método setea el +1 en cantidad de veces alquilados
        unVideoClub.nuevoAlquiler(alquiler2);

        /// Completo ArrayLists
        arregloDePeliculas.add(elPadrino);
        arregloDePeliculas.add(rapidoYFurioso);
        arregloDeClientes.add(ariel);
        arregloDeClientes.add(leroy);
        arregloDeAlquileres.add(unAlquiler);
        arregloDeAlquileres.add(alquiler2);

        /// Declaro un String Builder que va a decir las devoluciones de hoy.
        ///¿Quizas se puede mostrar dentro del metodo?

        StringBuilder devoluciones = unVideoClub.devolucionesDelDia(arregloDeAlquileres, "20/04/2020");
        if (devoluciones.length() != 0) {
            System.out.println(devoluciones);
        }
        else
            System.out.println("No hay devoluciones para el día de hoy.");
    }
}

/*
        int i;
        for (i = 0; i < arregloDeClientes.size(); i++) {
            System.out.println(arregloDeClientes.get(i).toString());
        }

        for (i = 0; i < arregloDePeliculas.size(); i++) {
            System.out.println(arregloDePeliculas.get(i).toString());
        }
        */