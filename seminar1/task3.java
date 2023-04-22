// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

package seminar1;

public class task3 {
    public static void main(String[] args) {
        int[] ArrayOne = {1, 2, 3, 4, 5};
        int[] ArrayTwo = {6, 7, 8, 9, 10, 11, 12};
        int[] ArrayRes = difference(ArrayOne, ArrayTwo);
    }


    public static int[] difference(int[] ArrayOne, int[] ArrayTwo) {
        if(ArrayOne.length != ArrayTwo.length) throw new RuntimeException("Внимание!!! Длины массивов не равны.");
        int[] ArrayRes = new int[ArrayOne.length];
        for (int i = 0; i < ArrayRes.length; i++) {
            ArrayRes[i] = ArrayOne[i] - ArrayTwo[i];
        }
        return ArrayRes;
    }
}
