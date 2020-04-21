package com.company;

import java.util.Date;

public class Factura {

    //una boleta de préstamo definiendo la fecha de retiro y la fecha de devolución.
    protected Cliente unCliente;
    protected String retiro;
    protected String devolucion;
    protected Pelicula [] arregloDePelicula = new Pelicula [5];

    /// Constructores

    public Factura() {
        this.unCliente = null;
        this.retiro = null;
        this.devolucion = null;
        this.arregloDePelicula = null;
    }

    public Factura (Cliente unCliente, String retiro, String devolucion, Pelicula peli1, Pelicula peli2)
    {
        this.unCliente = unCliente;
        this.retiro = retiro;
        this.devolucion = devolucion;
        this.arregloDePelicula[0] = peli1;
        this.arregloDePelicula[1] = peli2;

    }

    public Cliente getUnCliente() { return this.unCliente; }
    public String getRetiro () { return this.retiro; }
    public String getDevolucion () { return  this.devolucion; }
    public Pelicula[] getArregloDePelicula() { return arregloDePelicula; }

    public void setUnCliente (Cliente unCliente) { this.unCliente = unCliente; }
    public void setRetiro (String retiro) { this.retiro =  retiro; }
    public void setDevolucion (String devolucion) { this.devolucion = devolucion; }
    public void setArregloDePelicula (Pelicula [] arregloDePelicula) { this.arregloDePelicula = arregloDePelicula; }

    @Override
    public String toString () {
        StringBuilder peliculas = mostrarPeliculas();
        return "\n------------ Factura: ------------" +
                "\nCliente: " + unCliente.toString() +
                "\nPelicula: " + peliculas +
                "\nFecha de Retiro: " + this.retiro +
                "\nFecha de Devolución: " + this.devolucion;
    }

    public StringBuilder mostrarPeliculas ()
    {
        StringBuilder pelis = new StringBuilder();
        int i;

        for (i = 0; i<arregloDePelicula.length;i++) {

            pelis.append(arregloDePelicula[i].toString());
        }
        return pelis;
    }
}
