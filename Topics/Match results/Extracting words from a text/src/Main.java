import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("program[a-zA-Z]*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            MatchResult matchResult = matcher.toMatchResult();
            String res = String.format("%d %s", matchResult.start(), matchResult.group());
            System.out.println(res);
        }
    }
}
