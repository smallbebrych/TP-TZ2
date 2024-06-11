# TP-TZ2
[![CI System](https://github.com/smallbebrych/TP-TZ2/actions/workflows/main.yml/badge.svg)](https://github.com/smallbebrych/TP-TZ2/actions/workflows/main.yml)
# Программа Main
``` java
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
```
### Описание программы
Данная программа считывает числа из файла и находит в нем минимум, максимум, сумму и произведение чисел.
# Реализация тестов на правильность возвращаемых ответов
``` java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Testofwork {
    @Test
    public void testMin() throws FileNotFoundException {
        File file=new File("src\\test\\Tests\\test1.txt");
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
        File file=new File("src\\test\\Tests\\test2.txt");
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
        File file=new File("src\\test\\Tests\\test4.txt");
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
        File file=new File("src\\test\\Tests\\test3.txt");
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
```
### Описание программы
Для данной программы было создано 4 файла: test1, test2, test3, test4. Они открываются и проверяется правильность ответа для этих файлов.
# Реализация тестов на скорость выполнения программы
``` java
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
```
### Описание программы
Данная программа считывает данные из приготовленных 4 файлов на 1000, 10000, 100000 и 1000000 элементов, а затем выдает время выполнения каждого метода на все файлы.
# Реализация своего теста
``` java
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class Testcorrectinput {
    @Test
    public void test1() throws FileNotFoundException {
        File file = new File("src\\test\\Tests\\Testofspeed1.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        boolean hasLetter = Arrays.stream(numbersString).anyMatch(s -> s.matches(".*[a-zA-Z].*"));
        assertEquals(hasLetter, false);
        }
}
```
### Описание программы
Данная программа считывает файл и проверяет этот файл на наличие в нем букв.
# График зависимости
Данный график зависимости был построен для функции _mult.
![2024-06-11_15-35-13](https://github.com/smallbebrych/TP-TZ2/assets/167618145/303bfb95-ccd3-491b-96b4-973717efc046)
# СI- система
К проекту на гитхаб была подключена система. Вызов тестирования можно ручным способом, для этого надо выбрать нужный коммит и нажать "rerun jobs".
А также вызов тестов автоматически вызывается при каждом новом коммите.
К проекту была подключен бейдж, который отображается в начале README файла.
Также результаты тестирования отправляются в телеграмм, где в сообщение отображается статус подождения тестов. Данные сообщения можно посмотреть в группе: https://t.me/+EN9SNrFJ4l81Mzky.
