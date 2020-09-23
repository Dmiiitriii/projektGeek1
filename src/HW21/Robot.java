package HW21;

public class Robot implements Obstacles{
    private String name;
    private int age;
    private int maxJump;
    private int maxDistance;


    public Robot(String name, int age, int maxJump, int maxDistance) {
        this.name = name;
        this.age = age;
        this.maxJump = maxJump;
        this.maxDistance = maxDistance;
    }
    @Override
    public void jump(int height) {

        if (maxJump >= height) {
            System.out.println("Robot " + name + " прыгнул на " + height + " метров");
        }
        if (maxJump < height) {
            System.out.println("Robot " + name + " сошел с дистанции");
            return;
        }

    }
    @Override
    public void run(int distance) {

        if (maxDistance >= distance) {
            System.out.println("Robot" + name + " пробежал " + distance + " метров");
        }
        if (maxDistance < distance) {
            System.out.println("Robot" + name + " сошел с дистанции");
            return;
        }

    }


}
