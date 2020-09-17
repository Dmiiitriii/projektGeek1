package HW6.animals;

public class Animal {
    String name;
    String color;
    int age;
    int maxSwim;
    int maxRun;

    private static int animalCount;
    static {animalCount = 0;}

    public static int getAnimalCount(){
        return animalCount;
    }

    public void swim(int distance) {
        if (distance <= maxSwim && distance>0 ) {
            System.out.printf("%s проплыл %d метров!\n", name, distance);
        }
        if (distance > maxSwim && maxSwim !=0) {
            System.out.printf("%s проплыл только %d метров!\n", name, maxSwim);
        }
        if (maxSwim == 0) {
            System.out.printf("%s не умеет плавать\n", name);
        }
    }

    public void run(int distance) {
        if (distance <= maxRun && distance>0 ) {
            System.out.printf("%s пробежал %d метров!\n", name, distance);
        }
        if (distance > maxRun && maxRun !=0) {
            System.out.printf("%s пробежал только %d метров!\n", name, maxRun);
        }
        if (maxRun == 0) {
            System.out.printf("%s не умеет бегать\n", name);
        }
    }

    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }

    public Animal(String name, String color, int age, int maxRun, int maxSwim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        animalCount++;
    }
}
