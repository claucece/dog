// this is too simple. Maybe I should create a grid for animal to move in
// Should give animal specific things as move left, right, advance, etc. 
// lets define them: DOG: set in grid, turn-left/right, advance, current square, facing wall, display?
// GRID: square (could be this space -start and finish-), display 

abstract public class Space {

    static int space; 
    int location;

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

