import dogModel.Dog;

public class DogLauncher {
    public static void main (String[] args) {
        Dog balto = new Dog("big", "Dog", "Ruff, Ruff!", true);
        System.out.println("The animal class is " + balto.getTrinomialName());
        System.out.println("The animal size is " + balto.getSize());
        System.out.println(balto.getTrinomialName() + " barks and says: " + balto.makeNoise());
        System.out.println(balto.getTrinomialName() + " eats " + balto.eat(balto.hunger, balto.food) + ".");
        System.out.print("Is " +  balto.getTrinomialName() + " sleeping? "); 
        balto.sleep();
        System.out.println("What is the space in which the dog lives? " +  balto.setSpace(balto.height, balto.width) + " meters.");
        balto.roam(balto.space);
        System.out.println();
        System.out.println(balto.getTrinomialName() + " name is: " + balto.setName(balto.name));
        System.out.println(balto.setName(balto.name) + balto.beFriendly());
        System.out.println(balto.setName(balto.name) + balto.play());
        System.out.println("The id of " + balto.setName(balto.name) + " is " + balto.getID()); 
        System.out.println("Number of dogs created so far " + Dog.getNumberOfDogs()); 
    }
}
