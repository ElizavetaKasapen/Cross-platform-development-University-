package Memento;

public class Main {

	public static void main(String[] args) {
		Sudoku_algorithm sudoku = new Sudoku_algorithm();
		GameHistory game = new GameHistory();
		String step_result = "";
		for (int i = 1; i < 10; i++) {
			step_result = sudoku.Check(0, 3, i);
			System.out.println(step_result);
			if (step_result.equals("Good!")) {
				game.Add(sudoku.SaveState());
			}
		}
		System.out.println("State 0:\n" + sudoku.RestoreState(game.Get(0)));
		step_result = sudoku.Check(1, 1, 4);
		game.Add(sudoku.SaveState());
		step_result = sudoku.Check(6, 8, 8);
		game.Add(sudoku.SaveState());
		System.out.println("State 1:\n" + sudoku.RestoreState(game.Get(1)));
		System.out.println("State 2:\n" + sudoku.RestoreState(game.Get(2)));

	}

}
