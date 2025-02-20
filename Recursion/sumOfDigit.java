package Recursion;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOD(n));
    }
    static int sumOD(int n){
        if(n <10)return n;

        return sumOD(n/10) + n%10;
    }
}
