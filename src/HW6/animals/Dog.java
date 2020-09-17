package HW6.animals;

public class Dog extends Animal{
    private static int animalCount;
    static {animalCount = 0;}

        public Dog(String name, String color, int age, int maxRun, int maxSwim) {
        super(name, color, age, maxRun, maxSwim);
        animalCount++;
    }
}
