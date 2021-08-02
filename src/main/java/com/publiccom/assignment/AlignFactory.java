package com.publiccom.assignment;

public class AlignFactory {

  public StringTextAlign getAlignment(int maxChars, Alignment alignment){
    switch (alignment) {
      case LEFT:
        return new LeftStringTextAlign(maxChars);
      case RIGHT:
        return new RightStringTextAlign(maxChars);
      case CENTER:
        return new CenterStringTextAlign(maxChars);
      case HARD:
      case JUSTIFIED:
      default:
        throw new IllegalArgumentException("invalid justification arg.");
    }
  }
}
