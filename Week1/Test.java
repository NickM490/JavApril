import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        System.out.println("Test from the Test");

        Cafe newCafe = new Cafe();

        newCafe.sayThing("Nicky Know No's");
        newCafe.sayThing("Nicky Know No's", "Mr Janglz");

        int[] myArray = { 4, 8, 8, 5, 9 };
        System.out.println("****************************");
        System.out.println(myArray);
        System.out.println("****************************");
        ;

        
        int x = 5;

        int[] thisA = {2,5,6,9,8};

        for (int num : myArray) {
            // System.out.println(num);
            System.out.println(myArray[num]);
        }

        String[] fruits = { "banana", "pear", "papaya", "kiwi" };
        // To swap the value at index 0 and index 3
        String temp = fruits[0]; // assigns temp to "banana"

        fruits[0] = fruits[3]; // { "kiwi", "pear", "papaya", "kiwi"}
        fruits[3] = temp; // { "kiwi", "pear", "papaya", "banana"}

        ArrayList<Integer> myArray2 = new ArrayList<Integer>();

        // Add items to the array (expanding the size)
        myArray2.add(10); // { 10 }
        myArray2.add(11); // { 10, 11 }
        // To read values from the array,
        // use .get() passing in the index
        Integer num = myArray2.get(0); // 10

        // Overwrite values in the array
        // use .set() passing in the index
        // and the value you want to change it to
        myArray2.set(0, 9); // { 9, 11 }



        ArrayList<String> snacks = new ArrayList<String>();



        snacks.add("Apples");
        snacks.add("Pretzels");
        snacks.add("Almonds");
        snacks.add("Yogurt");
        // Array
        for(int i = 0; i < myArray.length; i++ ) {
            System.out.println(myArray[i]);
            }
        // ArrayList
        for(int i=0; i<snacks.size(); i++) {
            if(snacks.get(i).charAt(0) == 'A') {
                snacks.remove(i);
            }
        }

        for (String snack : snacks) {
            if (snack.charAt(0) == 'A') {
                snacks.remove(snack);
            }
        }

        // this will encounter an error like
        // Exception in thread "main" java.util.ConcurrentModificationException

    }
}