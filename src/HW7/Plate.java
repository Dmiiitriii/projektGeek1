package HW7;

public class Plate {
    private int food = 100;
    public Plate (int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Plate{" + "food=" + food + '}';
    }

    public void decreaseFood(int appetite) {
        this.food -= appetite;
    }

    public void addFood(int addFood) {
        this.food += addFood;
    }




}
