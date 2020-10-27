package com.daw.eva.exarraylist;

public class Persona implements Comparable<Persona>{
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

	@Override
	public int compareTo(Persona arg0) {
		int i=0;
		if (arg0.getNombre()==this.getNombre()) { i=1;}
		else {i=0;	}
		
		return i;
		
	}
    
}
