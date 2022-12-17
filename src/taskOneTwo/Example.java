package taskOneTwo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Example {

    private static Set<String> exampleSet = new HashSet<>();

    public static Set<String> getExampleSet() {
        return exampleSet;
    }

    public static void addExample() {
        while (exampleSet.size() != 15) {
            int a = (int) ((Math.random() * 9)+1);
            int b = (int) ((Math.random() * 9)+1);
            if (!getExampleSet().contains(b+"*"+a)){
                getExampleSet().add(a + "*" + b);
            }
        }
        for (String s : exampleSet) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "taskOneTwo.Example{}";
    }






}
