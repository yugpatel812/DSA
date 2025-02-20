package Recursion;
import java.util.*;
public class digitPalidrom {
    public static void main(String[] args) {
        int n =1234;

       System.out.println(dp(n));
    }

 static int ans=0;
    static int dp(int n){
        if (n==0)return ans;
        if(n>0){
             ans =ans*10 + n%10;
             return dp(n/10);
        }
        return  ans;
    }
}
