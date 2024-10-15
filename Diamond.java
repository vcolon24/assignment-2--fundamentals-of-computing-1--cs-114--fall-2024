public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);         // scan the entered number 
    System.out.println("enter a number");
    int number = scan.nextInt(); // input for diamond size

    if (number % 2 == 0) {    // create the diamond based on even or odd input
        printEvenDiamond(number);
      } else {
        printOddDiamond(number);
      }
      scan.close(); // close scanner
    }

  private static void printEvenDiamond(int number) {           // function that is printed if number is even
      for (int rows = 1; rows <= (number / 2) + 1 ; rows++) {       // upper half (with the middle row)
        for (int space = 1; space <= number - rows; space++) {  
          System.out.print("  ");
        }
        for (int space = 1; space < (rows * 2) - 1; space++){
          System.out.print("* ");
        }
        System.out.println();
      }
      for (int rows = number / 2; rows > 0; rows--) {      // lower half
        for (int space = 1; space <= number - rows; space++) {
          System.out.print("  ");
        }
        for (int space = 1; space < rows * 2 - 1; space++){          // printing starts
          System.out.print("* ");
        }
        System.out.println();
    }
  }
 
  private static void printOddDiamond(int number) {      // function to print an odd diamond
    int middle = number / 2;

    for (int row = 0; row <= middle; row++) {     // upper half of diamond
      printWhitespace(middle - row);
      printOddStars(2 * row + 1); 
        System.out.println();
      }
    for (int row = middle - 1; row >= 0; row--) {      // lower half of diamond
      printWhitespace(middle - row);
      printOddStars(2 * row + 1); 
      System.out.println();
      }
    }

    private static void printWhitespace(int count) {     // to print white spcaes
      for (int row = 0; row < count; row++) {
        System.out.print(" ");
      }
    }
    private static void printOddStars(int count) {      // to print out the stars for odd numbers 
      for (int row = 0; row < count; row++) {
        System.out.print("*");
    }
  }
}
