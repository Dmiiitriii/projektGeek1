package HW23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneList {

    String name;

    public PhoneList(String name, String number) {
                this.name = name;
    }

    public String getName() {
        return name;
    }


    HashMap<String, List<Integer>> phoneNumbers = new HashMap<>();


    public void printPhone(String name){
        System.out.println("Телефонный номер абонента с фамилией  " + name + phoneNumbers.get(name));

    }



}
