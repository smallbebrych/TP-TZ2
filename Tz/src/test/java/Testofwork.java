import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Testofwork {
    @Test
    public void testMin() throws FileNotFoundException {
        File file=new File("Tz\\src\\test\\Tests\\test1.txt");
        Scanner scanner=new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        assertEquals(-45, Main._min(numbers));
    }
    @Test
    public void testMax() throws FileNotFoundException {
        File file=new File("Tz\\src\\test\\Tests\\test2.txt");
        Scanner scanner=new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        assertEquals(511, Main._max(numbers));
    }
    @Test
    public void testSum() throws FileNotFoundException {
        File file=new File("Tz\\src\\test\\Tests\\test4.txt");
        Scanner scanner=new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        assertEquals(10350, Main._sum(numbers));
    }
    @Test
    public void testMult() throws FileNotFoundException {
        File file=new File("Tz\\src\\test\\Tests\\test3.txt");
        Scanner scanner=new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        assertEquals(48870360, Main._mult(numbers));

    }
}
