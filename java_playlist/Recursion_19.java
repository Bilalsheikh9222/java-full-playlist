package java_playlist;

public class Recursion_19 {

// public static int totalPaths(int i, int j, int n, int m){
//        if(i == n || j == n){
//            return 0;
//        }
//        if(i == n-1 && j == n-1){
//            return 1;
//        }
//        // move downwards
//        int downwards = totalPaths(i+1,j,n,m);
//        // move right
//        int rightwards = totalPaths(i,j+1,n,m);
//
//        return downwards + rightwards;
//    }
//    public static void main(String[] args){
//        int n = 3 , m = 3;
//        int countPaths  = totalPaths(0,0,n,m);
//        System.out.println(countPaths);
//        } // totalPaths

//    public static void permutation(String str, String permutation){
//        if(str.length() == 0){
//            System.out.println(permutation);
//            return;
//        }
//        for(int i=0; i<str.length(); i++){
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0,i) + str.substring(i+1);
//            permutation(newStr,permutation+currChar);
//        }
//    }
//    public static void main(String[] args){
//        String str = "abc";
//        permutation(str,"");
//    } // permutation

//public static int totalTiles(int n, int m){
//        if(n < m){
//            return 1;
//        }
//        if(n == m){
//            return 2;
//        }
//        int ver = totalTiles(n-m, m);
//        int hor = totalTiles(n-1, m);
//        return ver + hor;
//    }
//    public static void main(String args[]){
//        int n = 4, m = 2;
//        int  total = totalTiles(n,m);
//        System.out.println(total);
//
//    } // totalTiles

//        public static int inviteN(int n){
//            if(n <= 1){
//                return 1;
//            }
//            int single = inviteN(n-1);
//
//            int pair =(n-1) * inviteN(n -2);
//
//            return single + pair;
//        }
//        public static void main(String[] args){
//            int n = 4;
//            System.out.println(inviteN(n));
//        } // find the number of ways pair or single

//        public static void printSubset(ArrayList<Integer> subset){
//            for(int i = 0; i<subset.size(); i++){
//                System.out.print(subset.get(i));
//            }
//            System.out.println();
//        }
//        public static void findSubsets(int n, ArrayList<Integer> subset){
//            if(n == 0){
//                printSubset(subset);
//                return;
//            }
//
//            // add hoga
//            subset.add(n);
//            findSubsets(n-1, subset);
//
//            // add nh hoga
//            subset.remove(subset.size()-1);
//            findSubsets(n-1, subset);
//        }
//        public static void main(String[] args){
//            int n = 3;
//            ArrayList<Integer> subset = new ArrayList<>();
//            findSubsets(n,subset);
//        } // printSubset

}
