package taskOneTwo;

import java.util.ArrayList;

public class Numbers {
    private static ArrayList<Integer> set = new ArrayList<>();

    public static ArrayList<Integer> getSet() {
        return set;
    }

    public Numbers() {
        setNumbers();
    }

    //создание колекции из 20 случайных целых чисел
    public static void setNumbers() {
        for (int i = 0; i < 20; i++) {
            getSet().add((int) (Math.random() * 1000));
        }
    }

    // метод удаления нечетных чисел
    public void deleteNumbers() {
        for (int i = 0; i < Numbers.getSet().size(); i++) {
            if (getSet().get(i) % 2 != 0) {
                getSet().remove(i);
                i--;
            }
        }
        for (int i = 0; i < Numbers.getSet().size(); i++) {
            System.out.println(getSet().get(i));
        }
    }


}
