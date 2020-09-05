package HW5;

public class Staff {

    private String name;
    private String lastName;
    private String middleName;
    private String position;
    private String salary;
    private String email;
    private String telephoneNumber;
    private int age;

    public Staff(String name, String lastName, String middleName, String position, String salary, String email, String telephoneNumber, int age){
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.age = age;

    }

    public void info (){
        System.out.printf("Stuff %s %s %s %s %s %s %s %s %d \n", name, lastName, middleName, position, salary, email, telephoneNumber, age);


    }




}
