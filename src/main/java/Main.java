import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\test\\Tests\\test3.txt");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        System.out.println("Минимальное" + " " + _min(numbers));
        System.out.println("Максимальное" + " " + _max(numbers));
        System.out.println("Сумма" + " " + _sum(numbers));
        System.out.println("Произведение" + " " + _mult(numbers));
        sc.close();
    }
    public static int _max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static int _min(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public static long _sum(int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static long _mult(int[] a) {
        long mul = 1;
        for (int i = 0; i < a.length; i++) {
            mul *= a[i];
        }
        return mul;
    }
}