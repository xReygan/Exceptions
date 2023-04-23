// Разработайте программу, которая выбросит Exception, когда пользователь
// вводит пустую строку. Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.

package seminar2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        emptyLine();
    }

    private static void emptyLine() {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
        if (str.equals("")) {
            throw new RuntimeException("Внимание!!! Пустые строки вводить нельзя!");

        }
        System.out.println("Вы ввели: " + str);
        }
        finally {
            scanner.close();
        }    
    }
}
