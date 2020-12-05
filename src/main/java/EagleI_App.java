public class EagleI_App {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        myEagle.eat();
        myEagle.sound();
        myEagle.fly();

        System.out.println("Number of legs: " + Bird_I.numOfLegs);
        System.out.println("Outer covering: " + Bird_I.outerCovering);
    }
}
