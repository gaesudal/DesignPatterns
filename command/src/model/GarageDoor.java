package model;

public class GarageDoor {
	
	String name;
	
	public GarageDoor(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void up() {
		System.out.println(name + " Garage Up!");
	}
	
	public void down() {
		System.out.println(name + " Garage Down!");
	}
	
	public void stop() {
		System.out.println(name + " Garage Stop!");
	}
	
	public void lightOn() {
		System.out.println(name + " Garage Light On!");
	}
	
	public void lightOff() {
		System.out.println(name + " Garage Light Off!");
	}
}
