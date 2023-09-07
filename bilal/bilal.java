package bilal;

public class bilal {
    public static void main(String[] args){
        int n=5;
    for(int row =1; row <=2*n; row++){
        int col= row > n?2*n - row: row;
        for(int col1=1; col1<=col; col1++){
            System.out.print("*");
        }
        System.out.println();
    }


    }
}
