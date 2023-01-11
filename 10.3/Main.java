package Task;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random(); // Create random number
        List<Integer> list = new ArrayList<>(); // Create Array
        for (int i = 0; i < 15; i++) {
            list.add(rn.nextInt(10)); // Add number to Array
        }
        System.out.println(list);

        Map<Integer, Integer> stat = new HashMap<>(); // Create Map

        for (Integer element : list) {
            Integer n = stat.get(element); // Create new variable n, and get element
            if(n == null){
                stat.put(element, 1); // if n == null, put n element 1
            }else{
                stat.put(element, n + 1); // if n != null, put n element n+1;
            }
        }

        System.out.println(stat); // Print to console

    }

}