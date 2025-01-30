import java.util.HashSet;
import java.util.Set;

public class IntersectionFinder {


    public int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();


        for (int num : nums1) {
            set1.add(num);
        }


        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }


        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
