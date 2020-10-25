package com.daw.eva.exarraylist;

public class Student extends Persona {
	 
	  int id;
	  double percentage;

	  Student(String name,int id,double percentage){
	      super(name);
	      this.id = id;
	      this.percentage = percentage;

	  }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	  
	  
}
