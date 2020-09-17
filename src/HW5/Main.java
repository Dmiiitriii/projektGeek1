package HW5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Staff employee1 = new Staff("Иванов", "Иван", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 42);
        Staff employee2 = new Staff("Кривошея", "Дмитрий", "Игоревич", "engineer", 25000, "ivanov@mail.mail", "123456", 34);
        Staff employee3 = new Staff("Корж", "Сергей", "Алексеевич", "engineer", 25000, "ivanov@mail.mail", "123456", 51);
        Staff employee4 = new Staff("Краснов", "Пётр", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 28);
        Staff employee5 = new Staff("Куликов", "Евгений", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 92);

        Staff[] employee = new Staff[5];
        employee[0] = new Staff("Иванов", "Иван", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 42);
        employee[1] = new Staff("Кривошея", "Дмитрий", "Игоревич", "engineer", 25000, "ivanov@mail.mail", "123456", 34);
        employee[2] = new Staff("Корж", "Сергей", "Алексеевич", "engineer", 25000, "ivanov@mail.mail", "123456", 51);
        employee[3] = new Staff("Краснов", "Пётр", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 28);
        employee[4] = new Staff("Куликов", "Евгений", "Иванович", "engineer", 25000, "ivanov@mail.mail", "123456", 92);

        /*System.out.println(Arrays.toString(employee));
        employee1.info();
        employee2.info();
        employee3.info();
        employee4.info();
        employee5.info();*/

        for (Staff staff: employee){
            if (staff.getAge()>40)
             staff.info();
        }
        for (int i = 0; i<employee.length; i++) {
            if (employee[i].getAge() > 40)
                employee[i].info();
        }
    }

}

