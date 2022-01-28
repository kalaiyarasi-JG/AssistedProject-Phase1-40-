package com.kalai.phase1;

public class JavaPillars {
	String name; 
    String type; 
    int age; 
    String color; 
    public JavaPillars(String name, String type, int age, String color) 
    { 
        this.name = name; 
        this.type = type; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String gettype() 
    { 
        return type; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return(" Name: "+ this.getName()+"\n Type: " + this.gettype()+"\n Age: "+ this.getAge()+"\n Color: "+ this.getColor());
        
    } 


	public static void main(String[] args) {
		
		JavaPillars scott = new JavaPillars("Jacky","Wolf", 2 , " black and white"); 
        System.out.println(scott.toString()); 


	}



}
