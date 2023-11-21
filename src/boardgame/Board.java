package boardgame;

public class Board {
	private int rows;
	private int collums;
	private Piece[][] pieces;
	
	public Board(int rows, int collums) {
		this.rows = rows;
		this.collums = collums;
		this.pieces = new Piece[rows][collums];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCollums() {
		return collums;
	}

	public void setCollums(int collums) {
		this.collums = collums;
	}
	
	public Piece piece(int row, int collum) {
		return this.pieces[row][collum];
	}
	
	public Piece piece(Position position) {
		return this.pieces[position.getRow()][position.getCollum()];
	}
	
	public void placePiece(Piece piece, Position position) {
		this.pieces[position.getRow()][position.getCollum()] = piece;
		piece.position = position;
	}
}
