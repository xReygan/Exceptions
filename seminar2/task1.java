// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package seminar2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        enterNumber();
    }

    public static void enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String input = scanner.nextLine();
        try {
            float num = Float.parseFloat(input);
            System.out.println("Вы ввели: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Внимание!!! Вы ввели не дробное число!");
            enterNumber();
        }
        scanner.close();
    }
}
