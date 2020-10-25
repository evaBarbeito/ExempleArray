package com.daw.eva.exarraylist;

import java.util.ArrayList;
import java.util.Iterator;

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
        
        System.out.println("----------------");
        
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
        
        System.out.println("----------------");
        
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburguesa");
        food.add("Tarta poma");
        food.add("Pasta");
        food.add("Cheesecake");

        for(int i=0;i<food.size();i++){
           System.out.println(food.get(i));
        }

        System.out.println("----------------");
        
        for(String f:food){
           System.out.println(f);
        }
	
        System.out.println("----Contains------------");
	
        boolean a;
        a=food.contains("Pasta");
        System.out.println(food.contains("Pasta"));
        
        //food.remove(1);
        //food.size();
        
        String ss[]= new String[food.size()];
        //Passem un array list a ss: array d strings
        food.toArray(ss);
        System.out.println("Passem un array list a ss: array d strings");
        
        for(String selem:ss){
            System.out.println(selem);
         }
        
        System.out.println("------Iterator----------");
        
        Iterator it=food.iterator();
        
        while (it.hasNext()) {
        	System.out.println(it.next());
        }
        
        System.out.println("------Objects----------");
        
        
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
        
        
        //TODO: Variar i crear interface Vehicle, i implements a Car
        // Desde Java8 podem crear metodes privats, estàtics i default (amb body) a les interfícies
        
		Student s1 = new Student("Eva",1,78.8);
		Persona s2 = new Student("Matteo",2,89.6);
		Student s3 = new Student("Felix",3,90.7);
		Student s4 = new Student("Oscar",4,98.9);
	
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(s1);
		s.add((Student) s2);
		s.add(s3);
		s.add(s4);
	    
		
		for(int i=0;i<s.size();i++){
		   System.out.println(s.get(i).id+" "+s.get(i).getNombre()+" "+s.get(i).percentage);
		}
		
		System.out.println("----------------");
		
		s.set(1, new Student("Carla",5,100));
		s.set(s.size()-1,new Student("Oliver",6,98.9));
		
		for(Student st: s ){
			   System.out.println(st.id+" "+st.getNombre()+" "+st.percentage);
		}
		
		Student o=new Student("Eva",1,78.8);
		System.out.println( s.contains(o));
		System.out.println( o.compareTo(new Student("Eva",1,78.8)));
		
		System.out.println( o.compareTo(new Student("Maria",41,78.8)));
		
		
		
		
		
		
	}

}
