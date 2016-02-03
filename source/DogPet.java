public class DogPet {
 
    private String noise, breed, id;
    private Size size;
    private Food food;
    private double price;

    public DogPet(Size size, String noise, Food food, String breed, String id, double price) {
        this.size = size;
        this.noise = noise;
        this.food = food;
        this.breed  = breed;
        this.price = price;
        this.id = id;
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
    
    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

}
