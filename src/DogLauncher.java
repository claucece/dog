public class DogLauncher {
    public static void main (String[] args) {
        Dog balto = new Dog();
        System.out.println("The animal class is " + balto.trinomialName);
        System.out.println(balto.trinomialName +"'s size is " + balto.size);
        System.out.println(balto.trinomialName + " eats " + balto.eat(balto.hunger, balto.food) + ".");
        System.out.println(balto.trinomialName + " barks and says: " + balto.noise);
        System.out.println("Is " +  balto.trinomialName + " sleeping? " + balto.sleep);
        System.out.println("What is the space in which the dog lives? " +  balto.setSpace(balto.height, balto.width) + " meters.");
        balto.roam(balto.space);
        
    }
}
