package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /// Inicializo todos los array list y un objeto videoClub para poder acceder a sus métodos.

        ArrayList<Pelicula> arregloDePeliculas = new ArrayList<>();
        ArrayList<Cliente> arregloDeClientes = new ArrayList<>();
        ArrayList<Alquiler> arregloDeAlquileres = new ArrayList<>(); // Este tiene que tener todas las listas de los clientes.


        //Instancio Peliculas
        Pelicula elPadrino = new Pelicula("El Padrino", "Drama", "20/09/1972", "R", "USA", "El viejo y querido Padrino", 175, 5);
        Pelicula rapidoYFurioso = new Pelicula("Rapido y Furioso 1", "Drama", "22/06/2001", "PG", "USA", "La primera de R Y F", 107, 8);
        Pelicula interestelar = new Pelicula("Interestelar", "Aventura", "14/04/2014", "PG-13", "USA", "Viajes intergalacticos y demas", 124, 8);
        Pelicula elConjuro = new Pelicula("El conjuro", "Terror", "27/02/2012", "R", "USA", "Espiritus malos", 94, 6);
        Pelicula deadpool = new Pelicula("Deadpool", "Accion", "08/08/02015", "NC-17", "USA", "Reconstruccion de una persona en heroe", 98, 9);


        // Instancio Clientes
        Cliente ariel = new Cliente("Ariel Cervigni", 5939221, "Buenos Aires 4675");
        Cliente leroy = new Cliente("Leroy Sane", 6008004, "Manchester City");
        Cliente pepita = new Cliente("Pepita La pistolera",685160, "No se donde vive");
        // Instancio Alquileres
        Alquiler unAlquiler = new Alquiler(ariel, "20/04/2020", "27/04/2020", elPadrino, rapidoYFurioso);
        Alquiler alquiler2 = new Alquiler(leroy, "21/04/2020", "28/04/2020", elPadrino, null);



        /// Completo ArrayLists
        arregloDePeliculas.add(elPadrino);
        arregloDePeliculas.add(rapidoYFurioso);
        arregloDePeliculas.add(interestelar);
        arregloDePeliculas.add(deadpool);
        arregloDePeliculas.add(elConjuro);
        arregloDeClientes.add(ariel);
        arregloDeClientes.add(leroy);
        arregloDeClientes.add(pepita);
        arregloDeAlquileres.add(unAlquiler);
        arregloDeAlquileres.add(alquiler2);


        ///Acá trabajo con el alquiler, tendria que hacerse automatico.
        VideoClub unVideoClub = new VideoClub(arregloDeClientes, arregloDePeliculas, arregloDeAlquileres);
        unVideoClub.nuevoAlquiler(unAlquiler); /// Este método setea el +1 en cantidad de veces alquilados
        unVideoClub.nuevoAlquiler(alquiler2);

        unAlquiler.setDevuelta(false);
        alquiler2.setDevuelta(false);

        /// Ejercicio 1
        ArrayList <Alquiler> arregloVigente = unVideoClub.getVigentes();

        if (arregloVigente.isEmpty()) {
            System.out.println("No hay alquileres vigentes");
        } else {
            unVideoClub.mostrarLista(arregloVigente);
        }

        System.out.println("Ejercicio 2");
        /// Ejercicio 2
        ArrayList <Alquiler> arregloDelDia = unVideoClub.getDevolucionesDelDia("27/04/2020");

        if (!arregloVigente.isEmpty())
        {
            unVideoClub.mostrarLista(arregloDelDia);

        }
        else
            System.out.println("No hay alquileres para devolver en el día de hoy");

        /// Ejercicio 3
        System.out.println("Ejercicio 3");

        ArrayList <Alquiler> alquilerCliente = unVideoClub.getAlquilerPorCliente(pepita);

        if (!alquilerCliente.isEmpty())
        {
            unVideoClub.mostrarLista(alquilerCliente);
        }
        else
            System.out.println("El cliente ingresado no tiene alquileres.");

        /// Ejercicio 4
        System.out.println("Ejercicio 4");
        /// Quiere una forma de consultar los títulos que fueron más alquilados.

        arregloDePeliculas.sort(Comparator.comparingInt(Pelicula::getCantAlquiler).reversed());
        unVideoClub.mostrarLista(arregloDePeliculas);

        /// Ejercicio 5
        /// También quiere poder buscar títulos por género y ordenarlos según popularidad

        System.out.println("Ejercicio 5");
        ArrayList <Pelicula> generoPorPopularidad = new ArrayList<>();

        generoPorPopularidad = unVideoClub.busquedaPorGenero("Drama");
        if (!generoPorPopularidad.isEmpty())
            unVideoClub.mostrarLista(generoPorPopularidad);
        else
            System.out.println("No hay peliculas en ese genero");


        /// Ejercicio 6
        System.out.println("Ejercicio 6");
        Pelicula unaPelicula = unVideoClub.buscarPelicula("Madagascar");

        if (unaPelicula!= null)
            System.out.println(unaPelicula.toString());
        else
            System.out.println("No se encontró pelicula");
    }

}

