import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        Time t = new Time();
        t.hour = 12;
        return t;
    }

    public static Time midnight() {
        return new Time();
    }

    public static Time ofSeconds(long seconds) {
        Time t = new Time();
        int tmp = (int) (seconds / 3600);
        int hour = tmp > 23 ? (tmp % 24) : tmp;
        int minutes = (int) ((seconds % 3600) / 60);
        int second = (int) (seconds % 60);
        t.hour=hour;
        t.minute=minutes;
        t.second=second;
        return t;
    }

    public static Time of(int hour, int minute, int second) {
        Time t = new Time();
        t.hour = hour;
        t.minute = minute;
        t.second = second;
        return t;

    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.printf("%s %s %s", time.hour, time.minute, time.second);
        }
    }
}