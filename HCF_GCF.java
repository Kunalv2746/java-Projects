import java.util.*;

public class HCF_GCF {
    public static void main(String[] args) {
        int num1, num2, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one:");
        num1 = sc.nextInt();
        System.out.println("enter number two:");
        num2 = sc.nextInt();
        n = 1;
        if (num1 != num2) {
            while (n != 0) {
                n = num1 % num2;
                if (n != 0) {

                    num1 = num2;
                    num2 = n;
                }
            }
            System.out.println("hcf of numbers:" + num2);

        } else {
            System.out.println("invalid no/ error");
        }
    }
}
