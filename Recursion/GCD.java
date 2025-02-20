package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int m= sc.nextInt();
        int n = sc.nextInt();
        System.out.println(gcd(m,n));
    }
    static int gcd(int m , int n){
        if (n==0)return m;
        return gcd(n,m%n);
    }
}
