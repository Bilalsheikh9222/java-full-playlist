package java_playlist;

import java.util.*;
public class Practice{
    public static void des(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        des(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        des(5);
    }
}