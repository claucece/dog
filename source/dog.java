public class Dog extends Animal implements Pet {
  
    String name;
    private static int numberOfDogs;
    private int id = ++numberOfDogs;

    // size, noise and food can be enums
    // id works as serial number. Must implement breed. 
    // need an inventory or something like that, if I want customer to search
    // must be: add dog, get dog, search

    public Dog() 
        {
         System.out.println("And the facts for the new dog are...");
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
        public void roam(Space animalSpace) {
            if (motility) {
                animalSpace.makeLocation(animalSpace.space);
                System.out.println(name + " moved to " + animalSpace.location + " point.");
            } else {
                System.out.println("Animal doesn't have the capacity to move");
            }
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
