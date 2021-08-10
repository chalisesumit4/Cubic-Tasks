package com.cubic;

import javax.swing.*;

public class Factorial {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number for factorial: "));
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + ": " + fact);
    }
}
