/**
 * 
 */
package cs145.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test for the Tic-Tac-Toe game.
 * 
 * @author Ben Wallen
 * @version 2020.02.26
 */
class TicTacToeTests {
	TicTacToe x;
	TicTacToe y;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		x = new TicTacToe();
		y = new TicTacToe();

	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#TicTacToe()}.
	 */
	@Test
	void testTicTacToe() {
		assertEquals(x.getWinner(), ' ');
		assertEquals(x.getCurrentPlayer(), 'X');
		// no getter for board, cannot test without changing uml
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#getCurrentPlayer()}.
	 */
	@Test
	void testGetCurrentPlayer() {
		assertEquals(x.getCurrentPlayer(), 'X');
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#getWinner()}.
	 */
	@Test
	void testGetWinner() {
		assertEquals(x.getWinner(), ' ');
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#takeTurn(int, int)}.
	 */
	@Test
	void testTakeTurn() {
		assertEquals(x.takeTurn(0, 0), true);
		assertEquals(x.takeTurn(0, 1), true);
		assertEquals(x.takeTurn(0, 0), false);
	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#checkForWinner()}.
	 */
	@Test
	void testCheckForWinner() {
		TicTacToe y = new TicTacToe();
		y.takeTurn(0, 0);
		assertEquals(y.checkForWinner(), false);
		y.takeTurn(1, 1);
		y.takeTurn(0, 1);
		y.takeTurn(1, 0);
		y.takeTurn(0, 2);
		assertEquals(y.checkForWinner(), true);

	}

	/**
	 * Test method for {@link cs145.TicTacToe.TicTacToe#toString()}.
	 */
	@Test
	void testToString() {
		// demonstrating creation of the graph
		assertEquals(x.toString(), "[ | | |]\n" + "[ | | |]\n" + "[ | | |]\n");
		y.takeTurn(0, 0);
		y.takeTurn(1, 1);
		y.takeTurn(0, 1);
		y.takeTurn(1, 0);
		y.takeTurn(0, 2);
		assertEquals(y.toString(), "[X|X|X|]\n" + "[O|O| |]\n" + "[ | | |]\n");
	}
}
