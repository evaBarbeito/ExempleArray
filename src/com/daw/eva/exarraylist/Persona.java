package com.daw.eva.exarraylist;

public class Persona {
	private String nom;

    public Persona(String nombre) {
        this.nom = nombre;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + '}';
    }
    
}
