import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d{10,}");
        Matcher matcher = pattern.matcher(stringWithNumbers);

        while (matcher.find()) {
            MatchResult matchResult = matcher.toMatchResult();
            String res = String.format("%s:%d",matchResult.group(),matchResult.group().length());
            System.out.println(res);
        }
    }
}