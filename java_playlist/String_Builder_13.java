package java_playlist.java_playlist;

public class String_Builder_13 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb.charAt(0));

//      setCharAt index 0 , Replace Character
        sb.setCharAt(0,'p');
        System.out.println(sb);

//        Insert function
        sb.insert(2,'T');
        System.out.println(sb);
//        System.out.println(sb.insert(0,'T'));


//        Delete
        sb.delete(2,3);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("H");
        sb1.append('e'); // append means jorna like a + b
        sb1.append('l');
        sb1.append('l');
        sb1.append('o');
        System.out.println(sb1.length());



        // REVERSE - PROGRAM
        String str = "Like";
        String rstr = "";

        char ch;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            rstr = ch + rstr;
//             how work is this that's why is here
//            System.out.println(rstr);

        }
        System.out.println(rstr);
    }
}
