package org.system;

public class Desktop extends Computer{

	public void desktopsize()
	{
		System.out.println("15 inch");
	}
	
	
	public static void main(String[] args) {
		
		Desktop desk= new Desktop();
		
		desk.computerModel();
		desk.desktopsize();
		

	}

}
