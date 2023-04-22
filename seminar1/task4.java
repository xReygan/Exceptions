// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя. Важно: При выполнении метода единственное
// исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

package seminar1;

public class task4 {
    public static void main(String[] args) {
        int[] ArrayOne = {10, 8, 6, 4, 2};
        int[] ArrayTwo = {2, 4, 6, 1, 0};
        int[] ArrayRes = divide(ArrayOne, ArrayTwo);
    }

    public static int[] divide(int[] ArrayOne, int[] ArrayTwo) {
        if(ArrayOne.length != ArrayTwo.length) throw new RuntimeException("Внимание!!! Длины массивов не равны.");
        int[] ArrayRes = new int[ArrayOne.length];
        for (int i = 0; i < ArrayOne.length; i++) {
            if(ArrayTwo[i] == 0) throw new RuntimeException("Внимание!!! На ноль делить нельзя");
            ArrayRes[i] = ArrayOne[i]/ArrayTwo[i];
        }
        return ArrayRes;
    }
}
