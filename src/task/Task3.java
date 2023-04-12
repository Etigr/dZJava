package task;

import java.util.Scanner;

public class Task3 {
    public static String calculator() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        String operation = scanner.next();

        double result = 0;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            result = (firstNumber * secondNumber);
        } else if (operation.equals("/")) {
            result = (firstNumber / secondNumber);
        } else {
            System.out.println("Неверная операция!");
        }
        return System.out.printf("%f %s %f = %.3f \n", firstNumber, operation, secondNumber, result).toString();


//    public static void printResult(double result) {
//        System.out.println("Результат: " + result);
    }
}