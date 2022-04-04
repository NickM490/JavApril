public class Cafe {
    

    public void sayThing(String name) {
        System.out.println("Hello " + name + " from Cafe");
    }

    public void sayThing(String name, String name2) {
        System.out.printf("I am %s but \n when I dance I am %s", name, name2);
    }

    public void createCafe() {
        System.out.println("Made a cafe");
    }

    public void createCafe(String name) {
        System.out.println("Made a cafe");
    }

    public void createCafe(String name, int maxOcc) {
        System.out.println("Made a cafe");
    }

}
