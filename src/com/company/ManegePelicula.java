package com.company;

import java.util.Scanner;

public class ManegePelicula extends Pelicula {

    public Pelicula nuevaPelicula ()
    {
        Pelicula unaPelicula = new Pelicula();
        Scanner bf = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la película:\t");
        unaPelicula.setTitulo(bf.nextLine());
        System.out.println("Ingrese el género de la película:\t");
        unaPelicula.setGenero(bf.nextLine());
        System.out.println("Ingrese la descripción de la película: \t");
        unaPelicula.setDescripcion(bf.nextLine());
        System.out.println("Ingrese la fecha de lanzamiento de la película:\t");
        unaPelicula.setFechaLanzamiento(bf.nextLine());
        System.out.println("Ingrese el país de origen de la película: \t");
        unaPelicula.setPaisOrigen(bf.nextLine());
        System.out.println("Ingrese la clasificación de la película: \t");
        unaPelicula.setClasificacion(bf.nextLine());
        System.out.println("Ingrese la duración de la película: (en minutos)\t");
        unaPelicula.setDuracion(bf.nextInt());
        System.out.println("Ingrese la cantidad de películas:\t");
        unaPelicula.setStock(bf.nextInt());

        return unaPelicula;
    }


}
