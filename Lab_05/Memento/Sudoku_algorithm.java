/**
 * 
 */
package Memento;

/**
 * @author Elizaveta
 * Sudoku algorithm for playing and saving states
 */
public class Sudoku_algorithm {
	private int[][] true_board = { 
			{ 8, 1, 2, 7, 5, 3, 6, 4, 9 },
			{ 9, 4, 3, 6, 8, 2, 1, 7, 5 },
			{ 6, 7, 5, 4, 9, 1, 2, 8, 3 }, 
			{ 1, 5, 4, 2, 3, 7, 8, 9, 6 }, 
			{ 3, 6, 9, 8, 4, 5, 7, 2, 1 },
			{ 2, 8, 7, 1, 6, 9, 5, 3, 4 }, 
			{ 5, 2, 1, 9, 7, 4, 3, 6, 8 }, 
			{ 4, 3, 8, 5, 2, 6, 9, 1, 7 },
			{ 7, 9, 6, 3, 1, 8, 4, 5, 2 }, };
	private int[][] play_board = { 
			{ 8, 0, 0, 0, 5, 0, 6, 4, 0 },
			{ 9, 0, 3, 6, 0, 2, 0, 0, 5 },
			{ 0, 7, 0, 4, 9, 0, 2, 8, 0 }, 
			{ 1, 5, 4, 2, 3, 7, 8, 9, 6 }, 
			{ 3, 6, 0, 0, 4, 0, 7, 2, 0 },
			{ 0, 8, 7, 0, 6, 0, 0, 3, 4 }, 
			{ 5, 2, 1, 9, 0, 4, 0, 6, 0 }, 
			{ 0, 0, 0, 5, 0, 6, 9, 0, 7 },
			{ 7, 0, 6, 3, 0, 0, 4, 0, 2 }, };

	public String Check(int i, int j, int value) {

		if (play_board[i][j] != 0) {
			return "This value is set";
		}
		if (value != true_board[i][j]) {
			return "Try again!";
		}
		play_board[i][j] = value;
		// if there are no empty cells
		for (int k = 0; k < play_board.length; k++) {
			for (int m = 0; m < play_board.length; m++) {
				if (play_board[k][m] == 0)
					break;
				if (k == 8 && m == 8)
					return "Game over!";
			}
		}
		return "Good!";
	}

	public GameMemento SaveState() {
		return new GameMemento(play_board);
	}

	public String RestoreState(GameMemento memento) {
		this.play_board = memento.GetMemento();
		String history = "";
		for (int i = 0; i < play_board.length; i++) {
			for (int j = 0; j < play_board.length; j++) {
				history += " " + play_board[i][j] + " ";
			}
			history += "\n";
		}
		return history;
	}
}
