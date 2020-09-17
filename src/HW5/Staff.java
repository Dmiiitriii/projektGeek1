package HW5;

public class Staff {

    private String name;
    private String lastName;
    private String middleName;
    private String position;
    private int salary;
    private String email;
    private String telephoneNumber;
    private int age;

    public Staff(String lastName, String name, String middleName, String position, int salary, String email, String telephoneNumber, int age){
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.age = age;

    }


    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", age=" + age +
                '}'+ System.lineSeparator();
    }

    public void info () {
        System.out.printf("Сотрудник: %s %s %s, должность: %s, зарплата: %s рублей, 'e-mail: %s, телефон: %s, возраст: %d \n", lastName, name, middleName, position, salary, email, telephoneNumber, age);
    }



    public int getAge() {
        return age;
    }
}
