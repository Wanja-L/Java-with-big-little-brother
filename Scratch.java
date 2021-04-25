public class Scratch {

  enum PieceColour {
    WHITE, BLACK
  }

  public static final String[] POSSIBLE_COLOURS = { "WHITE", "BLACK" };

  public static void main(String[] args) {
    for (PieceColour loopColour : PieceColour.values()) {
      System.out.println(loopColour);
    }
  }
}