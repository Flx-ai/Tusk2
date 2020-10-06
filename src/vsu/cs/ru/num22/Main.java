package vsu.cs.ru.num22;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите 3 числа");
        int a = readValue();
        int b = readValue();
        int c = readValue();
        compareNumbers(a,b,c);
    }

    static int readValue() {
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }

    static void compareNumbers(int a, int b, int c) {
       /* int min = Math.min(Math.min(a, b),c);
        int max = Math.max(Math.max(a, b),c);                       Решена задача с использованием библиотеки Math
        int sr = a + b + c - max - min;
        System.out.println("Результат: "+ min +"<="+ sr +"<="+ max);
        */

        int min, max, sr;
        if (a>b) {
            max = a; min = b;
        }
        else {
            max = b; min = a;
        }
        // Решена задача без библиотеки Math
        if (c>max) max = c;

        if (c<min) min = c;

        sr = a + b + c - max - min;
        System.out.println("Результат: "+ min +"<="+ sr +"<="+ max);
    }

}
