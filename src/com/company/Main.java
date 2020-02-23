//https://onedrive.live.com/view.aspx?resid=5953DCCFCD1F0405!12763&ithint=file%2cxlsx&authkey=!AOJguV3Ngjn6sNs
//Лабораторная работа 1, вариант №15
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        double a = sc.nextDouble();
        System.out.println("Введено число:" + a);

        System.out.println("Введите число b:");
        double b = sc.nextDouble();
        System.out.println("Введено число:" + b);

        System.out.println("Введите число u:");
        double u = sc.nextDouble();
        System.out.println("Введено число:" + u);

        System.out.println("Введите число x:");
        double x = sc.nextDouble();
        System.out.println("Введено число:" + x);

        if(x<a)
        {
            System.out.printf(" 1) Если x<a , значение f(x) = %.3f%n", Math.log(Math.pow(Math.cos(Math.PI*x),2)));
        }
        if(x>b)
        {
            System.out.printf(" 3) Если x>b , значение f(x) = %.3f%n", (x+5)/(Math.tan(Math.PI*x)));
        }
        else
        {
            System.out.printf(" 2) Если x E[a;b] , значение f(x) = %.3f%n", (x+u)/Math.pow(x+25,2));
        }

    }
}