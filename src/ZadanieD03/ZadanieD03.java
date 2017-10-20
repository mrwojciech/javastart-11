package ZadanieD03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ZadanieD03 {


    public static void main(String[] args) {


        File file = new File("numbers.txt");
        List<Integer> list;
        Map<Integer, Integer> map = new HashMap<>();

        list = readTheFile(file);
        Collections.sort(list);
        map = createHashMap(list);
        checkFrequency(map);

    }

    private static Map<Integer, Integer> createHashMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num :
                list) {
            map.put(num, Collections.frequency(list, num));
        }

        return map;
    }

    private static void checkFrequency(Map<Integer, Integer> map) {
        for (Integer num :
                map.keySet()) {
            System.out.println(num + " wystąpił: " + map.get(num));
        }
    }

    private static List<Integer> readTheFile(File file) {
        List<Integer> list = new ArrayList<Integer>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {

                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}
