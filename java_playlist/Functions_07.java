package java_playlist;

import java.util.*;
public class Functions_07{
//    The primary uses of methods in Java are: It allows code reusability (define once and use multiple times) You can break a complex program into smaller chunks of code. It increases code readability.

// /* Access Modifer */    public static return type functionName(type arg1 or parameter, type arg2 ,.,.,...)
//    Print Name
//    public static void printMyName(String name){
//    System.out.println(name);
//    return;
//    }
//    Print Sum 2 number
//    public static int calculateSum(int a, int b){
//        int sum = a+b;
//        return sum;
//    }

//    Multiply 2 Number
//    static int mul (int a, int b){
//        return a * b;
//    }

//    Factorial Number
    public static void Factorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial =1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;

        // Print Any Table

//        public static void table(int n){
//        for(int i=1; i<=10; i++){
//            System.out.println(n*i);
//        }
//        return;
//        }

//      Make a function to check if a given number n is even or not.
//        public static void even(int n){
//            if(n % 2==0){
//                System.out.print("Even");
//            }else{
//                System.out.print("Not Even");
//            }
//            return;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        Print Name
//        String name = sc.next();
//        printMyName(name);


//        Sum 2 Number
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = calculateSum(a , b);
//        System.out.println("Sum of 2 num:"+sum);

//        Multiply 2 Number
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("Product of 2 number is: "+ mul(a , b));

//        Factorial Number

        int n= sc.nextInt();
        Factorial(n);

        // Print Any table
//
//        int n= sc.nextInt();
//        table(n);
    }
}



//    I don't know What it's working;

//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//    int sum= (a + b + c)/3;
//        System.out.println(sum);