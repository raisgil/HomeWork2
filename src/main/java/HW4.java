import java.util.*;
// Написать метод, который на вход принимает целочисленный массив, сортирует его в порядке возрастания, убывания и возвращает.
// Раис Гилязов

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел массива: ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        int[] resultMinToMax = sortArrayMinToMax(array);
        Integer[] resultMaxToMin = sortArrayMaxToMin(array);
        System.out.println("Сортированный по возрастанию массив: " + Arrays.toString(resultMinToMax));
        System.out.println("Сортированный по убыванию массив: " + Arrays.toString(resultMaxToMin));
    }

    public static int[] sortArrayMinToMax(int[] array) {
        int[] result = array;
        Arrays.sort(result);
        return result;
    }

    public static Integer[] sortArrayMaxToMin(int[] array) {
        //Метод Integer нужен для создания массива ОБЪЕКТОВ, ведь только с ним будет работать Collections
        Integer[] result = Arrays.stream(array).boxed().toArray(Integer[]::new);
        //Признаюсь, нашел в интернете пример получения Integer из int
        Arrays.sort(result, Collections.reverseOrder());
        return result;
    }
}
