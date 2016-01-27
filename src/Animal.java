@ClassPreamble (
   author = "Sofia Celi",
   date = "26/01/2016",
   currentRevision = 5,
   lastModified = "27/01/2016",
   lastModifiedBy = "Sofia Celi",
   reviewers = {"Cris"}
)

abstract public class Animal {
    
    private String size;
    private String trinomialName;
    private String noise;
    private boolean motility;
     
    public String getSize() { 
        return size;
    }

    public String getName() {
        return trinomialName;
    } 

    public String makeNoise() {
        return noise;
    }

    public String eat(boolean hunger, String food) {
        if (hunger = true) {
        }
        return food;
    }

    public void sleep() {
    
    }

    public int setSpace(int height, int width) {
         int space = height * width;
         return space;
    }     
         
    public int roam(int space) {
         int location = 0;
         if (motility = true) {
             int range = (space - 1) + 1;    
             location = (int)(Math.random() * range);
             // location = (int)(Math.random() * range) + 1;
             System.out.print("Animal moved to " + location + " point.");
         }
         return location;
    }
         

}
