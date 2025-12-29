package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args){
        // create a list of strings

        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Beatriz");
        names.add("Carlos");
        names.add("Daniel");
        names.add("Eduardo");


        System.out.println("First name: " + names.get(0));

        names.remove(0);
        System.out.println("First name: " + names.get(0));

        for (String name : names) {
            System.out.println("Nome: " + name);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("First number: " + numbers);


        numbers.remove(Integer.valueOf(10));

        numbers.remove(Integer.valueOf(30));
        System.out.println("First number: " + numbers);


        if (numbers.contains(20)) {
            System.out.println("The list contains the number 20");
        } else {
            System.out.println("The list does not contain the number 20");
        }
    }


}
