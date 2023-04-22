//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package seminar1;

public class task1 {
    public static void main(String[] args) {
        String []s = {"one", "two", null};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        divide(10, 0);
        printMeaning(array,10);
        printStringLength(s);
    }

    public static void divide(int num1, int num2){
        if(num2 == 0) throw new RuntimeException("Внимание!!! На ноль делить нельзя");
        double res = num1/num2;
        System.out.println("если " + num1 + " разделить на " + num2 + " получаем " + res);
    }

    public static void printMeaning(int[] array, int index){
        if(index > array.length-1) throw new RuntimeException("Внимание!!! Элемента с таким индексом не существует.");
        System.out.println("элемент индекса " + index + " равен " + array[index]);
    }

    public static void printStringLength(String[] s){
        for (String x: s){
            if(x == null) throw new RuntimeException("Внимание!!! Элемент отсутствует!");
            System.out.println(x);
        }
    }
}
