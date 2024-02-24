/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.QuadraticEquation;
import model.SuperlativeEquation;
import util.InputUtils;
import view.Menu;

/**
 *
 * @author Admin
 */
public class Controller {
    
    public static void main(String[] args) {
        int choice;
        while (true) {
            choice = Menu.chooseMenuOption();
            switch (choice) {
                case 1 -> {
                    solveSuperlativeEquation();
                }
                case 2 -> {
                    solveQuandraticEquation();
                }
                case 3 -> 
                    System.exit(0);
            }
        }
        
    }

    private static void solveSuperlativeEquation() {
        System.out.print("Enter coefficient A: ");
        float a = InputUtils.inputFloat();
        System.out.print("Enter coefficient B: ");
        float b = InputUtils.inputFloat();
        SuperlativeEquation se = new SuperlativeEquation(a, b);

        List<Float> solutions = se.calculateEquation();
        List<Float> odd = se.findOdd();
        List<Float> even = se.findEven();
        List<Float> square = se.findSquare();
        displayResult(odd, even, square, solutions);

    }
    private static void solveQuandraticEquation() {
        System.out.print("Enter coefficient A: ");
        float a = InputUtils.inputFloat();
        System.out.print("Enter coefficient B: ");
        float b = InputUtils.inputFloat();
        System.out.print("Enter coefficient C: ");
        float c = InputUtils.inputFloat();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        List<Float> solutions = qe.calculateQuandraticEquation();
        List<Float> odd = qe.findOdd();
        List<Float> even = qe.findEven();
        List<Float> square = qe.findSquare();
        displayResult(odd, even, square, solutions);

    }

    public static void displayResult(List<Float> odd, List<Float> even, List<Float> square, List<Float> result) {
        System.out.print("Number is odd: ");
        if (odd == null) {
            System.out.println("None");
        } else {
            for (Float x : odd) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }
        System.out.print("Number is even: ");
        if (even == null) {
            System.out.println("None");
        } else {
            for (Float x : even) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }
        System.out.print("Number is square number: ");
        if (square == null) {
            System.out.println("None");
        } else {
            for (Float x : square) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }

        if (result == null) {
            System.out.println("No solution exists for the equation.");
        } else {
            System.out.println("Solutions of the superlative equation: ");
            for (Float x : result) {
                System.out.print(x + "  ");
            }
            System.out.println("");
        }
    }
}
