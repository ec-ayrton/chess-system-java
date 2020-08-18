package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Roak extends ChessPiece{

	public Roak(Board board, Color color) {
		super(board, color);
	
	}
	
	
	@Override
	public String toString() {
		return "R";
	}

}
