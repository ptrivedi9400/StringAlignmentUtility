package com.publiccom.assignment;

import java.util.Scanner;
import org.apache.commons.lang3.EnumUtils;

/**
 * Main Java Class
 *
 */
public class App
{
    public static void main( String[] args )
    {
      System.out.print("Please follow instructions (Type EXIT to quit) (Press Enter to continue)");
      Scanner sc = new Scanner (System.in);
      String input;
      while (!(input = sc.nextLine()).equalsIgnoreCase("Exit")) {
        System.out.println("Enter your String and alignment like STRING: ");
        input = sc.nextLine();
        System.out.println("Enter your max characters:");
        int maxChars = sc.nextInt();
        System.out.println("Enter Alignment (LEFT/RIGHT/CENTER): ");
        String alignmentValue = sc.next();
        Alignment align = EnumUtils.getEnumIgnoreCase(Alignment.class, alignmentValue);
        StringTextAlign alignment = new AlignFactory().getAlignment(maxChars, align);
        System.out.println(alignment.format(input));
        System.out.print("Please follow instructions (Type EXIT to quit) (Press Enter to continue)");
        input = sc.nextLine();
      }
      System.out.println("Thank you!!!");
    }
}
