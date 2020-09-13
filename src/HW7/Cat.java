package HW7;

public class Cat {
    private String name;
    private String color;
    private int appetite;
    private boolean fatCat;

    public Cat(String name, String color, int appetite, boolean fatCat) {
        this.name = name;
        this.color = color;
        this.appetite = appetite;
        this.fatCat = fatCat;
    }



    public void eat(Plate plate){
        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(appetite);
    }


    public boolean isFatCat() {
        return fatCat;
    }

    public void setFatCat(boolean fatCat) {
        this.fatCat = fatCat;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAppetite() {
        return appetite;
    }

}
