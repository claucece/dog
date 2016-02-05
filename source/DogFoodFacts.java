public class DogFoodFacts {

    private final String brand;
    private final String size;
    private final int calories;
    private final int fat;
    private final int carbohydrate;

    public static class Builder {
        private final String brand;
        private final String size;
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
    

        public Builder(String brand, String size) {
            this.brand = brand;
            this.size = size;
        }
 
        public Builder calories(int val) 
            {calories = val;       return this; }
        public Builder fat(int val) 
            {fat = val;            return this;}
        public Builder carbohydrate(int val)
            {carbohydrate = val;   return this;}
   
        public DogFoodFacts build() {
            return new DogFoodFacts(this);
        }
   }
   
   private DogFoodFacts(Builder builder) {
        brand = builder.brand;
        size = builder.size;
        calories = builder.calories;
        fat = builder.fat;
        carbohydrate = builder.carbohydrate;
   }
   
   public String getBrand() {
         return brand;
   }

   public String getSize() {
         return size;
   }

   public int getCalories() {
         return calories;
   }
    
   public int getFat() {
          return fat;
   }

   public int getCarbohydrate(){
          return carbohydrate;
   }    

}
          

 
