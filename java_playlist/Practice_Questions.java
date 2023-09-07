package java_playlist;

import java.util.*;
public class Practice_Questions {
    public static void odd(int n){
        int sum =0;
        for(int i=1; i<=n; i++){
            if(n % 2 != 0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

//        Question :1
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int ans = (a+b+c)/3;
//        System.out.println(ans);

//        Question :2
        int n= sc.nextInt();
        odd(n);
    }
}
