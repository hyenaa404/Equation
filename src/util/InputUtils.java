
package util;

import java.util.Scanner;

/**
 *
 * @author nhs
 */
public class InputUtils {

    public static Scanner sc = new Scanner(System.in);


    public static float inputFloat() {
        float fl;
        while (true) {
            try {
                fl = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid float number.");
            }
        }
        return fl;
    }

    public static int inputOption(int min, int max) {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from " + min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
}
