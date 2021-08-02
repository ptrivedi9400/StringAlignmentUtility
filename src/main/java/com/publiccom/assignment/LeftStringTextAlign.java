package com.publiccom.assignment;

import java.text.FieldPosition;
import java.util.List;
import java.util.ListIterator;

public class LeftStringTextAlign extends StringTextAlign {

  public LeftStringTextAlign(int maxChars) {
    super(maxChars, Alignment.LEFT);
  }

  @Override
  public StringBuffer format(Object input, StringBuffer where, FieldPosition ignore) {
    String s = input.toString();
    List<String> strings = splitInputString(s);
    ListIterator<String> listItr = strings.listIterator();

    while (listItr.hasNext())
    {
      String wanted = listItr.next();
      where.append(wanted);
      pad(where, getMaxChars() - wanted.length());
      where.append("\n");
    }
    return where;
  }
}
