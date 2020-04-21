package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hola Mundo");

        ArrayList<Pelicula> arregloDePeliculas = new ArrayList<>();
        ArrayList<Cliente> arregloDeClientes = new ArrayList<>();
        ArrayList<Factura> arregloDeFacturas = new ArrayList<>();

        Pelicula elPadrino = new Pelicula("El Padrino", "Crimen, Drama", "20/09/1972", "R", "USA", "El viejo y querido Padrino", 175, 5);
        Pelicula rapidoYFurioso = new Pelicula("Rapido y Furioso 1", "Acción, Aventura", "22/06/2001", "PG", "USA", "La primera de R Y F", 107, 8);

        Cliente ariel = new Cliente("Ariel Cervigni", 5939221, "Buenos Aires 4675");
        Cliente leroy = new Cliente("Leroy Sane", 6008004, "Manchester City");

        Factura unaFactura = new Factura(ariel, "20/04/2020", "27/04/2020", elPadrino, rapidoYFurioso);

        arregloDePeliculas.add(elPadrino);
        arregloDePeliculas.add(rapidoYFurioso);

        arregloDeClientes.add(ariel);
        arregloDeClientes.add(leroy);

        arregloDeFacturas.add(unaFactura);

        int i;
        for (i = 0; i < arregloDeClientes.size(); i++) {
            System.out.println(arregloDeClientes.get(i).toString());
        }

        for (i = 0; i < arregloDePeliculas.size(); i++) {
            System.out.println(arregloDePeliculas.get(i).toString());
        }

        System.out.println(arregloDeFacturas.get(0).toString());
    }
}
