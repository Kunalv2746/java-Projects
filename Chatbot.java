package Section2;
import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
       System.out.println("Hello my name is Chatbot, I am here to ask some question\n\n");
       
       Scanner scan=new Scanner(System.in);

       System.out.println("What's your name?:\n");
       String name=scan.nextLine();
       
       System.out.println("Hi! "+name+" where are you from?:\n");
       String place=scan.nextLine();
       System.out.println("I know "+place+" is a beautiful place to travel but I am from oracle:\n");

         
       System.out.println("Now tell me your age:\n");
       int age=scan.nextInt();
       System.out.println("oh! Nice to hear that's Cool! but I'm 400 years Old..\n that means I am"+(400/age)+" times older than you.\n that's Enough about me..What's your favourite language (Just don't Say Python)\n");
       scan.nextLine();// this is used for  skipped portion of this line to use  while compile and run the code
       String lang=scan.nextLine();
       System.out.println(" "+lang+" That's great. Nice chatting with you "+name+". Now I have to log off now. See ya");
       scan.close();
    }
}
