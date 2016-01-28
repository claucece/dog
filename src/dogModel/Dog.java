public class Dog extends Animal implements Pet {
  
    private String name;
    private static int numberOfDogs = 0;
    private int id = ++numberOfDogs;

    public Dog() 
        {
         size = "medium";
         trinomialName = "Dog";
         noise = "Woof, Woof!";
         food = "meat";
         hunger = true;
         sleep = false;
         motility = true;
         name = "Fido";
        }
 
    public Dog(String startSize, 
               String startTrinomialName,
               String startNoise,
               String startFood,
               boolean startHunger,
               boolean startSleep,
               boolean startMotility,
               String startName
               ) {
        super(startSize, startTrinomialName, startNoise, startFood, startHunger, startSleep, startMotility);
        name = startName;
    }    

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
 
    public void setSize(String newSize) {
        this.size = newSize;
    }
    
    public void setTrinomialName(String newTrinomialName) {
        this.trinomialName = newTrinomialName; 
    }
   
    public void setNoise(String newNoise) {
        this.noise = newNoise;
    }

    @Override
    public void eat() {
        if (hunger) {
            System.out.println(name + " eats " + food);
        } else {
            System.out.println(name + " doesn't eat");
        }
    }
   
    @Override
    public void sleep() {
        System.out.println(sleep);
    } 
    
    @Override
    public int roam() {
        if (motility) {
            makeLocation(Space.space);
            System.out.println(name + " moved to " + location + " point.");
        } else {
            System.out.println("Animal doesn't have the capacity to move");
        }
        return location;
    }

    public String beFriendly() {
        return " is friendly.";
    }
    
    public String play() {
        return " is playfull.";
    }
    
    public int getID() {
        return id;
    }
    
    public static int getNumberOfDogs() {
        return numberOfDogs;
    }
   
}
