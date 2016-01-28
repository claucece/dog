public class Dog extends Animal implements Pet {
  
    public String name;

    public Dog() 
       {
        size = "medium";
        trinomialName = "Dog";
        noise = "Woof, Woof!";
        food = "meat";
        hunger = true;
        sleep = false;
        motility = true;
        name = "Balto";
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

    private static int numberOfDogs = 0;
    
    private int id = ++numberOfDogs;
   
    public String getName() {
         return name;
    }
 
    public void setSize(String size) {
         this.size = size;
    }
    
    public void setTrinomialName(String trinomialName) {
         this.trinomialName = trinomialName; 
    }
   
    public void setNoise(String Noise) {
         this.noise = noise;
    }

    @Override
    public void eat() {
        if (hunger) {
            System.out.println("Dog eats " + food);
        } else {
            System.out.println("Dog doesn't eat");
        }
    }
   
    @Override
    public void sleep() {
        System.out.println(sleep);
    } 
    
    @Override
    public int roam() {
        if (motility) {
            setLocation(Space.space);
            System.out.print("Dog moved to " + location + " point.");
        } else {
            System.out.print("Animal doesn't have the capacity to move");
        }
        return location;
    }

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
   
}
