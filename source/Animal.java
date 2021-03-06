@ClassPreamble (
    author = "Sofia Celi",
    date = "26/01/2016",
    currentRevision = 5,
    lastModified = "27/01/2016",
    lastModifiedBy = "Sofia Celi",
    reviewers = {"Cris"}
)

abstract public class Animal {
    
    public String size, noise, food;
    public String trinomialName;
    public boolean /*@ spec_public @*/ motility;
    public boolean hunger, sleep;

    //@ public invariant motility = true;
 
    //@ assignable motility;
    //@ ensures motily = true;
   
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
    
    public void setTrinomialName(String newTrinomialName) {
        this.trinomialName = newTrinomialName;
    }
   
    public String getSize() { 
        return size;
    }
   
    public void setSize(String newSize) {
        this.size = newSize;
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
   
    public void roam(Space animalSpace) {
        if (motility) {
            animalSpace.makeLocation(animalSpace.space);
            System.out.print("Animal moved to " + animalSpace.location + " point.");
        } else {
            System.out.print("Animal doesn't have the capacity to move");
        }  
    }
         
}
