package java_playlist.java_playlist;

public class backTracking_20 {
    public static void printPermutation(String str, int index, String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr,index+1,perm + currChar);
        }
    }
    public static void main(String[] args){
    String str = "ABC";
    printPermutation(str,0,"");
    }
}
