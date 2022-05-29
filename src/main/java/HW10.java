import java.util.Scanner;
//10. Написать метод, который на вход принимает строку с арифметическим действием из 2 чисел
//    (например, “2 + 2”) и на выходе возвращает результат операции.
// Раис Гилязов
public class HW10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение вида 'a + b'");
        String word = scanner.nextLine();
        int result = calc(word);
        System.out.println("Ответ: " + result);
    }

    public static int calc(String word) {
        int result = 0;
        String[] array = word.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        if (array[1].contains("+")) {
            result = a + b;
        } else if (array[1].contains("-")) {
            result = a - b;
        } else if (array[1].contains("*")) {
            result = a * b;
        } else if (array[1].contains("/")) {
            result = a / b;
        }
        return result;
    }
}
