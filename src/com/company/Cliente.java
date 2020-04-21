package com.company;

public class Cliente {

    /// Por otro lado, nuestro cliente nos cuenta que le interesa saber acerca de
    // quienes alquilan sus películas, su nombre, teléfono y dirección.

    protected String nombre;
    protected int telefono;
    protected String direccion;

    public Cliente ()
    {
        this.nombre = null;
        this.telefono = 0;
        this.direccion = null;
    }

    public Cliente (String nombre, int tel, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = tel;
    }

    public String getNombre () { return this.nombre; }
    public String getDireccion () { return  this.direccion; }
    public int getTelefono () { return this.telefono; }

    public void setNombre (String nombre) { this.nombre = nombre; }
    public void setDireccion (String direccion) { this.direccion = direccion; }
    public void setTelefono (int telefono) {this.telefono = telefono; }

    @Override
    public String toString ()
    {
        return "\n+++++++++++++++++ Cliente +++++++++++++++" +
                "\nNombre: " + this.nombre +
                "\nDireccion: " + this.direccion +
                "\nTeléfono: " + this.telefono;
    }
}
