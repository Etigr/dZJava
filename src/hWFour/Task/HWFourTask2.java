package hWFour.Task;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class HWFourTask2 {
    public static Queue<String> enqueue() {
        Queue<String> enqueueList = new LinkedList<>();
        enqueueList.add("abcd");
        enqueueList.add("sfsd");
        enqueueList.add("fghgfh");
        System.out.println(enqueueList);
        enqueueList.offer("qwert");
        System.out.println(enqueueList);
        return enqueueList;
    }
    public static Deque<String> first() {
        Deque<String> firstList = new LinkedList<>();
        firstList.add("abcd");
        firstList.add("sfsd");
        firstList.add("fghgfh");
        System.out.println(firstList);
        System.out.println(firstList.pollFirst());
        System.out.println(firstList);
        return firstList;
    }
    public static LinkedList<String> dequeue() {
        LinkedList<String> dequeueList = new LinkedList<>();
        dequeueList.add("abcd");
        dequeueList.add("sfsd");
        dequeueList.add("fghgfh");
        System.out.println(dequeueList);
        System.out.println(dequeueList.getFirst());
        System.out.println(dequeueList);
        return dequeueList;
    }
}
