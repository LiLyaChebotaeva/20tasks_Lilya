import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        //Задача №1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " - четное число.");
        } else {
            System.out.println(number + " - нечетное число.");
        }

        //Задача №2
        System.out.print("Введите первое целое число: ");
        int one = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int two = scanner.nextInt();

        System.out.print("Введите третье целое число: ");
        int three = scanner.nextInt();
        int min = one;
        if (two < min) {
            min = two;
        }
        if (three < min) {
            min = three;
        }
        System.out.println("Минимальное число: " + min);

        //Задача №3
        int num = 5;
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println( i + "*" + num + "=" + res);
        }

        //Задача №4
        System.out.println("Введите целое число:");
        int N = scanner.nextInt();
        int res = 0;
        for (int i = 1; i <= N; i++) {
            res += i;
        }
        System.out.println("Сумма чисел от 1 до " + N + " равна: " + res);

        //Задача №5
        System.out.println("Введите целое число:");
        int n = scanner.nextInt();
        System.out.println("Первые " + n + " чисел Фибоначчи:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
        System.out.println();

        // Задача №6
        System.out.println("Введите целое число:");
        n = scanner.nextInt();
        if (isNumPrime(n)) System.out.println("Введённое число является простым");
        else System.out.println("Введённое число не является простым");
        System.out.println();

        // Задача №7
        System.out.println("Введите целое число:");
        n = scanner.nextInt();
        System.out.println("Числа от " + n + " до 1:");
        for (int i = n; i >= 1; i--)
        {
            System.out.println(i);
        }
        System.out.println();

        // Задача №8
        int sum = 0;
        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите число B: ");
        int b = scanner.nextInt();
        for (int i = a % 2 == 0 ? a : a + 1; i <= b; i += 2){
            sum += i;
        }
        System.out.println(sum);

        // Задача №9
        System.out.println("Введите строку:");
        String s = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--)
        {
            reversed.append(s.charAt(i));
        }
        System.out.println("Строка в обратном порядке: " + reversed);
        System.out.println();

        //Задача №10
        System.out.println("Введите целое число:");
        n = scanner.nextInt();
        System.out.printf("В числе %d цифр", String.valueOf(n).length());
        System.out.println();

        // Задача №11
        System.out.println("Введите целое число:");
        n = scanner.nextInt();
        System.out.printf("Факториал числа равен %d", factorial(n));
        System.out.println();

        // Задача №12
        System.out.println("Введите целое число:");
        n = scanner.nextInt();
        sum = 0;
        while (n / 10 > 9) {
            sum += n % 10;
            n /= 10;
        }
        System.out.printf("Сумма цифр числа равна %d", sum);
        System.out.println();

        // Задача №13
        System.out.println("Введите строку:");
        s = scanner.nextLine();
        reversed = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--)
        {
            reversed.append(s.charAt(i));
        }
        if (s.contentEquals(reversed))
            System.out.println("Строка является полиндромом");
        else System.out.println("Строка не является полиндромом");
        System.out.println();

        //Задача № 14
        System.out.println("Введите размер массива");
        int ras = scanner.nextInt();
        int[] mas = new int[ras];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < ras; i++)
        {
            mas[i] = scanner.nextInt();
        }
        System.out.println("Максимальный элемент массива - " + Arrays.stream(mas).max().getAsInt());

        //Задача № 15
        System.out.println("Введите числа, где первое - размер массива, остальные - массив ");
        String str = bf.readLine();
        String[] numbers = str.split(" ");
        int A = Integer.parseInt(numbers[0]);
        int ans = 0;
        for(int i = 1;i<numbers.length;i++){
            int temp = Integer.parseInt(numbers[i]);
            ans += temp;
        }
        System.out.println(ans);

        //Задача №16
        System.out.println("Введите числа, где первое - размер массива, остальные - массив ");
        str = bf.readLine();
        numbers = str.split(" ");
        A = Integer.parseInt(numbers[0]);
        int pol = 0;
        int otr = 0;
        for(int i = 1;i<numbers.length;i++){
            int temp = Integer.parseInt(numbers[i]);
            if (temp > 0)
                pol++;
            else if (temp < 0)
                otr++;

        }
        System.out.println("Количество положительных чисел = "+pol);
        System.out.println("Количество отрицательных чисел = "+otr);

        //Задача №17
        System.out.println("Введите два целых числа:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Простые числа в диапозоне");
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
        {
            if (isNumPrime(i)) System.out.println(i);
        }
        System.out.println();

        //Задача №18
        System.out.println("Введите строку:");
        s = scanner.nextLine();
        int vowCount = 0, consCount = 0;
        String vowels = "уеыAOИЮ";
        String consonants = "кньбъгпрцзЦКНГШЩЗХЪФВПРЛ";
        for (int i = 0; i < s.length(); i++)
        {
            if (vowels.contains(String.valueOf(s.charAt(i)))) vowCount++;
            else if (consonants.contains(String.valueOf(s.charAt(i)))) consCount++;
        }
        System.out.printf("Количество гласных: {0}\nКоличество согласных: {1}", vowCount, consCount);
        System.out.println();

        //Задача №19
        System.out.println("Введите строку:");
        s = scanner.nextLine();
        String newS = "";
        String[] strArr = s.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--)
        {
            newS.concat(strArr[i] + " ");
        }
        System.out.println("Строка в обратном порядке: " + newS);
        System.out.println();

        //Задача №20
        System.out.println("Введите целое число:");
        n = scanner.nextInt();
        sum = 0;
        while (n / 10 > 9) {
            sum += n % 10;
            n /= 10;
        }
        if (Math.pow(sum, String.valueOf(n).length()) == n)
            System.out.println("Число является числом Армстронга");
        else System.out.println("Число не является числом Армстронга");
    }

    private static int fibonacci(int n)
    {
        if (n <= 1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    private static boolean isNumPrime(int n)
    {
        if (n <= 1) return true;

        else
        {
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}