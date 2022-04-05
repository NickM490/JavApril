
// We still have to have the main inside a class
public class TestTurtle {
    // Main entry point to run our code
    public static void main(String[] args) {
        
        Turtle turt1 = new Turtle();

        Turtle turt2 = new Turtle("Michalardo", "Orange", 98, "NunChucks");

        Turtle turt3 = new Turtle("Davidino", 34);

        turt1.getName();

        turt1.setName("Donny Boy");

        BadGuy bad1 = new BadGuy("Matthew", 31);
        BadGuy bad2 = new BadGuy("Gavin", 34);

        bad1.setFavPie("Pumpkin");
        bad2.setFavPie("Chocolocate Merengue");
        bad1.stronger();
        bad2.stronger();




    }

}
