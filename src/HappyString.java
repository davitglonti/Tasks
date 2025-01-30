import java.util.List;

public class HappyString {
    public static int numberOfHappyStrings(List<String> strings) {
        int count = 0;

        for (String str : strings) {
            if (isHappy(str)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isHappy(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
