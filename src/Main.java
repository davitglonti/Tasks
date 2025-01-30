import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       //1 task
        String input = "5+20-8+5";
        System.out.println("Result: " + ArithmeticSolver.computeExpression(input)); // Result: 22
        //
         //2 TASK
        List<String> strings = List.of("abbcc", "abc", "abcabc", "cabcbb");
        System.out.println("Number of happy strings: " + HappyString.numberOfHappyStrings(strings)); // Output: 2
        //
         // 3 Task
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = LinkedList.reverseList(head);
        LinkedList.printReversedList(reversedHead);

        //4 Task
        IntersectionFinder finder = new IntersectionFinder();
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};


        int[] result = finder.findIntersection(nums1, nums2);

        System.out.println(Arrays.toString(result));  // result: [3, 4, 5]

        //5 Task

        int[] array = {8, 4, 8, 8, 5, 1};
        int k = 8;


        int resultss = LongestSubarray.lenOfLongSubarr(array, k);


        System.out.println(resultss);

        //

        //6 Task
        int[] array5 = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};


        boolean resultsss = SequenceValidator.isValidSequence(array5, sequence);
        System.out.println(resultsss);  // true
    }


    }

