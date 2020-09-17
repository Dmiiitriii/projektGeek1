package HW6;

import HW6.animals.Animal;
import HW6.animals.Cat;
import HW6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Tishka", "ginger", 7, 200, 0);
        Dog dog = new Dog("Volchek", "brown", 3, 500, 10);
        Dog dog2 = new Dog("Genry", "black", 12, 300, 10);

        cat.info();
        dog.info();
        dog2.info();

        dog.run(340);
        dog.swim(9);
        dog2.swim(45);
        dog2.run(800);

        cat.run(22);
        cat.swim(0);

        System.out.println("Всего участвовало животных: " + Animal.getAnimalCount());
    }
}
