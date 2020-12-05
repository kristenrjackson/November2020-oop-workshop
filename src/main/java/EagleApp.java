public class EagleApp {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        System.out.println("Name: " + myEagle.name);
        System.out.println("Reproduction: " + myEagle.reproduction);
        System.out.println("Outer covering: " + myEagle.outCovering);
        System.out.println("Life span: " + myEagle.lifeSpan);
        System.out.println("Number of legs: " + Bird_I.numOfLegs);
        myEagle.flyUp();
        myEagle.flyDown();
    }
}
