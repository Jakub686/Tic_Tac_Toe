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
            if(!(row > 0 & row < 9 | column > 0 & column < 9)){
                System.out.println("You should enter numbers!");
                continue;
            }
            if(row > 3 & row < 9 | column > 3 & column < 9){
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if (grid[row-1][column-1] == 'X' | grid[row-1][column-1] == 'O'){
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
        boolean Xwins = false;
        boolean Owins = false;
        // X wins
        if (grid[0][0] == 'X' & grid[0][1] == 'X' & grid[0][2] == 'X' | // poziom 1
                grid[1][0] == 'X' & grid[1][1] == 'X' & grid[1][2] == 'X' | // poziom 2
                grid[2][0] == 'X' & grid[2][1] == 'X' & grid[2][2] == 'X' | // poziom 3
                grid[0][0] == 'X' & grid[1][0] == 'X' & grid[2][0] == 'X' | // kolumna 1
                grid[0][1] == 'X' & grid[1][1] == 'X' & grid[2][1] == 'X' | // kolumna 2
                grid[0][2] == 'X' & grid[1][2] == 'X' & grid[2][2] == 'X' | // kolumna 3
                grid[0][0] == 'X' & grid[1][1] == 'X' & grid[2][2] == 'X' | // skos 1
                grid[0][2] == 'X' & grid[1][1] == 'X' & grid[2][0] == 'X') // skos 2
        {
            result = false;
            Xwins = true;
            System.out.println("X wins");
        }
        // O wins
        if (grid[0][0] == 'O' & grid[0][1] == 'O' & grid[0][2] == 'O' | // poziom 1
                grid[1][0] == 'O' & grid[1][1] == 'O' & grid[1][2] == 'O' | // poziom 2
                grid[2][0] == 'O' & grid[2][1] == 'O' & grid[2][2] == 'O' | // poziom 3
                grid[0][0] == 'O' & grid[1][0] == 'O' & grid[2][0] == 'O' | // kolumna 1
                grid[0][1] == 'O' & grid[1][1] == 'O' & grid[2][1] == 'O' | // kolumna 2
                grid[0][2] == 'O' & grid[1][2] == 'O' & grid[2][2] == 'O' | // kolumna 3
                grid[0][0] == 'O' & grid[1][1] == 'O' & grid[2][2] == 'O' | // skos 1
                grid[0][2] == 'O' & grid[1][1] == 'O' & grid[2][0] == 'O') // skos 2
        {
            result = false;
            Owins = true;
            System.out.println("O wins");
        }
        // full grid with no winner = Draw
        if (grid[0][0] != ' ' & grid[0][1] != ' ' & grid[0][2] != ' '
                & grid[1][0] != ' ' & grid[1][1] != ' ' & grid[1][2] != ' '
                & grid[2][0] != ' ' & grid[2][1] != ' ' & grid[2][2] != ' ' & Xwins == false & Owins == false) {
            result = false;
            System.out.println("Draw");
        }
        return result;
    }
}
