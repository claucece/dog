import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    
    private List<DogPet> dogs;

    public Inventory() {
        dogs = new LinkedList<DogPet>();
    }

    public void addDogPet(Size size, 
                    String noise, 
                    Food food, 
                    String breed, 
                    String id,
                    double price) {
        DogPet dog = new DogPet(size, noise, food, breed, id, price);
        dogs.add(dog);
    }

    public DogPet getDog(String id) {
    for (Iterator<DogPet> i = dogs.iterator(); i.hasNext(); ) {
      DogPet dog = i.next();
      if (dog.getId().equals(id)) {
        return dog;
      }
    }
     return null;
    }

    
    public List<DogPet> search(DogPet searchDog) {
        List<DogPet> matchingDogs = new LinkedList<DogPet>();
        for (Iterator<DogPet> i = dogs.iterator(); i.hasNext();) {
            DogPet dog = i.next();
            if (searchDog.getSize() != dog.getSize())
            continue;
            String noise = searchDog.getNoise().toLowerCase();
            if ((noise != null) && (!noise.equals("")) && 
                (!noise.equals(dog.getNoise().toLowerCase())))
            continue;
            if (searchDog.getFood() != dog.getFood())
            continue;
            String breed = searchDog.getBreed().toLowerCase();
            if ((breed != null) && (!breed.equals("")) &&
                (!breed.equals(dog.getBreed().toLowerCase())))
            continue;
            matchingDogs.add(dog);
        }
        return matchingDogs;
    }

}
