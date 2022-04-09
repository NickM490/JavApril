package models;

public interface BasicPhrases {

	void ring();
	
	
	default void greeting() {
		System.out.println("Hello, nice to meet you");
	}
	
	default void eating() {
		System.out.println("I am eating");
	}
	
	default void goodbye() {
		System.out.println("Goodbye, see you tomorrow!");
	}
	
}
