import java.util.Scanner;
// 9. Написать метод, который на вход принимает строку.
// Вернуть строку “Гласных больше”, если в переданном слове больше гласных букв, аналогично для согласных.
// Раис Гилязов
public class HW9 {
    public static void main(String[] args) {
        String glas = "аоуэиыеёяю";
        char[] arrayOfGlas = glas.toCharArray();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        String result = glasBolshe(word, arrayOfGlas);
        System.out.println(result);
    }

    public static String glasBolshe(String word, char... arrayOfGlas) {
        String result = " ";
        char[] arrayOfWord = word.toCharArray();
        int glas = 0;
        for (int i = 0; i < arrayOfWord.length; i++) {
            for (int j = 0; j < arrayOfGlas.length; j++) {
                if (arrayOfWord[i] == arrayOfGlas[j]) {
                    glas += 1;
                }
            }
            int soglas = arrayOfWord.length - glas;
            if (glas > soglas) {
                result = "Гласных больше чем согласных";
            } else if (glas == soglas) {
                result = "Количество гласных и согласных равно";
            } else {
                result = "Согласных больше чем гласных";
            }
        }
        return result;
    }
}
