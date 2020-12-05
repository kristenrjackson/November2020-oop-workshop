public class Animal {
    private String name = "animal";
    private double averageWeight;
    private int numberOfLegs;

    Animal() {
    }

    Animal(String name, double averageWeight, int numberOfLegs) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }


    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void eat() {
        System.out.println("This " + name + " eats insects.");
    }
}
