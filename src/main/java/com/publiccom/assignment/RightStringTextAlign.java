package com.publiccom.assignment;

import java.text.FieldPosition;
import java.util.List;
import java.util.ListIterator;

public class RightStringTextAlign extends StringTextAlign {

  public RightStringTextAlign(int maxChars) {
    super(maxChars, Alignment.RIGHT);
  }

  @Override
  public StringBuffer format(Object input, StringBuffer where, FieldPosition ignore) {
    String s = input.toString();
    List<String> strings = splitInputString(s);
    ListIterator<String> listItr = strings.listIterator();

    while (listItr.hasNext())
    {
      String wanted = listItr.next();
      pad(where, getMaxChars() - wanted.length());
      where.append(wanted);
      where.append("\n");
    }
    return where;
  }
}
