public class DogLauncher {
    public static void main (String[] args) {
        Dog fido = new Dog();
        System.out.println("Lets first create a deafult " + fido.getTrinomialName());
        System.out.println("Default's dog noise is " + fido.makeNoise());
        System.out.println("Default's dog size is " + fido.getSize());
        System.out.println("Default's dog name is " + fido.getName());
        fido.setName("Pirata");
        System.out.println("Now the dog's name is " + fido.getName());
        System.out.println("=====================================");
        System.out.println("Let's create a non-default new animal");
        Dog balto = new Dog("big", "Dog", "Ruff, Ruff!", "fressen", true, false, true, "Balto");
        System.out.println("The animal class is " + balto.getTrinomialName());
        System.out.println(balto.getTrinomialName() + " has a size: " + balto.getSize());
        System.out.println(balto.getTrinomialName() + " do has a name: " + balto.getName());
        System.out.println(balto.getName() + " barks and says: " + balto.makeNoise());
        balto.eat();
        Space newAnimalSpace = new Space();
        newAnimalSpace.makeSpace(640, 480);
        balto.roam(newAnimalSpace);
        System.out.println("The space that surrounds " + balto.getName() + " is " + newAnimalSpace.makeSpace(640, 480) + " meters");
        System.out.print("Is " +  balto.getName() + " sleeping? "); 
        balto.sleep();
        System.out.println(balto.getName() + balto.beFriendly());
        System.out.println(balto.getName() + balto.play());
        System.out.println("=====================================");
        System.out.println("The id of " + balto.getName() + " was " + balto.getID()); 
        System.out.println("Number of dogs created so far " + Dog.getNumberOfDogs());
    }
}
