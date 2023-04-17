// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
package hWFour.Task;

import java.util.Collections;
import java.util.LinkedList;

public class HWFourTask1 {
    public static void reverse () {
        LinkedList<Integer> spisok = new LinkedList<>();
        spisok.add(1);
        spisok.add(2);
        spisok.add(3);
        spisok.add(4);
        spisok.add(5);
        System.out.println(spisok);
        Collections.reverse(spisok);
        System.out.println(spisok);

    }
}
