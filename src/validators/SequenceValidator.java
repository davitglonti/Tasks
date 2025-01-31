package validators;

public class SequenceValidator {
    public static boolean isValidSequence(int[] array, int[] sequence) {
        int seqIndex = 0;

        for (int num : array) {
            if (seqIndex == sequence.length) {
                break;
            }
            if (num == sequence[seqIndex]) {
                seqIndex++;
            }
        }

        return seqIndex == sequence.length;
    }
}
