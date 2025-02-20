package Array;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height of pascal triangle");
        int n=sc.nextInt();
        int arr [] [] =new int[n][];

        pascalFun(arr,n);


        print(arr);
    }
    static void pascalFun(int arr [][], int n) {
        for ( int i =0; i < n ;i++) {
            arr[i]= new int[i+1];   //we have not assign no.of column so
            for(int j =0 ; j <=i; j++) {
         if(i==j || j==0 ) {
             arr[i][j]=1;
         }
         else {
         arr[i][j]=arr[i-1][j] + arr[i-1][j-1];
         }
            }
        }
    }
    static void print( int [][] arr){
        for(int x[] : arr){
            for (int y :x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}

