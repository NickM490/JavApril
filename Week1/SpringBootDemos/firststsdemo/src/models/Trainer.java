package models;

public class Trainer extends Human implements Dancer, Fighters{

	private int numOfPoke;

	
	
	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Trainer Dancing!!");
	}



	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Time to fight the badguys!");
	}



	@Override
	public void defend() {
		// TODO Auto-generated method stub
		System.out.println("I will defend you, I need my Pokemon");
	}
	
	
	
}
