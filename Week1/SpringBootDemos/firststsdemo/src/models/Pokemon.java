package models;

public class Pokemon {

	private String name;
	private int attack;
	private int specAttack;
	private int defense;
	private int health;
	private boolean fainted;
	
	// Does anyone recognize this code?? 
	// Now watch what happens 
	// I start typing in VS Code
	
	// I started typing in STS
	public Pokemon() {
	}



	public Pokemon(String name, int attack, int specAttack, int defense, int health, boolean fainted) {
		super();
		this.name = name;
		this.attack = attack;
		this.specAttack = specAttack;
		this.defense = defense;
		this.health = health;
		this.fainted = fainted;
	}



	public void attack() {
		System.out.println("I'm attacking!");
	}



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAttack() {
		return attack;
	}




	public void setAttack(int attack) {
		this.attack = attack;
	}




	public int getSpecAttack() {
		return specAttack;
	}




	public void setSpecAttack(int specAttack) {
		this.specAttack = specAttack;
	}


	public int getDefense() {
		return defense;
	}




	public void setDefense(int defense) {
		this.defense = defense;
	}




	public int getHealth() {
		return health;
	}




	public void setHealth(int health) {
		this.health = health;
	}




	public boolean isFainted() {
		return fainted;
	}




	public void setFainted(boolean fainted) {
		this.fainted = fainted;
	}
	
	
	
	
	
}
