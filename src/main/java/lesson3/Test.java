package lesson3;

import java.sql.Array;
import java.util.*;

public class Test {


    public static void main(String[] args) {

        String[] arr ={"Hi","hello","good morning","hi","Hello","good afternoon","HELLO","good evening","hi","aloha","aloha","alloha"};
        List <String>lower=new ArrayList();
        Map<String,Integer> words=new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            String []phrase = arr[i].toLowerCase().split(" ");
            for (int j = 0; j < phrase.length; j++) {
                lower.add(phrase[j]);
            }
        }
        for (int j = 0; j < lower.size(); j++) {
            words.put(lower.get(j),words.getOrDefault(lower.get(j),0)+1);
        }
        for (Map.Entry<String,Integer> word:
             words.entrySet()) {
            System.out.println(word.getKey()+" : "+word.getValue());
        }
    }
}
