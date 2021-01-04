public class PigLatin {
  public static void main(String[] args) {
    //pigLatinSimple
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
  }
  public static String pigLatinSimple(String s) {
    String word = s;
    if (word.substring(0,1).equals("a") ||
    word.substring(0,1).equals("e") ||
    word.substring(0,1).equals("i") ||
    word.substring(0,1).equals("o") ||
    word.substring(0,1).equals("u")) {
      word = word + "hay";
    }
    else {
      word = word.substring(1, word.length()) + word.charAt(0)
      + "ay";
    }
    return word;
  }
}
