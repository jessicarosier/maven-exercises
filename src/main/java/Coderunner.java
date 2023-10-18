import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Coderunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a string:");
        String input = sc.nextLine();
        System.out.println(StringUtils.isNumeric(input));
        System.out.println(StringUtils.upperCase(input));
        System.out.println(StringUtils.reverse(input));



    }
}
