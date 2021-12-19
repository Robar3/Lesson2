package lesson3;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Test {


    public static void main(String[] args) {

        String[] arr ={"Hi","hello","good morning","hi","Hello","good afternoon","HELLO","good evening","hi","aloha","aloha","alloha"};

        Map<String,Integer> words=new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            String[] lower =arr[i].toLowerCase().split(" ");
            for (int j = 0; j < lower.length; j++) {
                words.put(lower[j],words.getOrDefault(lower[j],0)+1);
            }

        }
        for (Map.Entry<String,Integer> word:
             words.entrySet()) {
            System.out.println(word.getKey()+" : "+word.getValue());
        }
    }
}
