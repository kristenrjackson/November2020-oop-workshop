public class Eagle extends Bird implements Animal_I, Bird_I{
    public String name = "Eagle";
    public int lifeSpan = 15;

    @Override
    public void eat() {
        System.out.println("Eats reptiles, amphibians, and small mammals.");
    }

    @Override
    public void sound() {
        System.out.println("Has a high-pitched whistling sound.");
    }

    @Override
    public void fly() {
        System.out.println("Flies up to 10,000 feet.");
    }
}
