import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Java Dealership:");
        System.out.println(" * for option 'a' to buy a car!");
        System.out.println(" * for option 'b' to sell a car!");

        String option=scan.nextLine();
        
        switch(option){
            case"a":System.out.println("Pleasure! to meet you Sir!\nWhat's your budget to buy a c(00)r?");
                    int budget=scan.nextInt();
                    scan.nextLine();
                    if(budget>=10000){
                        System.out.println(" Nice! we have Fortuner for you!\n ");
                        System.out.println("Do you have driving license? write 'yes'or 'no'\n");
                        String license=scan.nextLine();
                        System.out.println("Do you have insurance? write 'yes'or'no'\n");
                        String insurance=scan.nextLine();
                        System.out.println("Can yu please tell me your credit score?\n");
                        int score=scan.nextInt();
                         if(license.equals("yes")&&insurance.equals("yes")&&score>=680){
                           System.out.println("Congrats! you got this car?");
                         }else{
                            System.out.println("Sorry we can't sell this car due to lack of formalities..\n hope you understand..");
                         }
                    }
                      
                    else{
                        System.out.println("Sorry you don't sell the car under 10000$ !");
                    }

                     break;
            case"b":System.out.println("\nWhat is market value of your car!:\n");
                    int value=scan.nextInt();
                    System.out.println("\nHow much price you want to sell this car!");
                    int price=scan.nextInt();
                    if(value>=50000&&price<=30000){
                      System.out.println("\nWe are interested to buy your car");
                      System.out.println("\n how many years has gone  to this car");
                      int years=scan.nextInt();
                      System.out.println("\n how it's condition?");
                      scan.nextLine();
                      String condition=scan.nextLine();
                      if(years<=4&&condition.equals("good")){
                      System.out.println("\nThis car is our's you can take your amount!");
                      }   else{
                        System.out.println("Sorry! we can't buy this car.\nYou can sell anywhere.");
                      }
                    }
                     break;
            default: System.out.println("You choose an invalid option!\ntry again!");                  
        }
    }
}
