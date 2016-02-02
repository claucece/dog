import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    
    private List dogs;

    public Inventory() {
        dogs = new LinkedList();
    }

    public void addDogPet(String size, 
                    String noise, 
                    String food, 
                    String breed, 
                    int id,
                    double price) {
        DogPet dog = new DogPet(size, noise, food, breed, id, price);
        dogs.add(dog);
    }

    public DogPet getDog(int id) {
        for (Iterator i = dogs.iterator(); i.hasNext();) {
            DogPet dog = (DogPet)i.next();
            if (dog.getId() == id) {
               return dog;
            }
        }
        return null;
    }
    
    public DogPet search(DogPet searchDog) {
        for (Iterator i = dogs.iterator(); i.hasNext();) {
            DogPet dog = (DogPet)i.next();
            String size = searchDog.getSize();
            if ((size != null) && (!size.equals("")) && 
                (!size.equals(dog.getSize())))
            continue;
            String noise = searchDog.getNoise();
            if ((noise != null) && (!noise.equals("")) && 
                (!noise.equals(dog.getNoise())))
            continue;
            String food = searchDog.getFood();
            if ((food != null) && (!food.equals("")) &&
                (!food.equals(dog.getFood())))
            continue;
            String breed = searchDog.getBreed();
            if ((breed != null) && (!breed.equals("")) &&
                (!breed.equals(dog.getBreed())))
            continue;
        }
        return null;
    }

}
