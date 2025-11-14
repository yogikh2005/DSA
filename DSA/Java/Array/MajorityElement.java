public class MajorityElement {

    public static int majorityElement(int[] v) {
        int cnt = 0;
        int el = 0;

        // Phase 1: Find candidate
        for (int i = 0; i < v.length; i++) {
            if (cnt == 0) {
                el = v[i];
                cnt = 1;
            } else if (v[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Phase 2: Verify candidate
        int cnt1 = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > v.length / 2) {
            return el;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr)); // Output: 2
    }
}
