import java.util.Scanner;
public class MakeStars {
  public static void main(String[] args) {
    Scanner file = new Scanner(System.in);
    while (file.hasNextLine()) {
      Scanner line = new Scanner(file.nextLine());
      while (line.hasNext()) {
        String word = line.next();
        for (int i=0; i<word.length();i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }

}
