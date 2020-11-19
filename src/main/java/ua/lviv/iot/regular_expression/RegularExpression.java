package ua.lviv.iot.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

  public static void reverseNegativeNumbers(String textToCheck) {
    Pattern pattern = Pattern.compile("\\-\\d+\\b");
    Matcher matcher = pattern.matcher(textToCheck);
    String foundString = "";
    while (matcher.find()) {
      foundString += matcher.group() + " ";
    }

    String replacedString = foundString.replace("-", " ");
    StringBuilder myNewString = new StringBuilder();
    myNewString.append(replacedString);
    myNewString = myNewString.reverse();
    System.out.println(myNewString);
  }

  
}