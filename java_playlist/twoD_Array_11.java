package java_playlist.java_playlist;

import java.util.Scanner;

public class twoD_Array_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int [][] twoD = new int[rows][col];

        for(int i =0; i<rows; i++){
            for(int j=0; j<col; j++){
                twoD [i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<rows; i++){
            for(int j =0; j<col; j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
