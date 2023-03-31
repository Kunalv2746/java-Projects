
public class Patterns {
    public static void main(String[] args) {
        /*
         * pattern_1(4);
         * System.out.println();
         * pattern_2(4);
         * System.out.println();
         * pattern_3(4);
         */
        pattern_9(5);
        System.out.println();
        pattern_10(5);

    }

    public static void pattern_1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= (n - row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");

            }

            System.out.println();

        }
    }

    public static void pattern_5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            int spaces = n - c;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_7(int n) {
        for (int row = 1; row <= n; row++) {

            int spaces = n - row;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static void pattern_8(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            for (int s = 0; s < n - c; s++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern_9(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern_10(int n) {
        int Orgn = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Orgn - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                                                         // Up, left            down,right.....
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}