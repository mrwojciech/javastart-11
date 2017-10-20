package ZadanieD02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZadanieD02 {


    final static int HOW_MANY_NUMBERS_TAKE = 10;

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        System.out.println("Podaj " + HOW_MANY_NUMBERS_TAKE + " liczb");
        fillInWithData(queue, HOW_MANY_NUMBERS_TAKE);
        int sum = sumAndShow(queue);
        System.out.print(" = " + sum);

    }

    private static int sumAndShow(Queue<Integer> queue) {
        Iterator iterator = queue.iterator();
        Integer sum = 0;

        while (iterator.hasNext()) {
            Integer num = (Integer) iterator.next();
            sum += num;
            System.out.print(num);
            if (iterator.hasNext()) {

                System.out.print(" + ");
            }
        }
        return sum;
    }

    private static void fillInWithData(Queue<Integer> queue, int howManyNumbersTake) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        for (int i = 0; i < howManyNumbersTake; i++) {
            num = scanner.nextInt();
            queue.add(num);
        }
    }
}
