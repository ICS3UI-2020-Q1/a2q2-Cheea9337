import java.util.Scanner;

/**
 * To find which number is bigger out of two numbers
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // get the user to enter a number
    System.out.println("Please enter an integer:");
    int a = input.nextInt();

    // get the user to enter a second number
    System.out.println("Please enter another integer:");
    int b = input.nextInt();

    // find out which number is bigger
    if (a > b) {
      System.out.println("The biggest number is " + a);
    } else if (a < b) {
      System.out.println("The biggest number is " + b);
    } else {
      System.out.println("There is no biggest number");
    }


  }
}
