package dogModel;

public class Dog extends Animal implements Pet {
    
    public String food = "meat";
    public boolean hunger = true;
    public boolean sleep = false;
    public int height = 640;
    public int width =  480;
    public int space = setSpace(height, width);
    public String name = "Balto";   
 
    public Dog(String startSize, 
               String startTrinomialName,
               String startNoise,
               boolean startMotility
               ) {
    super(startSize, startTrinomialName, startNoise, startMotility);
    }    

    private static int numberOfDogs = 0;
    
    private int id = ++numberOfDogs;

    public String beFriendly() {
        return " is friendly.";
    }
    
    public String play() {
        return " is playfull.";
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
   
    @Override 
        public void sleep() { 
        System.out.println(sleep);
    }
   
}
