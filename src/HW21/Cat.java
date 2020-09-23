package HW21;

public class Cat implements Obstacles {

    private String name;
    private int age;
    private int maxJump;
    private int maxDistance;

    public Cat(String name, int age, int maxJump, int maxDistance) {
        this.name = name;
        this.age = age;
        this.maxJump = maxJump;
        this.maxDistance = maxDistance;
    }


    @Override
    public void jump(int height) {
        if (maxJump >= height) {
        System.out.println("Cat " + name + " прыгнул на " + height + " метров");
    }
        if (maxJump < height) {
            System.out.println("Cat " + name + " сошел с дистанции");
            return;
        }

    }

    @Override
    public void run(int distance) {
        if (maxDistance >= distance) {
            System.out.println("Cat " + name + " пробежал " + distance + " метров");
        }
        if (maxDistance < distance) {
            System.out.println("Cat " + name + " сошел с дистанции");
            return;
        }

    }
















}
