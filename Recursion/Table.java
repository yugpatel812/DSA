package Recursion;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number & k :");
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ex = tab(m, k);

    }
static int tab(int m,int k){
        int sum;
        if (k==1){
            System.out.println(m + "*" + k +"=" + m);
            return m;
        }
      sum=tab(m,k-1) +m;

    System.out.println(m + "*" + k +"=" + sum);
    return sum;
}
}