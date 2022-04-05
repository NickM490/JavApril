
class Turtle {
    
    private String name;
    private String bandColor;
    private int age;
    private String weapon;
    
    // Empty Constructor
    public Turtle () {}
    
    // Full Constructor
    public Turtle(String name, String bandColor, int age, String weapon) {
        this.name = name;
        this.bandColor = bandColor;
        this.age = age;
        this.weapon = weapon;
    }

    // Constructor requiring just a name
    public Turtle(String name) {
        this.name = name;
    }
    public Turtle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor requiring a name and a bandColor
    public Turtle(String name, String bandColor) {
        this.name = name;
        this.bandColor = bandColor;
    }

    // Always Make our Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    



}