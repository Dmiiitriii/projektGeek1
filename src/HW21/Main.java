package HW21;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(11);

        //Robot robot1 = new Robot("Tronik",100,1,100);
        //Cat cat1 = new Cat("Ginger", 5, 2, 10);
        //Man man1 = new Man("Georgiy", 28,1,10);

        Obstacles [] competition = {
                new Robot("Tronik",100,1,100),
                new Cat("Ginger", 5, 2, 10),
                new Man("Georgiy", 28,1,10)

        };

        for (Obstacles i : competition){
            i.jump(wall.height()) ;
            i.run(treadmill.distance());

        }

        /*robot1.jump(wall.height());
        robot1.run(treadmill.distance());
        cat1.jump(wall.height());
        cat1.run(treadmill.distance());
        man1.jump(wall.height());
        man1.run(treadmill.distance());*/











    }
}
