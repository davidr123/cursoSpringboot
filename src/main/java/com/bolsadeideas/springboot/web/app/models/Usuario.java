package com.bolsadeideas.springboot.web.app.models;

public class Usuario {

    private String nombre;
    private String apellido;

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    
}
