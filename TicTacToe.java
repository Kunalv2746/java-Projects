import java.util.Scanner;
public class TicTacToe{
   static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("\nLet's play tic tac toe");

        //Task 1: Create an array with three rows of '_' characters.

        //Task 2: Call the function printBoard();
                 
             char[][] board={{'_','_','_'},
                             {'_','_','_'},
                             {'_','_','_'}};

             printBoard(board);
           for(int i=0;i<9;i++){
            if(i%2==0)
            {
              System.out.println("Turn: X");
              int[] spot=askUser(board); // for spoting the value in board.
              board[spot[0]][spot[1]]='X'; // for printing the X on board at spotted value
              printBoard(board);               
            }
            else{
              System.out.println("Turn: O");
              int[] spot=askUser(board);// for spoting the value in board.
              board[spot[0]][spot[1]]='O'; // for printing the 0 on board at spotted value
              printBoard(board);
            }
            
            if (checkWin(board) == 3) {
              System.out.println("X wins!!");
              break;
          } else if (checkWin(board) == -3) {
              System.out.println("O wins!!");
              break;
          } else if (i == 8) {
              System.out.println("It's a tie!");
          }
              
        }
            scan.close();
    }
  

/** Task 2 - Write a function that prints the board.
 * Function name - printBoard()
 * @param board (char[][])
 * 
 * Inside the function:
 *   1. print a new line.
 *   2. print the board.
 *      • separate each row by two lines. 
 *      • each row precedes a tab of space
 *      • each character in the grid has one space from the other character
 */ 

   public static void printBoard(char[][] board){
      System.out.print ("\n");
     for(int i=0;i<board.length;i++){
      System.out.print("\t");
        for(int j=0;j<board[i].length;j++){
          System.out.print(board[i][j]+" ");
        }
        System.out.print("\n\n");
     }
    }

/** Task 4 - Write a function that lets the user choose a spot
 * Function name – askUser
 * @param board (char[][] board)
 * @return spot (int[])
 * 
 * Inside the function
 *   1. Asks the user: - pick a row and column number: 
 *   2. Check if the spot is taken. If so, let the user choose again.
 *   3. Return the row and column in an int[] array.
 * 
 */
   public static int[] askUser(char[][] board) {
     System.out.print("pick a row and column number:");
      int row =scan.nextInt();
      int element=scan.nextInt();
     // while(board[row][element]=='X'|| board[row][element]=='0'){
      // we can write shortest condition..
      while(board[row][element]!='_'){
      System.out.println("Spot taken,try again!");
        row =scan.nextInt();
       element=scan.nextInt();
      }
      int[] spot={row,element}; 
      //return new int[] {row,element};    // from cheat sheet to return the new array values on place of previous one array of(_)--- 
       return spot;
   }
/** Task 6 - Write a function that determines the winner
 * Function name - checkWin 
 * @param board (char[][])
 * @return count (int)
 * 
 * Inside the function:
 *   1. Make a count variable that starts at 0.
 *   2. Check every row for a straight X or straight O (Task 7).
 *   3. Check every column for a straight X or straight O (Task 8).
 *   4. Check the left diagonal for a straight X or straight O (Task 9).
 *   5. Check the right diagonal for a straight X or straight O (Task 10).
 */
public static int checkWin(char[][] board) {
    
  //Check each of 3 rows
  int count = 0;

  for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
          if (board[i][j] == 'X') {
              count++; //count each X as +1
          } else if (board[i][j] == 'O') { 
              count--; //count each O as -1. 
          }
      }
      if (count == 3 || count == -3) {
          return count;
      } else {
          count = 0;
      }

  }

  for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {

          if (board[j][i] == 'X') {
              count++; //count each X as +1
          } else if (board[j][i] == 'O') { 
              count--; //count each O as -1. 
          }
      }
      if (count == 3 || count == -3) {
          return count;
      } else {
          count = 0;
      }
  }

  for (int i = 0; i < 3; i++) {
      if (board[i][i] == 'X') {
          count++; //count each X as +1
      } else if (board[i][i] == 'O') { 
          count--; //count each O as -1. 
      }
  }

  if (count == 3 || count == -3) {
      return count;
  } else {
      count = 0;
  }

  for (int i = 0; i < 3; i++) {
      if (board[i][2-i] == 'X') {
          count++; //count each X as +1
      } else if (board[i][2-i] == 'O') { 
          count--; //count each O as -1. 
      }
  }

  return count;
}

}

       
