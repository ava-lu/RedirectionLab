import java.util.Scanner;
public class PigLatin {
  public static void main(String[] args) {
    /*pigLatinSimple
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
    */

    /*pigLatin
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
    */

    /*pigLatinBest
    System.out.println(pigLatinBest("*emu"));
    System.out.println(pigLatinBest("4chan"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("fish"));
    System.out.println(pigLatinBest("the."));
    System.out.println(pigLatinBest("cat!"));
    System.out.println(pigLatinBest("amazing?"));
    System.out.println(pigLatinBest("apple%"));
    */

    //finaltest
    Scanner file = new Scanner(System.in);
    while (file.hasNextLine()) {
      Scanner line = new Scanner(file.nextLine());
      while (line.hasNext()) {
        String word = line.next();
        System.out.print(pigLatinBest(word));
        if (line.hasNext()) System.out.print(" ");
      }
      if (file.hasNext()) System.out.println("");
    }
  }
  public static String pigLatinSimple(String s) {
    String word = s.toLowerCase();
    if (word.charAt(0)=='a' || word.charAt(0)=='e' ||
    word.charAt(0)=='i' || word.charAt(0)=='o' ||
    word.charAt(0)=='u') {
      word = word + "hay";
    }
    else {
      word = word.substring(1, word.length()) + word.charAt(0)
      + "ay";
    }
    return word;
  }
  public static String pigLatin(String s) {
    String word = s.toLowerCase();
    if (word.length()>=2 && (word.substring(0,2).equals("bl") || word.substring(0,2).equals("br") ||
      word.substring(0,2).equals("ch") || word.substring(0,2).equals("ck") ||
      word.substring(0,2).equals("cl") || word.substring(0,2).equals("cr") ||
      word.substring(0,2).equals("dr") || word.substring(0,2).equals("fl") ||
      word.substring(0,2).equals("fr") || word.substring(0,2).equals("gh") ||
      word.substring(0,2).equals("gl") || word.substring(0,2).equals("gr") ||
      word.substring(0,2).equals("ng") || word.substring(0,2).equals("ph") ||
      word.substring(0,2).equals("pl") || word.substring(0,2).equals("pr") ||
      word.substring(0,2).equals("qu") || word.substring(0,2).equals("sc") ||
      word.substring(0,2).equals("sh") || word.substring(0,2).equals("sk") ||
      word.substring(0,2).equals("sl") || word.substring(0,2).equals("sm") ||
      word.substring(0,2).equals("sn") || word.substring(0,2).equals("sp") ||
      word.substring(0,2).equals("st") || word.substring(0,2).equals("sw") ||
      word.substring(0,2).equals("th") || word.substring(0,2).equals("tr") ||
      word.substring(0,2).equals("tw") || word.substring(0,2).equals("wh") ||
      word.substring(0,2).equals("wr"))) {
        word = word.substring(2,word.length()) + word.substring(0,2) + "ay";
      }
    else {
      word = pigLatinSimple(word);
    }
    return word;
  }
  public static String pigLatinBest(String s) {
    String word = s.toLowerCase();
    if (Character.isLetter(word.charAt(0))==false) return word;
    else if (Character.isLetter(word.charAt(word.length()-1))==false &&
    Character.isDigit(word.charAt(word.length()-1))==false) {
      String withoutpunct = word.substring(0,word.length()-1);
      word = pigLatin(withoutpunct) + word.charAt(word.length()-1);
      return word;
    }
    else {
      return pigLatin(word);
    }
  }
}
