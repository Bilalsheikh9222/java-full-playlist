package java_playlist.java_playlist;

import java.util.*;
public class Array_10 {
    public static void main(String[] args){
//        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.


//        type [] array name = new int[values];
//        int [] marks = new int[3];
//        int marks[] = new int[3];
//        marks[0] = 97; //phy
//        marks[1] = 98; //chem
//        marks[2] = 99; //eng
////        System.out.println(marks[0]);
//        for(int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }

//        Second Method Array
//        int marks[] = {97,98,87};
//
//        for(int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }

//        Third Method Array

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<=size; i++){
            System.out.println(numbers[i]);
        }

//        1st method
        int an[]; // Declaration
        an = new int[5]; // memory allocation
        // Initialization
        an[0] = 85;
        an[1] = 99;
        an[2] = 88;
        an[3] = 92;
        an[4] = 55;
        for(int i=0; i<5; i++){
            System.out.println(an[i]);
        }

//        2.Method
//        Declaration and then memory allocation
//        int an[] = new int[5];
//        an[0] = 98;
//        an[1] = 88;
//        an[2] = 82;
//        an[3] = 22;
//        an[4] = 21;
//        System.out.println(an[4]);

//        3.Method
//        Declaration, memory allocation and intialization together
//        int an[] ={59,58,98,100};
//
//
//        for(int i=0; i<4; i++){
//            System.out.println(an[i]);
//        }

//        Array Even Number

//        int a = sc.nextInt();
//        int an[] = new int[a];
//        for(int i=0; i<a; i++){
//            an[i] = sc.nextInt();
//        }
//        for(int j=0; j<a; j++){
//            if(an[j] % 2 ==0){
//                System.out.println(an[j]);
//            }
//        }

    }
}
