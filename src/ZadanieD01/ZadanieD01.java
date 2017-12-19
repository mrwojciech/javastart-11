package ZadanieD01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ZadanieD01 {
    private static final int SIZE_OF_THE_SET = 50;
    private static int MAX = 0;
    private static int MIN = 1000;
    private static int AVG = 0;

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        fillInn(set);
        printOut();
        printBiggerThan(set);
    }


    private static void printOut() {
        System.out.println("MInimum: " + ZadanieD01.MIN);
        System.out.println("Maximum: " + MAX);
        System.out.println("Srednia: " + AVG);

    }

    private static void printBiggerThan(Set<Integer> set) {
        System.out.println("Liczby wieksze od sredniej: ");
        for (Integer num : set) {
            if (num > AVG) {
                System.out.print(num + ", ");
            }
        }
        System.out.println();
    }

    private static void fillInn(Set<Integer> set) {

        int randomNumber = 0;
        int totalSum = 0;
        Random random = new Random();
        for (int i = 0; i < SIZE_OF_THE_SET; i++) {
            randomNumber = random.nextInt(1000);
            if (randomNumber > MAX) {
                MAX = randomNumber;
            }
            if (MIN < randomNumber) {
                MIN = randomNumber;
            }
            totalSum+=randomNumber;
            set.add(randomNumber);
        }
    AVG = totalSum/ SIZE_OF_THE_SET;
    }
}
