import java.util.Arrays;
import java.util.Scanner;
// Написать метод, который на вход принимает целочисленный массив, находит в нём минимальное число и возвращает его.
// Раис Гилязов

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел массива: ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        int result = findMin(array);
        System.out.println("Минимальное число в массиве: " + result);
    }

    public static int findMin(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
}
