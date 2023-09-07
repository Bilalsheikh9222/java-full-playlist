package java_playlist;

import java.util.*;
public class Loops_04 {
    public static void main(String[] args){
//        Java for loop helps execute a set of code repeatedly

//        counter ++ and counter + 1 same
//        for(int counter = 0; counter < 5; counter = counter + 1){
//            System.out.println("Hello World");
//        }
//        for(int i = 0; i < 11; i++){
//            System.out.print(i+" ");
//        }

//        While
//        int a = 0;
//        while(a < 11){
//            System.out.println(a);
//            a = a+1;
//        }

//        Do while loop
//          int i = 0;
//        do{
//            System.out.println(i);
//            i = i+1;
//        }while(i<11);


//        int i = 12;
//        do{
//           do while loop at least one time print krta hai...
//            System.out.println("Only one time print because ");
//        }while(i<11);

//        Natural number such as 4+3+2+1=10
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int sum = 0;
//        for(int i=0; i <=n; i++){
//            sum = sum +i;
//        }
//        System.out.println(sum);

//        2 table
        for(int i=1; i<11; i++){
            System.out.println(n*i);
        }


//        loop problem
//        Write a program to calculate the sum of first 10 natural number.
//        int n = s.nextInt();
//        int sum = 0;
//
//        for(int i = 1; i<=n; i++){
//            sum +=  i;
//        }
//        System.out.println(sum);

    }
}
