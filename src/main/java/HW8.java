import java.util.Scanner;
// 8.Написать метод, который на вход принимает переменной количество целых чисел.
// Вернуть true, если среди переданных чисел есть такие, которые равны сумме остальным. В противном случае вернуть false.
// Раис Гилязов
public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int weight = scanner.nextInt();
        int[] array = new int[weight];
        System.out.print("Введите массив: ");
        for (int i = 0; i < weight; i++) {
            array[i] = scanner.nextInt();
        }
        boolean result = sameAsOtherTogether(array);
        System.out.println(result);
    }

    public static boolean sameAsOtherTogether(int... array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                sum += array[j];
            }
            if (array[i] == sum) {
                result = true;
                break;
            }
        }
        return result;
    }
}
