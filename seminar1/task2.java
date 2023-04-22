// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// код приложен в виде картинки к семинару

package seminar1;

public class task2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < 5; j++) {             // ArrayIndexOutOfBoundsException
                                                    // если в массиве j элементов будет меньше 4-ех.
            int val = Integer.parseInt(arr[i][j]);  // NumberFormatException
                                                    // если в массиве будет элемент со значением null.
            sum += val;
          }
        }
      return sum;
      }
}
