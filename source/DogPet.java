public class DogPet {
 
    private String id;
    private double price;
    DogPetSpec spec;

    public DogPet(String id, double price, DogPetSpec spec) {
        this.price = price;
        this.id = id;
        this.spec = spec;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
 
    public DogPetSpec getSpec() {
        return spec;
    }

}
