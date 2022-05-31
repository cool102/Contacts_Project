import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(password\\s*:*\\s*)([0-9]*[a-zA-Z]*\\d*)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group(2));
            while (matcher.find()) {
                MatchResult matchResult = matcher.toMatchResult();
                String result = String.format("%s", matchResult.group(2));
                System.out.println(result);

            }
        } else {
            System.out.println("No passwords found.");
        }
    }
}
