package ZadanieD01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ZadanieD01_v2 {
    final static int SIZE_OF_THE_SET = 50;

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Set<Integer> set1 = new TreeSet<>();
        //set1.first(); <<__________________tego nie łapie_________________________>>
        fillInn(set);

        int avg = findAVG(set);

        System.out.println("MInimum: " + set.first());
        System.out.println("Maximum: " + set.last());
        System.out.println("Srednia: " + avg);
        printBiggerThan(set, avg);
    }

    private static void printBiggerThan(Set<Integer> set, int avg) {
        System.out.println("Liczby wieksze od sredniej: ");
        for (Integer num : set) {
            if (num > avg) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();
    }

    private static int findAVG(Set<Integer> set) {
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        return sum / set.size();
    }

    private static int findMax(Set<Integer> set) {
        int max = 0;
        for (Integer num : set) {
            if (num > max) {
            }
            max = num;
        }
        return max;
    }

    private static int findMin(Set<Integer> set) {
        int min = 1000;
        for (Integer num : set) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static void fillInn(Set<Integer> set) {

        Random random = new Random();
        for (int i = 0; i < SIZE_OF_THE_SET; i++) {
            set.add(random.nextInt(1000));
        }
    }
}
