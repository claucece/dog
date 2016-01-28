// package dogModel;

public class Dog extends Animal implements Pet {
  
    public Dog() 
       {
        size = "medium";
        trinomialName = "Dog";
        noise = "Woof, Woof!";
        food = "meat";
        hunger = true;
        sleep = false;
        motility = true;
       }
 
    // public String food = "meat";
    // public boolean hunger = true;
    // public boolean sleep = false;
    public int height = 640;
    public int width =  480;
    public int space = height * width;
    public String name = "Balto";   
    public boolean motility = true;
 
    public Dog(String startSize, 
               String startTrinomialName,
               String startNoise,
               String startFood,
               boolean startHunger,
               boolean startSleep,
               boolean startMotility
               ) {
        super(startSize, startTrinomialName, startNoise, startFood, startHunger, startSleep, startMotility);
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
