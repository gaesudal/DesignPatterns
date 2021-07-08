package model;

public class Light {
	
	String name;
	
	public Light(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void on() {
		System.out.println(name + " Light On!");
	}
	
	public void off() {
		System.out.println(name + " Light Off!");
	}
}
