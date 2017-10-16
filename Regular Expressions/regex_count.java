import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_count {

   public static void main( String args[] ) {
      // count the number of times cat occurs in a sentence.
      String line = "cat cat cat cattie cat";
      // \b matches the word boundaries when outside the brackets
      String pattern = "(\\bcat\\b)"; // \b ensures cat is not a substring in a longer word

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);


      // Now create matcher object.
      Matcher m = r.matcher(line);
      int count =0;
      System.out.println("Occurences of the word \"cat\"");
      while (m.find( )) {
         count++;
         System.out.println("Match : " + count );
         System.out.println("start index: " + m.start() );
         System.out.println("end index: " + m.end() );
      }
   }
}