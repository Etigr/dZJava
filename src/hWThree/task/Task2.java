//Пусть дан произвольный список целых чисел, удалить из него чётные числа
package hWThree.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void removeEvensNumber() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            list.add(randomNumber);

        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
