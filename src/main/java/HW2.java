import java.util.Arrays;
import java.util.Scanner;
// Написать метод, который на вход принимает целочисленный массив, находит в нём максимальное число и возвращает его.
// Раис Гилязов

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел массива: ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        int result = findMax(array);
        System.out.println("Максимальное число в массиве: " + result);
    }

    public static int findMax(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
}
