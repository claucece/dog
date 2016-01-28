// package dogModel;

@ClassPreamble (
    author = "Sofia Celi",
    date = "26/01/2016",
    currentRevision = 5,
    lastModified = "27/01/2016",
    lastModifiedBy = "Sofia Celi",
    reviewers = {"Cris"}
)

abstract public class Animal extends Space {
    
    public String size, noise, food;
    public String trinomialName;
    public boolean motility, hunger, sleep;
   
    public Animal() 
     {
       size = "big";
       trinomialName = "Animal";
       noise = "animal makes noise";
       food = "animal's food";
       hunger = true;
       sleep = false;
       motility = true;
     }
   
    public Animal(String startSize,
               String startTrinomialName,
               String startNoise,
               String startFood, 
               boolean startHunger,
               boolean startSleep,
               boolean startMotility
               ) {
        size = startSize;
        trinomialName = startTrinomialName;
        noise = startNoise;
        food = startFood;
        hunger = startHunger;
        sleep = startSleep;
        motility = startMotility;
    }
    
    public String getTrinomialName() {
        return trinomialName;
     } 

    public String getSize() { 
        return size;
    }

    public String makeNoise() {
        return noise;
    }

    public void eat() {
        if (hunger) {
            System.out.println("Animal eats" + food);
        } else {
            System.out.println("Animal doesn't eat");
        }
    }

    abstract public void sleep();
   
    // create new class with this two methods 
 
    // public int setSpace(int height, int width) {
    //     int space = height * width;
    //     return space;
    // }     
         
    // public int roam(int space) {
    //     int location = 0;
    //     if (motility) {
    //         int range = (space - 1) + 1;    
    //         location = (int)(Math.random() * range) + 1;
    //         System.out.print("Animal moved to " + location + " point.");
    //     }
    //     return location;
    //  }
         
}
