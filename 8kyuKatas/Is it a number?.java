public class MyUtilities{

  public boolean isDigit(String s)
  {
    s = s.trim();
    String regex = "[-+]?\\d*(\\.\\d+)?";
    return s.matches(regex) && !s.isEmpty();
  }
}
