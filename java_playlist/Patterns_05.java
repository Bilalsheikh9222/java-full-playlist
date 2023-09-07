package java_playlist;

public class Patterns_05 {
    public static void main(String[] args) {

//        int n = 4;
//        int m = 5;


//  Solid Rectangle
//         outer loop
//        for(int i=1; i<=n; i++){
////            inner loop
//        for(int j=1; j<=m; j++){
//            System.out.print("*");
//        }
//        System.out.println();
//        }


//    Hollow Rectangle
//        outer loop
//        for(int i=1; i<=n; i++){
//            //inner loop
//            for(int j=1; j<=m; j++){
//                // cell -> (i,j)
//                if(i == 1 || j == 1 || i == n || j == m){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int r= 5;
//        int c=4;
//
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=c; j++){
//                if(i==1 || j ==1 || i==r-1 || j==c){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        Half pyramid
//    for(int i=1; i<=n; i++){
//        inner loop
//        for(int j=1; j<=i; j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }

//        Inverted Half Pyramid
//          for(int i=n; i>=1; i--){
//              //inner loop
//              for(int j=1; j<=i; j++){
//                  System.out.print("*");
//              }
//              System.out.println();
//          }

//          180deg half payramid
//        int n =4;
//        for(int i=1; i<=n; i++){
//            //inner loop -> space print
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
            // inner loop -> star print
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Half pyramid with number
//        int n=5;
//        outer loop
//        for(int i=1; i<=n; i++){
////            inner loop
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
////            New line
//            System.out.println();
//        }

//        inverted  Half payramid with number
//        for(int i=1; i<=n; i++){
//            inner loop
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        Floyd's Triangle
//        int n =5;
//        int number=1;
////        outer loop
//        for(int i=1; i<=n; i++){
////            inner loop
//            for(int j=1; j<=i; j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

//        0-1 Triangle
//        int n = 5;
//        for(int i=1; i<=n; i++) {
////            inner loop
//            for (int j=1; j <= i; j++) {
//                int sum = i + j;
//                if (sum % 2 == 0) { //even
//                    System.out.print("1 ");
//                } else { //odd
//                    System.out.print("0 ");
//                }
//            }
////            New line print
//            System.out.println();
//        }



//        Homework Pattern -- number payramid
//        int r= 5;
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }



//        Solid rhombus

//        int r=5;
//        int c=4;
//
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r-i; j++){
//                System.out.print(" ");
//            }
//            for(int s=1; s<=c; s++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        int r=5;
//
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            for(int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // Butterfly Pattern

//        int n = 4;
////        upper half
//        for(int i=1; i<=n; i++) {
////            1st part
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            // spaces
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
////             2nd part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        lower half
//        for(int i=n; i>=1; i--){
////            1st part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            // spaces
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            // 2nd part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Rhombos pyaramid
//        int r=5;
//
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r-i; j++){
//                System.out.print(" ");
//            }
//            for(int s=1; s<=r; s++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Number pyramid
//        int r=5;
//
//        for(int i=1; i<=r; i++){
//            for(int s=1; s<=r-i; s++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        // Palindromic Pattern
//        int r=5;
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            for(int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }



//        Diamond
//        int r=4;
//
//        for(int i=1; i<=4; i++){
//            for(int s=1; s<=r-i; s++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i=r; i>=1; i--){
//            for(int s=1; s<=r-i; s++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Inverted Half pyramid number
//        int r=4;
//        for(int i=r,p=1; i>=1; i--,p++){
//            for(int j=1; j<=i; j++){
//                System.out.print(p);
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                if(i % 2==0){
//                    System.out.print("2");
//                }else{
//                    System.out.print("1");
//                }
//            }
//            System.out.println();
//        }

//        Number Diamond
        int n=5;
        for(int i=1; i<n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
//
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }for(int j=1; j<=i; j++){
//                System.out.print(i);
//            }for(int j=2; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        number pyramid 5 to 1
//        int n=5;
//        for(int i=1,p=5; i<=n; i++,p--){
//            for(int j=1; j<=i; j++){
//                System.out.print(p);
//            }
//            System.out.println();
//        }
    }
}