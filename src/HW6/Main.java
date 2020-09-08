package HW6;

import HW6.animals.Cat;
import HW6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tishka", "ginger", 7, 200, 0);
        Dog dog = new Dog("Volchek", "brown", 3, 500, 10);

        cat.info();
        dog.info();

        dog.run(550);
        dog.swim(11);

        cat.run(20);
        cat.swim(1);


    }
}
