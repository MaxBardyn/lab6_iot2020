package ua.lviv.iot.regular_expression;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;;

public class RegularExpressionTest {

  @Test
  public void reverseNegativeNumbersTest() {
    String numbers = "-+231 -6734 -aAbs -0923 -4 ";
    InputStream in = new ByteArrayInputStream(numbers.getBytes());
    System.setIn(in);

    try (Scanner scanner = new Scanner(System.in)) {
      String myText = scanner.nextLine();
      System.out.println(myText);
      RegularExpression.reverseNegativeNumbers(myText);
    }
  }
}