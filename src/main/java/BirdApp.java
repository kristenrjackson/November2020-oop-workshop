public class BirdApp {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Bird myBird = new Bird();

        myBird.fly();
        myBird.fly(1000);
        myBird.fly("Eagle", 10000);
        myBird.eat();

        myAnimal.eat();


    }
}
