import java.util.Scanner;

public class MineSweeper {
    private String[][] adminMatrix;
    private String[][] userMatrix;
    private int row;
    private int col;

    // Method to start the game
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        System.out.print("Enter number of columns: ");
        col = input.nextInt();

        gameBoard();
        addMine();
        adminBoard();

        System.out.println("WELCOME TO MINESWEEPER! ENJOY!");

        while (true) {
            printUserBoard();
            System.out.print("Choose a row: ");
            int userRow = input.nextInt() - 1;
            System.out.print("Choose a column: ");
            int userCol = input.nextInt() - 1;

            if (isValidMove(userRow, userCol)) {
                if (adminMatrix[userRow][userCol].equals("M")) {
                    System.out.println("You hit a MINE! YOU LOST! Game over.");
                    break;
                } else {
                    int count = countMinesAround(userRow, userCol);
                    System.out.println("There are " + count + " mines around this cell.");
                }
            } else {
                System.out.println("Invalid move! Please select a correct row and column.");
            }
        }
    }

    // Method to check valid move
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < this.row && col >= 0 && col < this.col;
    }

    // Method to count mines around selected cell
    private int countMinesAround(int row, int col) {
        int count = 0;
        for (int i = Math.max(0, row - 1); i <= Math.min(this.row - 1, row + 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(this.col - 1, col + 1); j++) {
                if (adminMatrix[i][j].equals("M")) {
                    count++;
                }
            }
        }
        return count;
    }

    // Method to create game board
    private void gameBoard() {
        adminMatrix = new String[row][col];
        userMatrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                adminMatrix[i][j] = ".";
                userMatrix[i][j] = ".";
            }
        }
    }

    // Method to add random mines
    private void addMine() {
        int mineCount = (int) (row * col) / 4;
        while (mineCount > 0) {
            int randomRow = (int) (Math.random() * row);
            int randomCol = (int) (Math.random() * col);
            if (!adminMatrix[randomRow][randomCol].equals("M")) {
                adminMatrix[randomRow][randomCol] = "M";
                mineCount--;
            }
        }
    }

    // Method to show admin board
    private void adminBoard() {
        System.out.println("Mine locations: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(adminMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to show user board
    private void printUserBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
