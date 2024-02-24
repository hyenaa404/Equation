package view;

import util.InputUtils;

/**
 *
 * @author Admin
 */
public class Menu {

    public static int chooseMenuOption() {
        System.out.println("\n\n========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choose: ");
        int option = InputUtils.inputOption(1, 3);
        return option;
    }
}
