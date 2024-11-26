//hollow pyramid star pattern

public class Pattern9 {
  public static void main(String[] args) {
    int rows = 5;

    // Upper part of the pyramid
    for (int i = 1; i <= rows; i++) {
        // Print leading spaces
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }

        // Print stars
        for (int k = 1; k <= 2 * i - 1; k++) {
            // Print stars only at the beginning, end, and middle of the first row
            if (i == 1 || k == 1 || k == 2 * i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println(); // Move to next line
    }
}
}
