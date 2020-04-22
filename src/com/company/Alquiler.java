package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Alquiler {

    //una boleta de préstamo definiendo la fecha de retiro y la fecha de devolución.
    protected Cliente unCliente;
    protected Pelicula arregloDePeliculas [] = new Pelicula[5];
    protected String retiro;
    protected String devolucion;


    /// Constructores
    public Alquiler() {
        this.unCliente = null;
        this.retiro = null;
        this.devolucion = null;
        arregloDePeliculas = null;
    }

    public Alquiler (Cliente unCliente, String retiro, String devolucion, Pelicula peli1, Pelicula peli2)
    {
        this.unCliente = unCliente;
        this.retiro = retiro;
        this.devolucion = devolucion;
        this.arregloDePeliculas[1] = peli1;
        this.arregloDePeliculas[0] = peli2;
    }

    public Cliente getUnCliente() { return this.unCliente; }
    public String getRetiro () { return this.retiro; }
    public String getDevolucion () { return  this.devolucion; }
    public Pelicula [] getArregloDePelicula() { return arregloDePeliculas; }

    public void setUnCliente (Cliente unCliente) { this.unCliente = unCliente; }
    public void setRetiro (String retiro) { this.retiro =  retiro; }
    public void setDevolucion (String devolucion) { this.devolucion = devolucion; }
    public void setArregloDePelicula (Pelicula [] arregloDePeliculas) { this.arregloDePeliculas = arregloDePeliculas; }

    public StringBuilder mostrarPelis (Pelicula [] ADP) {
        StringBuilder pelis = new StringBuilder();
        int i;
        for (i = 0; i<ADP.length;i++)
        {
            if (ADP[i] != null)
            {
                pelis.append(ADP[i].toString());
            }
        }
        return pelis;
    }

    @Override
    public String toString () {
        StringBuilder pelis = mostrarPelis(this.arregloDePeliculas);
        return "\n------------ Alquiler: ------------" +
                unCliente.toString() + pelis +
                "\nFecha de Retiro: " + this.retiro +
                "\nFecha de Devolución: " + this.devolucion;
    }




}