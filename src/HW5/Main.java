package HW5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Staff employee1 = new Staff("Иван", "Иванов", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 42);
        Staff employee2 = new Staff("Дмитрий", "Кривошея", "Игоревич", "engineer", 25000, "ivanov@mail.mail", "123456", 34);
        Staff employee3 = new Staff("Сергей", "Корж", "Алексеевич", "engineer", 25000, "ivanov@mail.mail", "123456", 51);
        Staff employee4 = new Staff("Пётр", "Краснов", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 28);
        Staff employee5 = new Staff("Евгений", "Куликов", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 92);

        Staff [] employee = new Staff[5];
        employee[0] = new Staff("Иван", "Иванов", "Иванович", "engineer", 60000, "ivanov@mail.mail", "123456", 42);
        employee[1] = new Staff("Дмитрий", "Кривошея", "Игоревич", "engineer", 50000, "ivanov@mail.mail", "123456", 34);
        employee[2] = new Staff("Сергей", "Корж", "Алексеевич", "engineer", 45000, "ivanov@mail.mail", "123456", 51);
        employee[3] = new Staff("Пётр", "Краснов", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 28);
        employee[4] = new Staff("Евгений", "Куликов", "Иванович", "engineer", 32000, "ivanov@mail.mail", "123456", 92);


                System.out.println(Arrays.toString(employee));
        employee1.info();


            for (int i=0;i<employee.length; i++ ){
                if (employee[i][7]<40){}

            }



    }

}

