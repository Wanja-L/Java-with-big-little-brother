public class Board {
  private Piece[][] pieces;

  public Board(Piece[][] pieces) {
    this.pieces = pieces;
  }

  public boolean movePiece(PieceColour colour, PieceType type, int x, int y) {
    Piece piece = findPiece(colour, type);
    if (piece != null) {
      boolean moveSucceeded = piece.move(x, y);
      if (moveSucceeded) {
        pieces[x][y] = null;
        return true;
      }
    }
    return false;
  }

  private Piece findPiece(PieceColour colour, PieceType type) {
    Piece piece = null;
    for (Piece[] row : pieces) {
      for (Piece currentPiece : row) {
        if (currentPiece.getColour() == colour && currentPiece.getType() == type) {
          piece = currentPiece;
          break;
        }
      }
    }
    return piece;
  }
}