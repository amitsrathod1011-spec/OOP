package com.abstraction;

public class SmartPhone implements SmartphCamera , SmartphMusicplayer {
	@Override
	public void takePhoto() {
		 System.out.println("Taking Photo using smartphone Camera. ");
	 }
	 
	@Override
	 public void playmusic() {
		 System.out.println("Playing music on smartphone.");
	 }
	
	public static void main(String[] args) {
		SmartPhone 	c=new SmartPhone();
		c.takePhoto();
		
		
		c.playmusic();
	}
}
