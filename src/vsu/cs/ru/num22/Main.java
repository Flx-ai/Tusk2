package vsu.cs.ru.num22;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = enterNumber('a');
        int b = enterNumber('b');
        int c = enterNumber('c');
        compareNumbers(a, b, c);
    }

    static int enterNumber(char name) {
        Scanner num = new Scanner(System.in);
        System.out.printf("enter the number %s: ", name);
        return num.nextInt();
    }

    static void compareNumbers(int a, int b, int c) {
       /* int min = Math.min(Math.min(a, b),c);
        int max = Math.max(Math.max(a, b),c);                       Решена задача с использованием библиотеки Math
        int sr = a + b + c - max - min;
        System.out.println("Результат: " + min + " <= " + sr + " <= " + max);
        */

        int min, max, medium;

        if (a>b) {
            max = a; min = b;
        }
        else {
            max = b; min = a;
        }
                                                                    // Решена задача без библиотеки Math
        if (c>max) max = c;

        if (c<min) min = c;

        medium = a + b + c - max - min;
        System.out.println("Результат: " + min +" <= "+ medium +" <= " + max);
    }
}

