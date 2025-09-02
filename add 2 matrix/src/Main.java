import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] mat2= {{1,2,3},{4,5,6},{7,8,9}};
        int [][] resultarr= new int[3][3];
        //adding two arrays
        for(int i =0; i<3;i++){
            for(int j = 0; j<3 ; j++){
                resultarr[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i=0; i<3 ; i++){
            for(int j=0; j<3;j++){
                System.out.print(resultarr[i][j]+" ");
            }
            System.out.println();
        }


    }
}