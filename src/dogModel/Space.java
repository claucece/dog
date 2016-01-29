// this is too simple. Maybe I should create a grid for animal to move in
// Should give animal specific things as move left, right, advance, etc. 

abstract public class Space {

    static int space = 0; 
    int location = 0;

    public int makeSpace(int height, int width) {
        space = height * width;
        return space;
    }
    
    public int makeLocation(int space) {
        int range = (space - 1) + 1;
        location = (int)(Math.random() * range) + 1;
        return location;
    }

}

