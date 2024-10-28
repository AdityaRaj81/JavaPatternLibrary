public class Pattern4 {
    public static void main(String[] args) {
        int n = 5; // Height of the triangle

        for (int i = 1; i <= n; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
