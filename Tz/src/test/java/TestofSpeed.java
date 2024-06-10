import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestofSpeed {
    @Test
    public void testspeedMin1() throws FileNotFoundException {
        File file = new File("src\\test\\Tests\\Testofspeed1.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        double startTime = System.nanoTime();
        Main._min(numbers);
        double endTime = System.nanoTime();
        System.out.println("Время выполнения функции _min на 1038 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._max(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _max на 1038 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._sum(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _sum на 1038 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._mult(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _mult на 1038 элементов: " + (endTime - startTime)/1000000 + " ms");
    }
    @Test
    public void testspeedMin2() throws FileNotFoundException {
        File file = new File("src\\test\\Tests\\Testofspeed2.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        double startTime = System.nanoTime();
        Main._min(numbers);
        double endTime = System.nanoTime();
        System.out.println("Время выполнения функции _min на 10000 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._max(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _max на 10000 элементов: " + (endTime - startTime)/100000 + " ms");
        startTime =System.nanoTime();
        Main._sum(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _sum на 10000 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._mult(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _mult на 10000 элементов: " + (endTime - startTime)/1000000 + " ms");
    }
    @Test
    public void testspeedMin3() throws FileNotFoundException {
        File file = new File("src\\test\\Tests\\Testofspeed3.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        double startTime =System.nanoTime();
        Main._min(numbers);
        double endTime = System.nanoTime();
        System.out.println("Время выполнения функции _min на 100740 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime =System.nanoTime();
        Main._max(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _max на 100740 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._sum(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _sum на 100740 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime =System.nanoTime();
        Main._mult(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _mult на 100740 элементов: " + (endTime - startTime)/1000000 + " ms");
    }
    @Test
    public void testspeedMin4() throws FileNotFoundException {
        File file = new File("src\\test\\Tests\\Testofspeed4.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        double startTime =System.nanoTime();
        Main._min(numbers);
        double endTime =System.nanoTime();
        System.out.println("Время выполнения функции _min на 996450 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._max(numbers);
        endTime =System.nanoTime();
        System.out.println("Время выполнения функции _max на 996450 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime =System.nanoTime();
        Main._sum(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _sum на 996450 элементов: " + (endTime - startTime)/1000000 + " ms");
        startTime = System.nanoTime();
        Main._mult(numbers);
        endTime = System.nanoTime();
        System.out.println("Время выполнения функции _mult на 996450 элементов: " + (endTime - startTime)/1000000 + " ms");
    }
}
