//Реализовать разность массивов и симметрическую разность.
package hWThree.task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void delTwoArray() {
    int[] arr1 = {1, 2, 3, 4, 5, 8};
    int[] arr2 = {3, 4, 5, 6, 7};

    int[] difference = Arrays.stream(arr1)
            .filter(num -> !Arrays.stream(arr2).anyMatch(x -> x == num))
            .toArray();

    System.out.println("Разность массивов arr1 и arr2: " + Arrays.toString(difference));

    Set<Integer> symmetricDifference = new HashSet<>();
    for (int i = 0; i < arr1.length; i++) {
        if (!contains(arr2, arr1[i])) {
            symmetricDifference.add(arr1[i]);
        }
    }
    for (int i = 0; i < arr2.length; i++) {
        if (!contains(arr1, arr2[i])) {
            symmetricDifference.add(arr2[i]);
        }
    }
    int[] symmetricDifferenceArray = symmetricDifference.stream().mapToInt(Integer::intValue).toArray();

    System.out.println("Симметрическая разность массивов arr1 и arr2: " + Arrays.toString(symmetricDifferenceArray));
}

    public static boolean contains(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }
}
