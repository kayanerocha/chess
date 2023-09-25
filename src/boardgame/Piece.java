package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	// Acessado apenas pelo tabuleiro (boardgame) e as peças filhas
	protected Board getBoard() {
		return board;
	}

}
