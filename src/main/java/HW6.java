import java.util.Scanner;
// 6. Написать метод, который на вход принимает строку и символ, а на выходе отдаёт строку без переданного символа.
// Раис Гилязов
public class HW6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.print("Введите букву: ");
        char letter = scanner.next().toLowerCase().charAt(0);
        String wordres = wordHaveNoKey(letter, word);
        System.out.println("Слово: '" + word + "' без буквы: '" + letter + "', будет словом: " + wordres);
    }

    public static String wordHaveNoKey(char a, String b) {
        String result = b.replaceAll(String.valueOf(a), "");
        return result;
    }
}
