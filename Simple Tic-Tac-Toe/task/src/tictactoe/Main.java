package tictactoe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //imposible is when the whole board is filled up, last position is X or O, where there is no winner
        Scanner sc = new Scanner(System.in);
        char[] row = new char[9];
        String coordinates = "";
        int coordinateInt = 0;


        //String input = " ";
        System.out.println("Enter cells:");
        //input = sc.nextLine();
        String input = "_XXOO_OX_";
        for (int i = 0; i < 9; i++) {
            row[i] = input.charAt(i);
        }
        int statusWinX = 0;
        int statusWinO = 0;
        String status = "";
        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");
        if (input.charAt(0) == 'X' & input.charAt(1) == 'X' & input.charAt(2) == 'X'
                | input.charAt(3) == 'X' & input.charAt(4) == 'X' & input.charAt(5) == 'X'
                | input.charAt(6) == 'X' & input.charAt(7) == 'X' & input.charAt(8) == 'X'
                | input.charAt(0) == 'X' & input.charAt(3) == 'X' & input.charAt(6) == 'X'
                | input.charAt(1) == 'X' & input.charAt(4) == 'X' & input.charAt(7) == 'X'
                | input.charAt(2) == 'X' & input.charAt(5) == 'X' & input.charAt(8) == 'X'
                | input.charAt(0) == 'X' & input.charAt(4) == 'X' & input.charAt(8) == 'X'
                | input.charAt(2) == 'X' & input.charAt(4) == 'X' & input.charAt(6) == 'X') {
            statusWinX = 1;
        } else {

        }

        if (input.charAt(0) == 'O' & input.charAt(1) == 'O' & input.charAt(2) == 'O'
                | input.charAt(3) == 'O' & input.charAt(4) == 'O' & input.charAt(5) == 'O'
                | input.charAt(6) == 'O' & input.charAt(7) == 'O' & input.charAt(8) == 'O'
                | input.charAt(0) == 'O' & input.charAt(3) == 'O' & input.charAt(6) == 'O'
                | input.charAt(1) == 'O' & input.charAt(4) == 'O' & input.charAt(7) == 'O'
                | input.charAt(2) == 'O' & input.charAt(5) == 'O' & input.charAt(8) == 'O'
                | input.charAt(0) == 'O' & input.charAt(4) == 'O' & input.charAt(8) == 'O'
                | input.charAt(2) == 'O' & input.charAt(4) == 'O' & input.charAt(6) == 'O') {
            statusWinO = 1;
        }

        System.out.println("Enter the coordinates:");
        coordinates = sc.nextLine();
        switch (coordinates) {
            case "1 1":
                coordinateInt = 0;
                break;
            case "1 2":
                coordinateInt = 1;
                break;
            case "1 3":
                coordinateInt = 2;
                break;
            case "2 1":
                coordinateInt = 3;
                break;
            case "2 2":
                coordinateInt = 4;
                break;
            case "2 3":
                coordinateInt = 5;
                break;
            case "3 1":
                coordinateInt = 6;
                break;
            case "3 2":
                coordinateInt = 7;
                break;
            case "3 3":
                coordinateInt = 8;
                break;
        }
        StringBuilder inpustSB = new StringBuilder(input);
        if(input.charAt(coordinateInt) != 'X' & input.charAt(coordinateInt) != 'O'){
            inpustSB.setCharAt(coordinateInt, 'X');
            input = inpustSB.toString();
        }else {
            System.out.println("This cell is occupied! Choose another one!");

        }


        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");







        /*
        int countX = 0;
        int countO = 0;
        for(int i  = 0 ; i<9; i++) {
            if (input.charAt(i) == 'X')
                countX++;
        }
        for(int i  = 0 ; i<9; i++) {
            if (input.charAt(i) == 'O')
                countO++;
        }
        if(statusWinO == 0 & statusWinX == 0){
            if(input.charAt(8) == 'X' | input.charAt(8) == 'O') {
                if(input.charAt(7) == 'X' | input.charAt(7) == 'O') {
                    if(input.charAt(6) == 'X' | input.charAt(6) == 'O') {
                        System.out.println("Draw");
                    }
                }
            }
        }
        if(statusWinX == 0 & statusWinO == 0){
            if(input.charAt(8) == ' ' | input.charAt(8) == '_') {
                System.out.println("Game not finished");
            }
        }



        if(statusWinX == 1 & statusWinO != 1){
            System.out.println("X wins");
        }
        if(statusWinO == 1 & statusWinX != 1){
            System.out.println("O wins");
        }
        if(countX > countO+1){
            System.out.println("Impossible");
        }
        if(countO > countX+1){
            System.out.println("Impossible");
        }
        if(statusWinX == 1 & statusWinO == 1){
            if(input.charAt(0) == ' ' | input.charAt(0) == '_' | input.charAt(1) == ' ' | input.charAt(1) == '_' | input.charAt(2) == ' ' | input.charAt(2) == '_' | input.charAt(3) == ' ' | input.charAt(3) == '_' | input.charAt(4) == ' ' | input.charAt(4) == '_' | input.charAt(5) == ' ' | input.charAt(5) == '_' | input.charAt(6) == ' ' | input.charAt(6) == '_' | input.charAt(7) == ' ' | input.charAt(7) == '_' | input.charAt(8) == ' ' | input.charAt(8) == '_') {
                System.out.println("Impossible");
            }
        }
  */
    }
}
