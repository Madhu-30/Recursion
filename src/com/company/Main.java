package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ch=0;
        do {
            System.out.println("1. Sum of N Natural numbers " + "\n" + "" +
                    "2. Find a^b" + "\n" +
                    "3. Fibonocci series upto n terms" + "\n" +
                    "4. Factorial of number n : " + "\n" +
                    "5. Reverse a string s" + "\n" +
                    "6. Sum of digits of number n ");
             ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("For sum of N natural numbers, enter n : ");
                    int n = scanner.nextInt();
                    System.out.println("Sum is " + sumNatural(n));
                    break;

                case 2:
                    System.out.println("For a^b,enter a and b : ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Power is " + power(a, b));
                    break;

                case 3:
                    System.out.println("For fibonocci series of n terms, enter n : ");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print(fibo(i));
                    }
                    break;

                case 4:
                    System.out.println("For factorial of n : ");
                    n = scanner.nextInt();
                    System.out.println("Factorial is " + factorial(n));
                    break;

                case 5:
                    System.out.println("String is : ");
                    String s = scanner.next();
                    System.out.println("Reversed string is " + revString(s));
                    break;
                case 6:
                    System.out.println("For sum of digits of n, enter n : ");
                    n = scanner.nextInt();
                    System.out.println("Sum of digits is " + sumDigits(n));
                    break;
            }
        }while (ch>0 && ch<=6);
        // write your code here
    }

    private static int sumDigits(int n) {
        if(n<=9){return n;}
        return sumDigits(n/10)+(n%10);
    }

    private static String revString(String s) {
        if(s.length()==1){return s;}
        return (s.charAt(s.length()-1)+revString(s.substring(0,s.length()-1)));
    }

    private static int factorial(int n) {
        if(n==0){return 1;}
        return (n*factorial(n-1));
    }

    private static int fibo(int n) {
        if(n == 0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return (fibo(n-1)+fibo(n-2));
    }

    private static int sumNatural(int n) {
        if(n==1){
            return 1;
        }
        return (sumNatural(n-1)+n);
    }

    private static int power(int a, int b){
        if(b == 1){return a;}
        return (a*power(a,b-1));
    }
}
