package model;

public class Stereo {
	
	int volume;
	String name;
	
	public Stereo(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public void on() {
		System.out.println(name + " Stereo On!");
	}
	
	public void off() {
		System.out.println(name + " Stereo Off!");
	}
	
	public void setCD() {
		System.out.println(name + " Set Cd!");
	}
	
	public void setDVD() {
		System.out.println(name + " Set DVD!");
	}
	
	public void setRadio() {
		System.out.println(name + " Set Radio!");
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(name + " Volume : " + this.volume);
	}
	
	
	
}
