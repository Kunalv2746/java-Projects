import java.util.*;
public class Pallindrome {
    public static void main (String[]args){
        int n,c,r,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("The given no:");
        n= sc.nextInt();
        c=n;
        while(n>0){
          r=n%10;// remainder..
          s=(s*10)+r;// output after we get loop breaks..
          n=n/10;// run until loop satisfy..
       }

       if(c==s){
        System.out.println("pallindrome no.");
       }
       else{
        System.out.println("Not a pallindrome no.");
       }
    }
}
