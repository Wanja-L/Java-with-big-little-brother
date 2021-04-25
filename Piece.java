enum PieceType {
  PAWN, ROOK, KNIGHT
}

enum PieceColour {
  WHITE, BLACK
}

class Piece {
  private int x;
  private int y;
  private final PieceType type;
  private final PieceColour colour;

  public Piece(int x, int y, PieceType type, PieceColour colour) {
    this.x = x;
    this.y = y;
    this.type = type;
    this.colour = colour;
  }

  public boolean move(int x, int y) {
    // check legal move
    this.x = x;
    this.y = y;
    return true;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public PieceColour getColour() {
    return this.colour;
  }

  public PieceType getType() {
    return this.type;
  }
}

// PieceColour c = PieceColour.WHITE;
// for (PieceColour loopColour : PieceColour.values()) {
// System.out.println(loopColour);
// }

// Piece demoPiece = new Piece(x, y, type, colour);
// demoPiece.getColour()

// Board demoBoard = new Board(pieces)
