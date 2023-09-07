package java_playlist.java_playlist;

import java.util.*;
public class bit_Manipulation_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//      Single ampersand sign use with bitwise operator
//        BitMask - 0001
//        GET BIT , SET BIT , CLEAR BIT , UPDATE BIT
//        Index Start from zero --> 0
//        GET bit
//        int n = 5; // 0101
//        int pos = 1;
//        1 left shift by position times
//        int bitMask = 1<<pos;
//        if((bitMask & n) == 0){
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }

//        SET bit
//        int n = 5; //0101
//        int pos = 1;
//        int bitMask = 1<<pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);



//        Clear Bit
//        int n = 5;
//        int pos = 2;
//        int bitMask = 1<<pos;
//        int notBitMask = ~(bitMask);
//
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);

//        Update bit
        Scanner s =new Scanner(System.in);
        int oper  = s.nextInt();

        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1){

        int newNumber = bitMask | n;
        System.out.println(newNumber);

        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
