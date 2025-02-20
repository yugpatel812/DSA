package Recursion;

import java.util.Scanner;

public class lastIdx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(lastIdx(arr,n-1,target));
    }

    public static int lastIdx(int arr[],int idx,int target){

        idx--;
        if(idx==0) return -1;
        if (arr[idx]==target)return idx;
        return lastIdx(arr,idx-1,target);
    }
}
