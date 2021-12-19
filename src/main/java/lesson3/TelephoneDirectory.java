package lesson3;

import java.util.*;

public class TelephoneDirectory {

    static Map<String,HashSet<String>> contact = new TreeMap<>();

    public static void add(String surname, String number){
        if (contact.containsKey(surname)){
        HashSet<String> currentPhone =get(surname);
        currentPhone.add(number);
        contact.put(surname, currentPhone);}
        else {
            HashSet<String> hashSet=new HashSet<>();
            hashSet.add(number);
            contact.put(surname, hashSet);
        }

    }

    public static HashSet<String> get(String surname){
        HashSet<String> key=contact.get(surname);
        return key;
    }
}
