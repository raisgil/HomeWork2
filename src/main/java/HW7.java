import java.util.Arrays;
import java.util.Scanner;

//7. Написать метод, который на вход принимает строку и переменное количество символов,
//   а на выходе отдаёт строку без переданного символа.
// Раис Гилязов
public class HW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.print("Введите количество букв: ");
        int w = scanner.nextInt();
        System.out.print("Введите ваши буквы: ");
        char[] array = new char[w];
        for (int i = 0; i < w; i++) {
            array[i] = scanner.next().trim().charAt(0);
        }
        String wordres = wordHaveNoKeys(word, array);
        System.out.println("Слово: '" + word + "' без букв: '" + Arrays.toString(array) + "', будет словом: " + wordres);
    }

    public static String wordHaveNoKeys(String b, char... array) {
        //return result.replaceAll(String.valueOf(array), ""); //по неизвестной причине работает некорректно.

        //корректный вариант работы представлен ниже
        String result = b;
        String array2 = new String(array);
        String[] array3 = array2.split("");
        for (int i = 0; i < array3.length; i++) {
            result = result.replaceAll(array3[i], "");
        }
        return result;
    }
}

