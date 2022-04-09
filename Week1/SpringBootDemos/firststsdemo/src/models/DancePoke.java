package models;

// Dancing PokeMon That Specialize in Dance
public class DancePoke extends Pokemon implements Dancer, Fighters{

	
	
	public DancePoke() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DancePoke(String name, int attack, int specAttack, int defense, int health, boolean fainted) {
		super(name, attack, specAttack, defense, health, fainted);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("DancePoke Dancing!!");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("I'm a dancer not a fighter.");
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		System.out.println("Best dance defense in thew world!");
	}

	
	
	
	
}
