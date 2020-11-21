/**
 * 
 */
package Memento;

import java.util.*;

/**
 * @author Elizaveta creating and add/get history (previous states)
 */
public class GameHistory {
	private List<GameMemento> history = new ArrayList<GameMemento>();

	public void Add(GameMemento state) {
		history.add(state);
	}

	public GameMemento Get(int index) {
		return history.get(index);
	}
}
