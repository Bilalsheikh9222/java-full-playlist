package java_playlist;

import java.util.*;
class Strings_12 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in); // non-primitive type
//            index value 0
//        String name = "Tony";
//        System.out.println(name);

//          String name = sc.nextLine();
//          System.out.println(name);

//             Concatenation and length
//          String fName = sc.next();
//          String lName = sc.next();
//          String fullName = fName + "@" + lName;
//          System.out.println(fullName);
//          System.out.println(fullName.length());


//            charAt
//            String fName = sc.next();
//            for(int i=0; i < fName.length(); i++){
//                System.out.println(fName.charAt(i));
//            }


//              s1 > s2 : print positive value +ve
//              s1 == s2 : print 0
//              s1 < s2 : print Negative value -ve

//            hello --- bello

//              String name1 = "Tony";
//              String name2 = "Tony";

//          Compare to
//              if(name1.compareTo(name2) == 0){
//                  System.out.println("Strings are equals");
//              }else{
//                  System.out.println("Strings are not equal");
//              }

//            Substring
//              String sentence = "My name is john";
//              (begin index, End index)
//              String name = sentence.substring(11);
//              System.out.println(name);

//                Substring2
//                  String sentence = "TonyStark";
//                  String name = sentence.substring(4);
//                  System.out.println(name);


//                Substring3
//                   index zero
                     String sentence = "TonyStark";
//                     (begin value, End value)
                     String name = sentence.substring(0,4);
                     System.out.println(name);
    }
}
