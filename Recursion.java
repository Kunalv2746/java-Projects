import java.util.*;
public class Recursion {
    public static void main(String[]args){
        // use recursion to print the number from no to 0;
        Scanner sc= new Scanner(System.in);
       System.out.print("print num:");
       int s = sc.nextInt();
       System.out.println();
        printNum(s);
        System.out.print("\nprint num:");
       int r = sc.nextInt();
        System.out.println();
        printNum1(r);
    }
    // recursion .. for 1 to n... 
    public static void printNum(int n){
        if(n==6 || n==-1){
            return;
        }
        System.out.print(n);
        printNum(n+1);
        return;
    }
    //recursion for n to 0;
    public static void printNum1(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printNum1(n-1);
        return;
    }
}
