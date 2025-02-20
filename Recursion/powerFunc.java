package Recursion;

import java.util.Scanner;

public class powerFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int m= sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow2(m,n));

    }
    static  int pow(int m,int n){
        if( n==0)return 1;
        return pow(m,n-1) * m;
    }

    // half recursion used
    // m^ 6 = m^3 * m^3
    // m^7 = m^3 * m^3 *m
    static  int pow2 (int m, int n){
        if(n==0)return 1;

        if(n%2==0){
            return pow(m,n/2) * pow(m,n/2);
        }
        else return pow(m,n/2) *  pow(m,n/2) * m;
    }
}
