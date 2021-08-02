package com.publiccom.assignment;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;

import java.util.Objects;

/**
 *
 */
public abstract class StringTextAlign extends Format {

  private static final long serialVersionUID = 1L;

  /** Current max length of a line */
  private int maxChars;

  public StringTextAlign(int maxChars, Alignment align) {
    if (maxChars < 0) {
      throw new IllegalArgumentException("maxChars must be positive.");
    }
    this.maxChars = maxChars;
  }

  @Override
  public abstract StringBuffer format(Object input, StringBuffer where, FieldPosition ignore);


  protected final void pad(StringBuffer to, int howMany) {
    for (int i = 0; i < howMany; i++)
      to.append(' ');
  }

  String format(String s) {
    return format(s, new StringBuffer(), null).toString();
  }

  @Override
  public Object parseObject(String source, ParsePosition pos) {
    return source;
  }

  protected List<String> splitInputString(String str) {
    List<String> list = new ArrayList<>();
    if (Objects.isNull(str))
      return list;
    for (int i = 0; i < str.length(); i = i + maxChars)
    {
      int endindex = Math.min(i + maxChars, str.length());
      list.add(str.substring(i, endindex));
    }
    return list;
  }

  public int getMaxChars() {
    return maxChars;
  }
}
