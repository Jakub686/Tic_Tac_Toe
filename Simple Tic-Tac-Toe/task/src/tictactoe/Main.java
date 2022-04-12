package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] row = new char[9];
        String input = " ";
        //String input = "XXXOO__O_";
        input = sc.nextLine();
        for (int i = 0; i < 9; i++) {
            row[i] = input.charAt(i);
        }
        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");
        if (input.charAt(0) == 'X' & input.charAt(1) == 'X' & input.charAt(2) == 'X' | input.charAt(3) == 'X' & input.charAt(4) == 'X' & input.charAt(5) == 'X' | input.charAt(6) == 'X' & input.charAt(7) == 'X' & input.charAt(8) == 'X' | input.charAt(0) == 'X' & input.charAt(4) == 'X' & input.charAt(8) == 'X' | input.charAt(2) == 'X' & input.charAt(4) == 'X' & input.charAt(6) == 'X' | input.charAt(0) == 'X' & input.charAt(3) == 'X' & input.charAt(6) == 'X'| input.charAt(1) == 'X' & input.charAt(5) == 'X' & input.charAt(7) == 'X'| input.charAt(2) == 'X' & input.charAt(5) == 'X' & input.charAt(8) == 'X') {
            System.out.println("X wins");
        }else if (input.charAt(0) == 'O' & input.charAt(1) == 'O' & input.charAt(2) == 'O' | input.charAt(3) == 'O' & input.charAt(4) == 'O' & input.charAt(5) == 'O' | input.charAt(6) == 'O' & input.charAt(7) == 'O' & input.charAt(8) == 'O' | input.charAt(0) == 'O' & input.charAt(4) == 'O' & input.charAt(8) == 'O' | input.charAt(2) == 'O' & input.charAt(4) == 'O' & input.charAt(6) == 'O'| input.charAt(0) == 'O' & input.charAt(3) == 'O' & input.charAt(6) == 'O'| input.charAt(1) == 'O' & input.charAt(5) == 'O' & input.charAt(7) == 'O'| input.charAt(2) == 'O' & input.charAt(5) == 'O' & input.charAt(8) == 'O') {
            System.out.println("O wins");
        }else{
            System.out.println("Draw");
        }
    }
}
