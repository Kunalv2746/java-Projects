
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("let's play rock-paper-scissors:\n");
        String user= scan.nextLine();
       if( user.equals("shoot")){
        System.out.println("choice to play?(say yes or No):\n");
          
          }
          else{
            System.out.println("Something Went Wrong:\n");
            System.exit(0);
          } 
          String choice= scan.nextLine();
          if  (choice.equals("yes")){
          System.out.println("Great!");
          System.out.println("rock -- paper -- scissors, shoot!:\n");
          //-- pick up user's choice.
          String userChoice= scan.nextLine();
          String computerChoice= computerChoice();
          String result=result( computerChoice, userChoice );
          printResult(computerChoice, userChoice, result);
          } else{
            System.out.println("Darn! some other time!");
            System.exit(0);
          }
         
          
          scan.close();
        }


        public static String computerChoice(){
            double num=Math.random()*3;//choose no between 0-2
             int no=(int)num; // type cast double to int...
            
        
            switch(no){
            case 0:    return "rock";
                       
            
             case 1:   return "paper";
                        
            
             case 2:   return "scissors";

            
             default:   return "out of the choice!";
              
            }
            
            }
         

         public static String result(String computerChoice, String userChoice ){
            String result;
            if(computerChoice.equals("scissors") && userChoice.equals("rock") ){
                result="You Win!";
             }else if(computerChoice.equals("paper") && userChoice.equals("rock")){
                result="You Lose!";

             } else if(computerChoice.equals("paper") && userChoice.equals("scissors")){
                result="You Win!";
             }
             else if(computerChoice.equals("rock") && userChoice.equals("scissors")){
                result="You Lose!";
             } else if(computerChoice.equals("rock") && userChoice.equals("paper")){
                result="You Win!";

             } else if(computerChoice.equals("scissors") && userChoice.equals("paper")){
                 result= "You Lose"; 
             } 
             else{
                result= "tie";
             }
            return result;
         } 
         public static void printResult(String computerChoice,String userChoice,String result){
            System.out.println("\nYou choose:" + userChoice); 
          System.out.println("\tThe computer chose:" + computerChoice);
           result =result(computerChoice, userChoice);
          System.out.println(result);
         }  
        }

