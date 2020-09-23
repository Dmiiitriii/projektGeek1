package HW21;

public class Man implements Obstacles{
    private String name;
    private int age;
    private int maxJump;
    private int maxDistance;

    public Man(String name, int age, int maxJump, int maxDistance) {
        this.name = name;
        this.age = age;
        this.maxJump = maxJump;
        this.maxDistance = maxDistance;
    }

    public void jump(int height) {

        if (maxJump >= height) {
            System.out.println("Man " + name + " прыгнул на " + height + " метров");
        }
        if (maxJump < height) {
            System.out.println("Man " + name + " сошел с дистанции");
            return;
        }

    }

    public void run(int distance) {

        if (maxDistance >= distance) {
            System.out.println("Man " + name + " пробежал " + distance + " метров");
        }
        if (maxDistance < distance) {
            System.out.println("Man " + name + " сошел с дистанции");
            return;
        }

    }





}
