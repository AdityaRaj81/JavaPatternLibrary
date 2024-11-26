//inverted pyramid pattern
public class Pattern8 {
  public static void main(String[] args) {
    int rows = 5;

    // Upper part of the pyramid
    for (int i = rows; i >= 1; i--) {
        // Print leading spaces
        for (int j = rows - i; j > 0; j--) {
            System.out.print(" ");
        }

        // Print stars
        for (int k = 2 * i - 1; k > 0; k--) {
            System.out.print("*");
        }

        System.out.println(); // Move to next line
    }
}
}