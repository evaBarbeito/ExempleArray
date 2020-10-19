package com.daw.eva.exarraylist;

public class ExArrayList {

	public static void main(String[] args) {
		
		
		//1. Declaramos una variable de tipo array, un array de int
        int edades[];
        
        //2. Instanciamos el array de int
        edades = new int[3];
        
        //3. Inicializamos los valores de los elementos del array
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        //4.imprimimos los valores del array
        System.out.println("array enteros indice 0:" + edades[0]);
        System.out.println("array enteros indice 1:" + edades[1]);
        System.out.println("array enteros indice 2:" + edades[2]);
        //System.out.println("arreglo enteros indice 0:" + edades[3]);
        
        //1. Declarar e instanciar un array de tipos object
        Persona personas[] = new Persona[4];
        //2. Inicializar los valores del array
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Carla");
        
        System.out.println("array personas indice 0:" + personas[0]);
        System.out.println("array personas indice 1:" + personas[1]);
        System.out.println("array personas indice 2:" + personas[2]);
        System.out.println("array personas indice 3:" + personas[3]);
        //System.out.println("Array personas indice 4:" + personas[4]);
	}

}
