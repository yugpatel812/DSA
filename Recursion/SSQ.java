package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SSQ {
    static ArrayList<String>  getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();

        if(s.length()==0) {
            ans.add(" ");return ans;
        }

        char curr = s.charAt(0);

        for(String ss : getSSQ(s.substring(1))){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println(getSSQ("Abc"));


    }
}
