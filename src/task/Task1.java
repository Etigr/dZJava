package task;

public class Task1 {
    public static int triangleNum(int num) {
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int num) {
        int factorialNum = 1;
        for (int i = 1; i < num + 1; i++){
            factorialNum *= i;
        }
        return factorialNum;
    }
}
