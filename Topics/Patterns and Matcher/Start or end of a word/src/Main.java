import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

      // String part = "ing";
      // String line = "Java is the most popular programming language";
        Pattern pattern = Pattern.compile("(\\b" + part + "|" + part + "\\b)", Pattern.CASE_INSENSITIVE);
       // Pattern pattern = Pattern.compile("ing\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        boolean b = matcher.find();
        String result = b ? "YES" : "NO";
        System.out.println(result);
    }
}