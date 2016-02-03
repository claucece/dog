import java.util.Iterator;
import java.util.List;

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
        System.out.println("=====================================");
        System.out.println("Now that you know dogs do exist... don't you want to buy some?");
        
        Inventory dogInventory = new Inventory();
        initializeInventory(dogInventory);
       
        DogPet whatCustomerWants = new DogPet(Size.BIG, "Ruff, Ruff!", Food.FISH, "Cocker Spaniel", "1", 0);
        List<DogPet> matchingDogs = dogInventory.search(whatCustomerWants);
        if (!matchingDogs.isEmpty()) {
            System.out.println("You may like this dog:");
            for (Iterator<DogPet> i = matchingDogs.iterator(); i.hasNext();) {
                 DogPet dog = i.next();
                 System.out.println("We have a dog which size is " + dog.getSize() + " , it makes this noise " +  dog.getNoise() + "\nIt eats " + dog.getFood() + " , its breed is " + dog.getBreed() + " and its price is: " + dog.getPrice());
            }
        } else {
            System.out.println("No match");
        }
        }

    private static void initializeInventory(Inventory inventory) {
    inventory.addDogPet(Size.BIG, "Ruff, Ruff!", Food.FISH, "Cocker Spaniel", "1", 500.12);
    inventory.addDogPet(Size.SMALL, "Woof, woof!", Food.MEAT, "Beagle", "2", 600.23);
    inventory.addDogPet(Size.MEDIUM, "Ruff!", Food.FRESSEN, "Schnauzer", "3", 400.34);
    inventory.addDogPet(Size.SMALL, "Woof!", Food.MEAT, "Poodle", "4", 500.45);
  }

}