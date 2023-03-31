import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        n = sc.nextInt();
        if (n % 400 == 0) {
            System.out.println("leap year!");
        } else if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("normal year");
        }

    }
}
