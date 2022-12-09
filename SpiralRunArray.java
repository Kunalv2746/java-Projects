import java.util.*;
public class SpiralRunArray {
    public static void main(String[]args){
        // array input 
      Scanner sc=new Scanner(System.in);
      System.out.println("row:");
      int r=sc.nextInt();
      System.out.println("column:");
      int c=sc.nextInt();

      // create array of r*c size
      int[][]pArray=new int[r][c];

      // print array to get value
      System.out.println("Here fill the value of matrix:");
      
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          pArray[i][j]=sc.nextInt(); 
        }
      }

      // for spiral format printing in order 1 5 7 9 10 11 21 41 70 105 95 81 79 
      //70 40 15 9 6 10 12 13 20 32 68 63 59 55 25 29 20 29

      System.out.println("Spiral order of the input  matrix:");

      int minRow=0;
      int maxRow=r-1;
      int minCol=0;
      int maxCol=c-1;

      while(minRow<=maxRow && minCol<=maxCol){
        // top 
         for(int j=minCol;j<=maxCol;j++){
            System.out.print(pArray[minRow][j]+" ");
         }
         minRow++;
        //right
        for(int i=minRow;i<=maxRow;i++){
            System.out.print(pArray[i][maxCol]+" ");
         }
         maxCol--;
        //bottom
        for(int j=maxCol;j>=minCol;j--){
            System.out.print(pArray[maxRow][j]+" ");
         }
         maxRow--;
        //left
        for(int i=maxRow;i>=minRow;i--){
            System.out.print(pArray[i][minCol]+" ");
         }
         minCol++;

         System.out.println();
      }

    }
}
