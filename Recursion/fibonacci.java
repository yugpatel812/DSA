package Recursion;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        System.out.println(fib(n));

    }

    static int fib(int n){

        if (n==0 || n==1 )return n;
        return fib(n-1) +fib(n-2);

    }
}
