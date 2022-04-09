package models;

public class Human implements BasicPhrases{


	private String name;
	private int age;
	
	@Override	
	public void greeting() {
		System.out.println("Hi my name it " +   this.name);
	}
	
}
