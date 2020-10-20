package com.daw.eva.exarraylist;

import java.util.ArrayList;

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
        
        
        
		/*
		 * Create an ArrayList named food and add 5 of your favourite food items.
		 * 
		 * Traverse the ArrayList using for loop and print all array elements.
		 * 
		 * Traverse the ArrayList using for each loop and print all array elements.
		 */
        
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburguesa");
        food.add("Tarta poma");
        food.add("Pasta");
        food.add("Cheesecake");

        for(int i=0;i<food.size();i++){
           System.out.println(food.get(i));
        }

        for(String f:food){
           System.out.println(f);
        }
	
	
	
		/*
		 * Create a student class with following attributes: name, id, percentage
		 * scored.
		 * 
		 * Create parameterised constructors in student class to initialise above
		 * values.
		 * 
		 * Create 4 objects of student class in main.java.
		 * 
		 * Create an ArrayList and add the student objects to it.
		 * 
		 * Traverse the ArrayList and print all student data.
		 */
		Student s1 = new Student("John",1,78.8);
		Student s2 = new Student("Rob",2,89.6);
		Student s3 = new Student("Tim",3,90.7);
		Student s4 = new Student("Mark",4,98.9);
	
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
	
		for(int i=0;i<s.size();i++){
		   System.out.println(s.get(i).id+" "+s.get(i).getNombre()+" "+s.get(i).percentage);
		}
	}

}
