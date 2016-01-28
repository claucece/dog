// import dogModel.Dog;

public class DogLauncher {
    public static void main (String[] args) {
        Dog fido = new Dog();
        System.out.println("Lets first create a deafult " + fido.getTrinomialName());
        System.out.println("Default's dog noise is " + fido.makeNoise());
        System.out.println("Default's dog size is " + fido.getSize());
        System.out.println("=====================================");
        System.out.println("Let's create a non-default new animal");
        Dog balto = new Dog("big", "Dog", "Ruff, Ruff!", "fressen", true, false, true, "Balto");
        System.out.println("The animal class is " + balto.getTrinomialName());
        System.out.println(balto.getTrinomialName() + " has a size: " + balto.getSize());
        System.out.println(balto.getTrinomialName() + " do has a name: " + balto.getName());
        System.out.println(balto.getTrinomialName() + " barks and says: " + balto.makeNoise());
        balto.eat();
        System.out.println("The space that surrounds the dog is " + balto.setSpace(640, 480) + " meters");
        balto.roam();
        //System.out.print("Is " +  balto.getTrinomialName() + " sleeping? "); 
        //balto.sleep();
        //System.out.println("What is the space in which the dog lives? " +  balto.setSpace(balto.height, balto.width) + " meters.");
        // balto.space;
        //System.out.println();
        //System.out.println(balto.getTrinomialName() + " name is: " + balto.setName(balto.name));
        //System.out.println(balto.setName(balto.name) + balto.beFriendly());
        //System.out.println(balto.setName(balto.name) + balto.play());
        //System.out.println("The id of " + balto.setName(balto.name) + " is " + balto.getID()); 
        //System.out.println("Number of dogs created so far " + Dog.getNumberOfDogs());
    }
}
