package com.sadanand.gettersandsetters;

public class gettersAndSetters {
	
	
	private int id;
	private String name;
	

	public gettersAndSetters(int id,String name){
		// TODO Auto-generated method stub

System.out.println("Id in gs1 is:"+id);
System.out.println("Name in gs1 is:"+name);

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
