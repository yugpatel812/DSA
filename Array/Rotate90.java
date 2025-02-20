package Array;

import java.util.Scanner;

public class Rotate90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] [] = new int[3][3];
        for(int i =0; i <3 ; i++){
            for (int j=0 ; j<3 ; j++){
                arr[i][j] =sc.nextInt();
            }
        }
        print(arr);
        transpose(arr);
        reverse(arr);
        print(arr);
    }
    static void swap(int arr[][], int i , int j){
        int temp = arr[i][j];
        arr[i][j]=arr [j][i];
        arr [j][i]=temp;

    }
    static void transpose(int [][]arr){
        for(int i =0 ; i<3 ; i++){
            for(int j =0 ; j<i;j++){
                swap(arr,i,j);
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
static void reverse(int arr [][]){

        for(int k=0;k<3;k++){
            int j=2,i=0,temp;
        while (i<j){
           temp=arr[k][i];
           arr[k][i]=arr[k][j];
           arr[k][j]=temp;
           i++;j--;
        }
        }
}
}
