public class DogPet {
 
    private String size, noise, food, breed;
    private int id;
    private double price;

    public DogPet(String size, String noise, String food, String breed, int id, double price) {
        this.size = size;
        this.noise = noise;
        this.food = food;
        this.breed  = breed;
        this.price = price;
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public String getNoise() {
        return noise;
    }

    public String getFood() {
        return food;
    }

    public String getBreed() {
        return breed;
    }
    
    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

}
