import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Coderunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something:");
        String input = sc.nextLine();
        System.out.printf("You Entered: %s%n",input);

        if (!StringUtils.isNumeric(input)) {
            System.out.printf("%s is not a number.%n", input);
        }

        System.out.printf("Flipped Case: %s%n",StringUtils.swapCase(input));
        System.out.printf("Reversed: %s%n",StringUtils.reverse(input));



    }
}
