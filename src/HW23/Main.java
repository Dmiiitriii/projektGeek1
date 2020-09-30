package HW23;

import java.util.*;
import HW23.PhoneList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("green", "yellow", "dream", "green", "yellow", "dream", "green", "yellow", "dream", "fluffy", "friend", "girl"));


        System.out.println(wordList);
        System.out.println("Size array: " + wordList.size());
        Set<String> wordSet = new HashSet<>(wordList);
        System.out.println("Уникальные слова: " + wordSet);

        LinkedList<String> wordList2 = new LinkedList<>(wordList);
        for (int i = 0; i < wordList2.size(); i++) {
            int q = 0;
            for (int j = 0; j < wordList2.size(); j++) {
                if (wordList2.get(i).equals(wordList2.get(j))) {
                    q++;
                }
            }
            System.out.println(wordList2.get(i) + " повторяется " + q + " раз");

        }

        ArrayList<Integer> Petrov = new ArrayList<>(Arrays.asList(121,122,123,124,125));
        ArrayList<Integer> Ivanov = new ArrayList<>(Arrays.asList(126,127,128,129,130));
        ArrayList<Integer> Sidorov = new ArrayList<>(Arrays.asList(131,132));
        ArrayList<Integer> Grachev = new ArrayList<>(Arrays.asList(700));
        ArrayList<Integer> Seleznev = new ArrayList<>(Arrays.asList(255,256));
        ArrayList<Integer> Kuklachev = new ArrayList<>(Arrays.asList(258,259,260));
        ArrayList<Integer> Gorbachev = new ArrayList<>(Arrays.asList(555,556,556));
        ArrayList<Integer> Ulianov = new ArrayList<>(Arrays.asList(777));
        HashMap<String, List<Integer>> phoneNumbers = new HashMap<>();

        phoneNumbers.put("Petrov",Petrov);
        phoneNumbers.put("Ivanov",Ivanov);
        phoneNumbers.put("Sidorov",Sidorov);
        phoneNumbers.put("Grachev",Grachev);
        phoneNumbers.put("Seleznev",Seleznev);
        phoneNumbers.put("Gorbachev",Gorbachev);
        phoneNumbers.put("Ulianov",Ulianov);
        phoneNumbers.put("Kuklachev",Kuklachev);



        System.out.println("Телефонный номер абонента Petrov " + phoneNumbers.get("Petrov"));







    }




}
