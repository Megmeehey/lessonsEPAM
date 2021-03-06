package lesson170707.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<String>();

        listOfStrings.add("one");
        listOfStrings.add("two");
        listOfStrings.add("three");
        listOfStrings.add("four");
        listOfStrings.add("five");

        System.out.println(listOfStrings);

        Collections.sort(listOfStrings);

        System.out.println(listOfStrings);
    }
}
