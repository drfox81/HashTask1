package passport;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        //Set<Passport> passports=new HashSet<>();
//        PassportList passportList=new PassportList();
//        System.out.println(passportList.getPassportList().size());
//        passportList.addPassport(new Passport("1234", "Иванов1", "Иван", "Иванович", LocalDate.of(1975, 11, 2)));
//        passportList.getPassportList().add(new Passport("12345", "Иванов2", "Иван", "Иванович",
//                LocalDate.of(1975, 11, 2)));
//        passportList.getPassportList().add(new Passport("0123456", "Иванов3", "Иван", "Иванович",
//                LocalDate.of(1975, 11, 2)));
//        passportList.getPassportList().add(new Passport("123457", "Иванов4", "Иван", "Иванович",
//                LocalDate.of(1975, 11, 2)));
//
//        passportList.addPassport(new Passport("123457", "Иванов5", "Иван", "Иванович",
//                LocalDate.of(1975, 11, 2)));
//        System.out.println(passportList.getPassportList().size());
//        System.out.println(passportList.toString());
//        System.out.println(passportList.check("12345"));
        List<Integer> list=new ArrayList<>();
        ArrayList<Integer> firstCollection=new ArrayList<>();
        LinkedList<Integer> firstCollectionL=new LinkedList<>();
        Set<Integer> firstHashSet=new HashSet<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
            firstCollection.add(i);
            firstCollectionL.add(i);
            firstHashSet.add(i);

        }
        processA(firstCollection,list);
        processA(firstCollectionL,list);
        processA(firstHashSet,list);


    }
    public static void processA(ArrayList<Integer> firstCollection, List<Integer> list) {
        long startTime = System.nanoTime();

        if (firstCollection.containsAll(list)) {
            System.out.println("Первая коллекция содержит все элементы списка");
        } else {
            System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        }
        long endTime = System.nanoTime();
        System.out.println((float) (endTime - startTime)/1000000);
    }

    public static void processA(Set<Integer> firstCollection, List<Integer> list) {
        long startTime = System.nanoTime();

        if (firstCollection.containsAll(list)) {
            System.out.println("Первая коллекция содержит все элементы списка");
        } else {
            System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        }
        long endTime = System.nanoTime();
        System.out.println((float) (endTime - startTime)/1000000);
    }

    public static void processA(LinkedList<Integer> firstCollectionL, List<Integer> list) {
        long startTime = System.nanoTime();

        if (firstCollectionL.containsAll(list)) {
            System.out.println("Первая коллекция содержит все элементы списка");
        } else {
            System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        }
        long endTime = System.nanoTime();
        System.out.println((float) (endTime - startTime)/1000000);
    }
}
