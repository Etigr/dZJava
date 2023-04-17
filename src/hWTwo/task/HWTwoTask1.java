//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


package hWTwo.task;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HWTwoTask1 {
    private static Loggir Log;
    private static final Logger LOG = Loggir.log(hWTwo.task.HWTwoTask1.class.getName());

    public static void BubleSort(int[] myArray) {

        try (FileWriter in = new FileWriter("HWTwo.txt")) {
            int temp = 0;
            String msg;
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray.length; j++) {
                    if (myArray[j] > myArray[i]) {
                        temp = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = temp;
                    }
                    msg = Arrays.toString(myArray);
                    LOG.log(Level.INFO, msg);
                }
            }

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);

        }
    }
}
