/*
 * Pattern Name: Solid Pyramid Pattern
 * Description: This pattern prints a pyramid shape using asterisks (*).
 * Each row increases by 2 stars, creating a symmetrical pyramid.
 * Example for rows = 5:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Pattern6 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid
        printPyramid(rows);
    }

    // Method to print the pyramid pattern
    private static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars (2*i-1 stars in each row)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
