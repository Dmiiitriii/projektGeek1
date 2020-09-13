package HW7;

public class Main {
    public static void main(String[] args) {
        int food = 95;

        Cat [] cat = {
            new Cat("Barsik", "ginger" ,11,false),
            new Cat("Vasia", "white" ,19, false),
            new Cat("Tigr", "white" ,10,false),
            new Cat("Lev", "white" ,25,false),
            new Cat("Pushok", "white" ,25,false)


        };
        Plate plate = new Plate(food);
        for (int i=0; i<cat.length;i++) {
            cat[i].eat(plate);
            cat[i].setFatCat(true);
            System.out.println(cat[i].isFatCat());
                if (cat[i].getAppetite() > plate.getFood() && i < cat.length-1) {
                System.out.println("В миске недостаточно корма для других кошек");
                plate.addFood(food-plate.getFood());
                System.out.println("Еда в миске пополнена до " + plate.getFood() + " единиц");
                return;
            }
        }

        System.out.println(plate);

    }

}

