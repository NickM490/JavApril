public class BadGuy {

    // Member Variables
    private String name;
    private String pieFav;
    private String iceFlavor;
    private int str;

    // Constructors
    public BadGuy(String name, int str) {
        this.name = name;
        this.str = str;
    }

    


    // Need Methods (Things Bady Guys Do)

    // Method to intro instance
    public void intro(){
        System.out.println("My name is " + this.name + " and out of 100 I have a strength level of " + this.str);
    }

    // Method to increase strength
    public void stronger() {
        // Chocolocate Merengue Easter Egg
        if(this.pieFav == "Chocolocate Merengue") {
            this.str += 50;
            System.out.println("DING DING DING!!! You hit the bonus +50 strength " + this.name + "'s strength is now " + this.str);
        }
        else if(this.pieFav == "Pumpkin") {

            this.str -= 10;
            System.out.println("Sad days for you mr pumpkin eater you lose 10 health. " + this.name + "'s strength is now "+ this.str);
        }
        else {
            this.str += 10;
            System.out.println(this.name + " just ate some " + this.pieFav + " pie and now their strength is " + this.str);
        }
    }


    // Need our Getters and Setters
    public String getName() {

        System.out.println("You just set the name");
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStr() {
        return this.str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setFavPie(String pie) {
        this.pieFav = pie;
        System.out.println(this.name + "My new favorite pie is " + this.pieFav);
    }

    public String getFavPie() {
        return this.pieFav;
    }

    public void setIceFlavor(String iceFlavor) {
        this.iceFlavor = iceFlavor;
    }

    public String getIceFlavor() {
        return this.iceFlavor;
    }
}
