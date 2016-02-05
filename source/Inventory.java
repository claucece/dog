import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    
    private List<DogPet> dogs;

    public Inventory() {
        dogs = new LinkedList<DogPet>();
    }

    public void addDogPet( 
                    String id,
                    double price,
                    DogPetSpec spec) {
        DogPet dog = new DogPet(id, price, spec);
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

    
    public List<DogPet> search(DogPetSpec searchSpec) {
        List<DogPet> matchingDogs = new LinkedList<DogPet>();
        for (DogPet i : dogs) { //for-each loop. Looks better.
            DogPet dog = i;
            if (dog.getSpec().matches(searchSpec))
                matchingDogs.add(dog);
        }
        return matchingDogs;
    }

}
