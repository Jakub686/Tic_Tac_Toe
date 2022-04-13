package tictactoe;

import java.util.Scanner;

public class Main {
    static boolean state;

    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        String input = " ";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
        showGrid(grid);
        boolean xOrO = true;


        do {
            System.out.print("Enter the coordinates: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            int row = Character.getNumericValue(input.charAt(0));
            int column = Character.getNumericValue(input.charAt(2));
            if (grid[row][column] == 'X'){
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }
            if (xOrO == true) {
                grid[row - 1][column - 1] = 'X';
                xOrO = false;
                showGrid(grid);
                continue;
            }
            if (xOrO == false) {
                grid[row - 1][column - 1] = 'O';
                xOrO = true;
                showGrid(grid);
                continue;
            }
        } while (endCondition(grid));
    }

    static void showGrid(char[][] grid) {
        System.out.println("---------");
        System.out.println("| " + grid[0][0] + ' ' + grid[0][1] + ' ' + grid[0][2] + " |");
        System.out.println("| " + grid[1][0] + ' ' + grid[1][1] + ' ' + grid[1][2] + " |");
        System.out.println("| " + grid[2][0] + ' ' + grid[2][1] + ' ' + grid[2][2] + " |");
        System.out.println("---------");
    }

    static boolean endCondition(char[][] grid) {
        boolean result = true;
        // full grid with no winner = Draw
        if (grid[0][0] != ' ' & grid[0][1] != ' ' & grid[0][2] != ' '
                & grid[1][0] != ' ' & grid[1][1] != ' ' & grid[1][2] != ' '
                & grid[2][0] != ' ' & grid[2][1] != ' ' & grid[2][2] != ' ') {
            result = false;
            System.out.println("Draw");
        }
        // X wins
        if (grid[0][0] == 'X' & grid[0][1] == 'X' & grid[0][2] == 'X' |
                grid[1][0] == 'X' & grid[1][1] == 'X' & grid[1][2] == 'X' |
                grid[2][0] == 'X' & grid[2][1] == 'X' & grid[2][2] == 'X' |
                grid[0][0] == 'X' & grid[1][0] == 'X' & grid[2][0] == 'X' |
                grid[0][1] == 'X' & grid[1][1] == 'X' & grid[2][1] == 'X' |
                grid[0][2] == 'X' & grid[1][2] == 'X' & grid[2][2] == 'X') {
            result = false;
            System.out.println("X wins");
        }

        // O wins
        if (grid[0][0] == 'O' & grid[0][1] == 'O' & grid[0][2] == 'O' |
                grid[1][0] == 'O' & grid[1][1] == 'O' & grid[1][2] == 'O' |
                grid[2][0] == 'O' & grid[2][1] == 'O' & grid[2][2] == 'O' |
                grid[0][0] == 'O' & grid[1][0] == 'O' & grid[2][0] == 'O' |
                grid[0][1] == 'O' & grid[1][1] == 'O' & grid[2][1] == 'O' |
                grid[0][2] == 'O' & grid[1][2] == 'O' & grid[2][2] == 'O') {
            result = false;
            System.out.println("O wins");
        }

        return result;
    }

//    static boolean cellOccupied(char[][] grid, int row, int column){
//        if (grid[row][column] != ' ') {
//        }
//
//
//        return false;
//    }
}
