import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Variant4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        try {
            int x = sc.nextInt();
            System.out.println("Введите количество столбцов массива: ");
            int y = sc.nextInt();
            int[][] arr = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.println("Введите элемент arr " + "[" + i + "]" + "[" + j + "]");
                    arr[i][j] = sc.nextInt();
                }
            }
            int[] arrD = new int[x];
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][i] + " ");
                arrD[i] = arr[i][i];
            }
            int countHonestNumbers = 0;
            int max = 0;
            int indexMax = -1;
            for (int i = 0; i < arrD.length; i++) {
                if (arrD[i] % 2 == 0) {
                    indexMax = i;
                    max = arrD[indexMax];
                    countHonestNumbers++;
                }
            }
            if (countHonestNumbers != 0) {
                for (int i = 0; i < arrD.length; i++) {
                    if ((arrD[i]%2 ==0) && (arrD[i]) > max) {
                        indexMax=i;
                        max = arrD[indexMax];
                    }
                }
                System.out.println("Побочная диагональ:  = " + max);
            }
            else {
                throw new RuntimeException("Нет четных элементов");
            }
            System.out.println(Arrays.toString(arrD));
        }
        catch (InputMismatchException ie){
            System.out.println("ввод строки вместо числа");
        }
        catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }
}

