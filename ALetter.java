import java.util.Scanner;

public class ALetter{
   public static void main (String [] args) {
      System.out.println("Enter a letter: ");
      Scanner in = new Scanner(System.in);
      String entry = in.nextLine();
      System.out.println("You entered: " + entry);
      if (entry.length()>1) {
         return;
      }
      if (("aeiou".indexOf(entry))!=-1){
         System.out.println("Bad Job.");
      } else {
         System.out.println("Good Job!!!");
      }
   }
}