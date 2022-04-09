package models;

public interface Fighters {

//	void fight();
	void defend();
	
	
	default void fight() {
		System.out.println("It's time to fight!!");
	}
	
}
