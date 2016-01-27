public class Dog extends Animal implements Pet {
   
    String trinomialName = "Dog";
    String size = "big";
    String noise = "Ruff, Ruff!";
    String food = "meat";
    boolean motility = true;
    boolean hunger = true;
    boolean sleep = false;
    int height = 640;
    int width =  480;
    int space = setSpace(height, width);
    String name = "Balto";

    private static int numberOfDogs = 0;
    
    private int id = ++numberOfDogs;

    public String beFriendly() {
        return "Dog is friendly.";
    }
    
    public String play() {
        return "Dog is playfull.";
    }
    
    public String setName(String name) {
        return name;
    }
 
    public int getID() {
        return id;
    }
    
    public static int getNumberOfDogs() {
        return numberOfDogs;
    }

}
     
