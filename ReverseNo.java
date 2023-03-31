import java.util.Scanner;
public class ReverseNo {
    public static void main(String[]args){
      int rem, x;
      String s="";
      Scanner sc= new Scanner(System.in);
      System.out.println("Input no:");
      x=sc.nextInt();
      while(x!=0){
        rem=x%10;
        s=s+Integer.toString(rem);
        x=x/10;


      }
      System.out.println("reverse no:"+s);



    }
}
