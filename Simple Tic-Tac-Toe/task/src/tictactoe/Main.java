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
        boolean statusLoop = true;

        //String input = " ";
        System.out.println("Enter cells:");
        //input = sc.nextLine();
        String input = "_XXOO_OX_";
        for (int i = 0; i < 9; i++) {
            row[i] = input.charAt(i);
        }
        show(input);
        ifXwin(input);
        ifOwin(input);

        do {
            // You should enter numbers!
            System.out.println("Enter the coordinates:");
            coordinates = sc.nextLine();
            controller(stringToIntCoordinate(coordinates));

            StringBuilder inpustSB = new StringBuilder(input);
            if (input.charAt(stringToIntCoordinate(coordinates)) != 'X' & input.charAt(stringToIntCoordinate(coordinates)) != 'O') {
                inpustSB.setCharAt(coordinateInt, 'X');
                input = inpustSB.toString();
                statusLoop = true;
            } else {
                System.out.println("This cell is occupied! Choose another one!");
                statusLoop = false;

            }
            show(input);

        } while (endCondition(input) != true);

    }

    static void show(String input) {
        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");
    }

    static boolean ifXwin(String input) {
        boolean statusWinX = false;
        if (input.charAt(0) == 'X' & input.charAt(1) == 'X' & input.charAt(2) == 'X'
                | input.charAt(3) == 'X' & input.charAt(4) == 'X' & input.charAt(5) == 'X'
                | input.charAt(6) == 'X' & input.charAt(7) == 'X' & input.charAt(8) == 'X'
                | input.charAt(0) == 'X' & input.charAt(3) == 'X' & input.charAt(6) == 'X'
                | input.charAt(1) == 'X' & input.charAt(4) == 'X' & input.charAt(7) == 'X'
                | input.charAt(2) == 'X' & input.charAt(5) == 'X' & input.charAt(8) == 'X'
                | input.charAt(0) == 'X' & input.charAt(4) == 'X' & input.charAt(8) == 'X'
                | input.charAt(2) == 'X' & input.charAt(4) == 'X' & input.charAt(6) == 'X') {
            statusWinX = true;
        }else {
            statusWinX = false;
        }
        return statusWinX;
    }
    static boolean ifOwin(String input) {
        boolean statusWinO = false;
        if (input.charAt(0) == 'X' & input.charAt(1) == 'X' & input.charAt(2) == 'X'
                | input.charAt(3) == 'X' & input.charAt(4) == 'X' & input.charAt(5) == 'X'
                | input.charAt(6) == 'X' & input.charAt(7) == 'X' & input.charAt(8) == 'X'
                | input.charAt(0) == 'X' & input.charAt(3) == 'X' & input.charAt(6) == 'X'
                | input.charAt(1) == 'X' & input.charAt(4) == 'X' & input.charAt(7) == 'X'
                | input.charAt(2) == 'X' & input.charAt(5) == 'X' & input.charAt(8) == 'X'
                | input.charAt(0) == 'X' & input.charAt(4) == 'X' & input.charAt(8) == 'X'
                | input.charAt(2) == 'X' & input.charAt(4) == 'X' & input.charAt(6) == 'X') {
            statusWinO = true;
        }else {
            statusWinO = false;
        }
        return statusWinO;
    }
    static int stringToIntCoordinate(String coordinates){
        int coordinateInt = 0;
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
        return coordinateInt;
    }
    static boolean endCondition(String input){
        boolean endCondition = false;
        if (input.charAt(0) != 'X' | input.charAt(0) == 'O'
                & input.charAt(1) == 'X' | input.charAt(1) == 'O'
                & input.charAt(2) == 'X' | input.charAt(2) == 'O'
                & input.charAt(3) == 'X' | input.charAt(3) == 'O'
                & input.charAt(4) == 'X' | input.charAt(4) == 'O'
                & input.charAt(5) == 'X' | input.charAt(5) == 'O'
                & input.charAt(6) == 'X' | input.charAt(6) == 'O'
                & input.charAt(7) == 'X' | input.charAt(7) == 'O'
                & input.charAt(8) == 'X' | input.charAt(8) == 'O') {
            endCondition = true;
        }else {
            endCondition = false;
        }
        return endCondition;
    }
    static void controller(int coordinateInt){
        // "This cell is occupied! Choose another one!"
        // "You should enter numbers!"
        // Coordinates should be from 1 to 3!

    }
}
