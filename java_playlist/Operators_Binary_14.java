package java_playlist;

import java.util.*;
public class Operators_Binary_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      post increment a++  /-----/ pre increment ++a
          int a = 10;
          int b = a;

//      pre increment
          b = ++a;
//      post increment
//          b = a++;
          System.out.println(b);

//      RELATIONAL OPERATORS
//      EQUAL TO == ,NOT EQUAL TO != ,GREATOR THAN > ,LESS THAN < ,GREATOR THAN EQUAL TO >= ,LESS THAN EQUAL TO <=
          int c = 10;
          int d = 20;

//      EQUAL TO
          if(c == d){
              System.out.println("They are equal");
          }else{
              System.out.println("They are not equal");
          }

//      NOT EQUAL
          if(c != d){
              System.out.println("They are not equal");
          }else{
              System.out.println("They are equal");
          }

//      LOGICAL OPERATOR
//      && LOGICAL AND ,|| LOGICAL OR ,LOGICAL NOT !
            if(c == d && c<=d){
                System.out.println("This is false");
            }else{
                System.out.println("This is true");
            }
//      logical not
            if(!(c==d)){
                System.out.println("They are not equal but is print");
            }


            int bit = c & d;
            System.out.println(bit);

//            ^ XOR OPERATOR
//            ~ BINARY ONE'S COMPLEMENT
//            << BINARY LEFT SHIFT
//            >> BINARY RIGHT SHIFT


//        ASSIGNMENT OPERATOR
//        = , += , -= , *= , /= , %=
    }
}
