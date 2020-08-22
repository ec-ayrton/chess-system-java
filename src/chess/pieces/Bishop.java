package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);

	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// esq/acima

		p.setValues(position.getRow() - 1, position.getColumn()-1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()-1, p.getColumn() -1);
		}
		if (getBoard().positionExists(p) && isThereOponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// dir/cima

		p.setValues(position.getRow() - 1 , position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()-1, p.getColumn() + 1);

		}
		if (getBoard().positionExists(p) && isThereOponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// dir/baixo
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() + 1);
;
		}
		if (getBoard().positionExists(p) && isThereOponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// esquerda/baixo
		p.setValues(position.getRow() + 1, position.getColumn()-1 );
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()+ 1, p.getColumn() -1);

		}
		if (getBoard().positionExists(p) && isThereOponentPiece(p))
			mat[p.getRow()][p.getColumn()] = true;

		// fim
		return mat;
	}

	@Override
	public String toString() {
		return "B";
	}
}