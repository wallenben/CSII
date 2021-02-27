package cs145.TicTacToe;

import java.util.Scanner;

/**
 * The game Tic-Tac-Toe - in Java!
 * 
 * @author Ben Wallen
 * @version 2020.02.26
 */
public class TicTacToe {
	private char currentPlayer;
	private char[][] board;
	private char winner;

	/**
	 * This is the default constructor for the TicTacToe object. This creates the
	 * board, and assigns some data to the character vars.
	 */
	public TicTacToe() {
		board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int x = 0; x < board[i].length; x++) {
				board[i][x] = ' ';
			}
		}
		winner = ' ';
		currentPlayer = 'X';
	}

	/**
	 * Getter method for the currentPlayer var.
	 * 
	 * @return char currentPlayer
	 */
	public char getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * Getter method for the winner var.
	 * 
	 * @return char winner
	 */
	public char getWinner() {
		return winner;
	}

	/**
	 * This method handles a "turn" in Tic-Tac-Toe. A player will select where their
	 * symbol goes, and the method will place the designated symbol in the array.
	 * Lastly, the method automatically changes to the next player.
	 * 
	 * @param row is the row selected by the user
	 * @param col is the column selected by the user
	 * @return true on successful placement, false if the spot has a symbol in it
	 *         already.
	 */
	public boolean takeTurn(int row, int col) {
		System.out.println(board[row][col]);
		if (board[row][col] == ' ') {
			board[row][col] = currentPlayer;
			if (currentPlayer == 'X') {
				currentPlayer = 'O';
			} else {
				currentPlayer = 'X';
			}
			return true;

		} else {
			System.out.println("This spot has already been selected.");
			return false;
		}

	}

	/**
	 * This boolean checks every turn if there is a winning combination on the
	 * Tic-Tac-Toe board. This is done by using specific algorithms to identify if a
	 * win has happened. If a win happens, var "winner" is updated with the winning
	 * symbol. In case of a tie, "T" is displayed.
	 * 
	 * @return true if a win has happened, false if no win is present.
	 */
	public boolean checkForWinner() {
		int tieCheck = 9;
		// rows first
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 2; i++) {
				if (board[x][0] == board[x][1] && board[x][0] == board[x][2] && board[x][0] != ' ') {
					winner = board[x][0];
					return true;
				}
			}
		}
		// columns next
		for (int z = 0; z < 3; z++) {
			for (int i = 0; i < 2; i++) {
				if (board[0][z] == board[1][z] && board[0][z] == board[2][z] && board[0][z] != ' ') {
					winner = board[0][z];
					return true;
				}
			}
		}
		// diagonals
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
			winner = board[0][0];
			return true;
		}
		if (board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != ' ') {
			winner = board[2][0];
			return true;
		} else {
			for (int i = 0; i < board.length; i++) {
				for (int x = 0; x < board[i].length; x++) {
					if (board[i][x] == ' ') {
						//there are moves left on the board - not a tie yet
						tieCheck--;
					}
				}
			}
			// if there's a tie
			if (tieCheck == 9) {
				winner = 'T';
				return true;
			}
			return false;
		}
	}

	/**
	 * This method prints out a nice formatted diagram of the Tic-Tac-Toe board.
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < 3; i++) {
			s += "[";
			for (int x = 0; x < 3; x++) {
				s += (board[i][x] + "|");
			}
			s += "]\n";
		}
		return s;
	}

	/**
	 * The main method puts all the above methods together to run the game.
	 * Furthermore, the main method has some nice prompts to make the game more
	 * intuitive for a user.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char decision = ' ';
		boolean gameValid = false;
		TicTacToe board2 = new TicTacToe();
		System.out.println("Welcome to Tic-Tac-Toe.");
		while (gameValid == false) {
			while (board2.checkForWinner() == false) {
				System.out.print(board2.toString());
				System.out.println("It is player " + board2.getCurrentPlayer() + "'s turn.");
				System.out.println("Please input the row and column.");
				System.out.print("Row: ");
				int row = s.nextInt();
				System.out.print("Column: ");
				int col = s.nextInt();
				board2.takeTurn(row - 1, col - 1);
			}
			if (board2.winner == 'T') {
				System.out.println("You tied the other player!");
			} else {
				System.out.println("The winner is: " + board2.getWinner() + "!");
			}
			System.out.print(board2.toString());
			System.out.println("Would you like to play again? (Y for yes, N for no)");
			decision = s.next().toUpperCase().charAt(0);
			if (decision == 'Y') {
				System.out.println("Resetting board..");
				for (int i = 0; i < board2.board.length; i++) {
					for (int x = 0; x < board2.board[i].length; x++) {
						board2.board[i][x] = ' ';
					}
				}
			} else {
				gameValid = true;
				System.out.println("Thanks for playing!");
			}
		}
		s.close();
	}
}
