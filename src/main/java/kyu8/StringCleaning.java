package kyu8;

public class StringCleaning {
  public static String stringClean(final String text) {
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : text.toCharArray()) {
      if (!Character.isDigit(c)) {
        stringBuilder.append(c);
      }
    }
    return stringBuilder.toString();
  }
}