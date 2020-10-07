package vsu.cs.ru.num22;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = readValue('a');
        int b = readValue('b');
        int c = readValue('c');
        compareNumbers(a, b, c);
    }

    static int readValue(char name) {
        Scanner num = new Scanner(System.in);
        System.out.printf("enter the number %s: ", name, " ");
        return num.nextInt();
    }

    static void compareNumbers(int a, int b, int c) {
        int max, min;

        if (a > b) {
            max = a;  min = b;
        }
        else {
            max = b; min = a;
        }

        if (c > max) max = c;

        if (c < min) min = c;

        int medium = calcMedium(a, b, c, max, min);
        printResult(max, min, medium);
    }

    static int calcMedium(int a, int b, int c, int max, int min) {
        return a + b + c - max - min;
    }

    static void printResult(int max, int min, int medium) {
        System.out.println("Результат: " + min +" <= "+ medium +" <= " + max);
    }
}
