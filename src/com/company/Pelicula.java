package com.company;

import java.util.Date;

public class Pelicula {
    ///Cada film de su inventario cuenta con un título, una fecha de lanzamiento, una duración en minutos,
    // una clasificación de audiencia, las siglas del país de origen y una descripción de la misma

    protected String titulo;
    protected String genero;
    protected String fechaLanzamiento;
    protected int duracion;
    protected String clasificacion;
    protected String paisOrigen;
    protected String descripcion;
    protected int stock;
    protected int cantAlquiler;

    public Pelicula ()
    {
        this.titulo = null;
        this.fechaLanzamiento = null;
        this.genero = null;
        this.clasificacion = null;
        this.paisOrigen = null;
        this.stock = 0;
        this.duracion = 0;
        this.cantAlquiler = 0;
    }

    public Pelicula (String titulo, String genero, String fechaLanzamiento, String clasificacion, String paisOrigen, String descripcion, int duracion, int stock)
    {
       this.titulo = titulo;
       this.genero = genero;
       this.fechaLanzamiento = fechaLanzamiento;
       this.clasificacion = clasificacion;
       this.paisOrigen = paisOrigen;
       this.descripcion = descripcion;
       this.duracion = duracion;
       this.stock = stock;
       this.cantAlquiler = 0;
    }

    public String getTitulo () { return this.titulo; }
    public String getGenero () { return this.genero; }
    public String getFechaLanzamiento () { return  this.fechaLanzamiento; }
    public String getClasificacion () { return this.clasificacion; }
    public String getPaisOrigen () { return this.paisOrigen; }
    public String getDescripcion () { return this.descripcion; }
    public int getDuracion () { return this.duracion; }
    public int getStock () { return this.stock; }
    public int getCantAlquiler () { return this.cantAlquiler; }

    public void setTitulo (String titulo) { this.titulo = titulo; }
    public void setGenero (String genero) { this.genero = genero; }
    public void setFechaLanzamiento (String fechaLanzamiento) { this.fechaLanzamiento = fechaLanzamiento; }
    public void setClasificacion (String clasificacion) { this.clasificacion = clasificacion; }
    public void setPaisOrigen (String paisOrigen) { this.paisOrigen = paisOrigen; }
    public void setDescripcion (String descripcion) { this.descripcion = descripcion; }
    public void setDuracion (int duracion) { this.duracion = duracion; }
    public void setStock (int stock) { this.stock = stock; }
    public void setCantAlquiler (int cantAlquiler) { this.cantAlquiler = cantAlquiler; }

    @Override
    public String toString ()
    {
        return "\n****************** Película *********************" +
                "\nTitulo: " + this.titulo + "\nGenero: " + this.genero +
                "\nFecha de Lanzamiento: " + this.fechaLanzamiento + "\nClasificación: " + this.clasificacion +
                "\nPaís de Origen: " + this.paisOrigen + "\nDescripción: " + this.descripcion +
                "\nDuración: " + this.duracion + " minutos" + "\nCantidad disponibles: " + this.stock +
                "\nCantidad de veces alquilada: " + this.cantAlquiler;
    }

    }
