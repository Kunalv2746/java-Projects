import java.util.*;
public class TowerOFHanoi {
    public static void towerofhanoi(int n, String src, String helper, String destination){
        if(n==1)// base case
        {
        System.out.println("transfer disk "+n+" from "+src+" to "+destination);
        return;
        }
        towerofhanoi(n-1,src,destination,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+destination);
        towerofhanoi(n-1,helper,src,destination);
    }
    public static void main(String[]args){
      Scanner sc= new Scanner(System.in);
      System.out.println("n:");
      int n= sc.nextInt();
      towerofhanoi(n,"S", "H", "D");
    }
}
