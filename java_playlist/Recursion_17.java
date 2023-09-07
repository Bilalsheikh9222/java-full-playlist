package java_playlist.java_playlist;

// Recursion call to itself
public class Recursion_17 {
//    For Descending Order
//    public static void printNum(int n){
//        if(n==0){ //Base Case
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//    // function 2 for Ascending Order
//    public static void asc(int n){
//        if(n == 6){
//            return;
//        }
//        System.out.println(n);
//        asc(n+1);
//    }

//  "N" natural number
//    public static void sumOfN(int i, int n, int sum){
//        if(i == n){
//            sum +=i;
//            System.out.println(sum);
//            return;
//        }
//        sum +=i;
//        sumOfN(i+1,n,sum);
//        System.out.println(i);
//    }

    //  Factorial Number Sum
    public static int calculateFac(int n) {
//    Base Case
        if (n == 1 || n == 0) {
            return 1;
        }
        int fac_nm1 = calculateFac(n - 1);
        int fact_n = n * fac_nm1;
        return fact_n;
    }

    // Fibonacci
    public static void printFib ( int a, int b, int n){
        if (n == 0) { // Base Case
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1); // Recursion
    }

    public static void main(String[] args) {

//  Descending Order
//    int n = 5;
//    printNum(5);

//  Ascending Order
//    int i = 1;
//    asc(i);

//    Sum of "n" Natural Number
//      sumOfN(1,5,0);


//    Calculate Factorial Number
//        int n = 5;
//        int ans = calculateFac(n);
//        System.out.println(ans);



        // Fibonacci
        int a = 0, b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n - 2);


    }
}


//    public static int calPower(int x, int n){
//        if(n == 0){
//            return 1;
//        }
//        if(x == 0){
//            return 0;
//        }
//        int xPownm1 = calPower(x ,n-1);
//        int xPower = x * xPownm1;
//        return xPower;
//    }
//    public static void main(String[]args){
//        int x = 2; int n = 5;
//        int ans = calPower(x,n);
//        System.out.println(ans);
//    } // x^n Stack height = n

// print x^n(stack height = logn) -- left




