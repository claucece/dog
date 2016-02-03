public class DogPetSpec {

    private String noise, breed;
    private Size size;
    private Food food;

    public DogPetSpec(Size size, String noise, Food food, String breed) {
        this.size = size;
        this.noise = noise;
        this.food = food;
        this.breed  = breed;
    }

    public Size getSize() {
        return size;
    }

    public String getNoise() {
        return noise;
    }

    public Food getFood() {
        return food;
    }

    public String getBreed() {
        return breed;
    }

    public boolean matches(DogPetSpec otherSpec) {
    if (size != otherSpec.size)
         return false;
    if ((noise != null) && (!noise.equals("")) &&
        (!noise.toLowerCase().equals(otherSpec.noise.toLowerCase())))
          return false;
    if (food != otherSpec.food)
          return false;
    if ((breed != null) && (!breed.equals("")) &&
        (!breed.toLowerCase().equals(otherSpec.breed.toLowerCase())))
           return false;
    return true;
    }

}

