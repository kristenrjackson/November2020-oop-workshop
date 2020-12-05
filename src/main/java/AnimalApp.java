public class AnimalApp {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Eagle", 1.5, 2);

        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average weight: " + myAnimal.getAverageWeight() + " kg.");
        System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());
    }

}
