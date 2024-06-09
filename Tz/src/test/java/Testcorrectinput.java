import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class Testcorrectinput {
    @Test
    public void test1() throws FileNotFoundException {
        File file = new File("Tz\\src\\test\\Tests\\Testofspeed1.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        boolean hasLetter = Arrays.stream(numbersString).anyMatch(s -> s.matches(".*[a-zA-Z].*"));
        assertEquals(hasLetter, false);
        }
}
