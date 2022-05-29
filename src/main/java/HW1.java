import java.util.Arrays;
import java.util.Scanner;
/* 1. Написать метод, который принимает на вход целочисленное число,
создаёт целочисленный массив размером данного числа, заполняет его случайными числами и возвращает.
Раис Гилязов */

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int weight = scanner.nextInt();
        String result = doArray(weight);
        System.out.println("Ваш случайный массив: " + result);
    }

    public static String doArray(int a) {
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        String result = Arrays.toString(array);
        return result;
    }
}
