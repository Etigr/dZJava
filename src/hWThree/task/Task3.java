//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
package hWThree.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void minMaxAvg() {
        List<Integer> list = generateRandomList(10);

        int max = list.get(0);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (currentNumber > max) {
                max = currentNumber;
            }
            if (currentNumber < min) {
                min = currentNumber;
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double avg = (double) sum / list.size();

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее арифметическое: " + avg);
    }


    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(10);
            list.add(randomNumber);
        }
        System.out.println(list);
        return list;

    }
}
