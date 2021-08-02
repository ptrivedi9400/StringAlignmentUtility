package com.publiccom.assignment;

import java.text.FieldPosition;
import java.util.List;
import java.util.ListIterator;

public class CenterStringTextAlign extends StringTextAlign {

  public CenterStringTextAlign(int maxChars) {
    super(maxChars, Alignment.CENTER);
  }

  @Override
  public StringBuffer format(Object input, StringBuffer where, FieldPosition ignore) {
    String s = input.toString();
    List<String> strings = splitInputString(s);
    ListIterator<String> listItr = strings.listIterator();

    while (listItr.hasNext())
    {
      String wanted = listItr.next();
      int toAdd = getMaxChars() - wanted.length();
      pad(where, toAdd / 2);
      where.append(wanted);
      pad(where, toAdd - toAdd / 2);
      where.append("\n");
    }
    return where;
  }
}
