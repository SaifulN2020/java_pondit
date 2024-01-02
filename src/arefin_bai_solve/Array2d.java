package arefin_bai_solve;
//details of 2d array
public class Array2d {
    public static void main(String[] args) {


    int [][] arr2d={{2,8,9},{4,8,6},{8,4,7}};
    for(int x=0; x<3; x++){
        for(int j=0;j<3;j++){
            System.out.printf("x=%d,j=%d,value= %d" ,x,j ,arr2d[x][j]);
            System.out.println(" ");
        }
    }
}}
