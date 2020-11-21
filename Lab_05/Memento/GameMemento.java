/**
 * 
 */
package Memento;

/**
 * @author Elizaveta 
 * creating state to remember
 */
public class GameMemento {
	private int[][] play_board;

	public int[][] GetMemento() {
		return play_board;
	}

	public GameMemento(int[][] play_board) {
		this.play_board = play_board;
	}

}
