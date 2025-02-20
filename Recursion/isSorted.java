package Recursion;

import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int x : arr){
            x=sc.nextInt();
        }
        System.out.println(isSort(arr,n,0));
    }
    public static boolean isSort(int arr [],int n,int idx){
        if(idx==n-1)return true;
        if(arr[idx]>arr[idx+1])return false;
        return isSort(arr,n,idx+1);
    }

}
