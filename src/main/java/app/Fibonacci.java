package app;

import javax.swing.*;

public class Fibonacci {
    public static int fibonacciResolution(int x) {
        if (x == 1) {
            return 0;
        } else if (x == 2) {
            return 1;
        } else if (x > 2){
            return fibonacciResolution(x-1) + fibonacciResolution(x-2);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        String position = JOptionPane.showInputDialog(null, "Digite a posição que deseja obter da sequência de fibonacci: ");
        while (Integer.parseInt(position) <= 0) {
            JOptionPane.showMessageDialog(null,"Digite um número maior do que 0");
            position = JOptionPane.showInputDialog(null, "Digite a posição que deseja obter da sequência de fibonacci: ");

        }
            JOptionPane.showMessageDialog(null, fibonacciResolution(Integer.parseInt(position)));

    }
}
