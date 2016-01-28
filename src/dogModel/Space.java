abstract public class Space {

    static int space = 0; 
    int location = 0;

    public int setSpace(int height, int width) {
        space = height * width;
        return space;
    }
   
    public int setLocation(int space) {
        int range = (space - 1) + 1;
        location = (int)(Math.random() * range) + 1;
        return location;
    }


}

