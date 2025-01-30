public class ArithmeticSolver {
    public static int computeExpression(String input) {
        int total = 0;
        int num = 0;
        char sign = '+';

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (!Character.isDigit(c) || i == input.length() - 1) {
                if (sign == '+') {
                    total += num;
                } else if (sign == '-') {
                    total -= num;
                }
                sign = c;
                num = 0;
            }
        }

        return total;
    }
}