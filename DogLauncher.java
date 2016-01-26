public class DogLauncher {
    public static void main (String[] args) {
        Dog balto = new Dog();
        System.out.println("The animal class is " + balto.trinomialName);
        System.out.println(balto.trinomialName + " eats " + balto.eat(true, "meat"));
}
}
