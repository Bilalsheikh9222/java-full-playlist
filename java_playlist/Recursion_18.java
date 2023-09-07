package java_playlist;

public class Recursion_18{

}
//import java.util.*;
//public class java_playlist.java_playlist.Recursion_18 {
//    public static void revStr(String str, int indx){
//        if(indx == 0){
//            System.out.println(str.charAt(indx));
//            return;
//        }
//        System.out.print(str.charAt(indx));  // work
//        revStr(str,indx-1); // recursion
//    }
//    public static void main(String[] args){
//        String str = "abcd";
//        revStr(str, str.length()-1);
//    }
//} // Reverse String

//public class java_playlist.java_playlist.Practice{
//    //    Src, Auxiliary, Destination.
//    public static void towerOfHanoi(int n ,String Src ,String Helper ,String Dest){
//        if(n == 1){ // Base Case
//            System.out.println("Transfer disk from "+n+" from "+Src+" to "+Dest);
//            return;
//        }
//        towerOfHanoi(n-1,Src,Dest,Helper);
//        System.out.println("Transfer disk from "+n+" from "+Src+" to "+Dest);
//        towerOfHanoi(n-1,Helper,Src,Dest);
//    }
//    public static void main(String[] args){
//        int n = 3;
//        towerOfHanoi(n, "S","H","D");
//    }
//} // Tower of Hanoi

//import java.util.*;
//public class java_playlist.java_playlist.Practice{
//    public static int first = -1;
//    public static int last  = -1;
//    public static void findOcurrence(String str, int indx, char element){
//        if(indx == str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currChar = str.charAt(indx);
//        if(currChar == element) {
//            if (first == -1) {
//                first = indx;
//            } else {
//                last = indx;
//            }
//        }
//        findOcurrence(str,indx+1,element);
//    }
//    public static void main(String[] args){
//        String str = "abaacdaefaah";
//        findOcurrence(str,0,'a');
//    }
//} // FindOccurrence

//public class java_playlist.java_playlist.Practice{
//    public static boolean isSorted(int arr[], int indx){
//        if(indx == arr.length-1){
//            return true;
//        }
//
////        if(arr[indx] < arr[indx+1])
//        if(arr[indx] >= arr[indx+1]){
////            array is sorted till now
////            return isSorted(arr,indx+1);
//            return false;
//            } //else{
////            return false;
//        return isSorted(arr,indx+1);
//        }
//    public static void main(String[] args){
//     int arr[] = {1,2,3,5};
//     System.out.println(isSorted(arr,0));
//
//    }
//} // This is is Sorted --    isSorted Array

//import java.util.*;
//public class java_playlist.java_playlist.Practice{
//    public static void moveAllX(String str, int index, int count, String newString){
//        if(index == str.length()){
//            for(int i=0; i<count; i++){
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(index);
//        if(currChar == 'x'){
//            count++;
//            moveAllX(str,index+1, count, newString);
//        }else{
//            newString += currChar;
//            moveAllX(str,index+1,count, newString);
//        }
//    }
//    public static void main(String[] args){
//    moveAllX("axbcxxd",0,0,"");
//    }
//} // this is move all x to end

//public class java_playlist.java_playlist.Practice{
//    public static boolean[] map = new boolean[26];
//    public static void removeDuplicates(String str, int indx, String newString){
//        if(indx == str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(indx);
//        if(map[currChar - 'a'] == true){
//            removeDuplicates(str,indx+1,newString);
//        }else{
//            newString += currChar;
//            map[currChar - 'a'] = true;
//            removeDuplicates(str,indx+1,newString);
//        }
//    }
//    public static void main(String[] args){
//        String str = "abbccda";
//        removeDuplicates(str,0,"");
//    }
//} // Remove Duplicate // Remove Duplicate

//public class java_playlist.java_playlist.Practice{
//    public static void subsequences(String str,int index, String newString){
//        if(index == str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(index);
//
////        call one -- to be
//        subsequences(str,index+1,newString+currChar);
////        call two -- or not
//        subsequences(str,index+1,newString);
//    }
//    public static void main(String[] args){
//        String str = "abc";
//        subsequences(str,0,"");
//    }
//} // Subsequence

//import java.util.HashSet;
//public class java_playlist.java_playlist.Practice{
//    public static void uniqueSubseq(String str, int index, String newString, HashSet<String> set){
//        if(index == str.length()){
//            if(set.contains(newString)){
//                return;
//            }else{
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//        }
//
//        char currChar = str.charAt(index);
//        // to be
//        uniqueSubseq(str,index+1,newString+currChar,set);
//        // or not
//        uniqueSubseq(str,index+1, newString, set);
//    }
//    public static void main(String[] args){
//    String str = "aaa";
//    HashSet<String> set = new HashSet<>();
//    uniqueSubseq(str,0,"",set);
//    }
//} // Unique Subsequence