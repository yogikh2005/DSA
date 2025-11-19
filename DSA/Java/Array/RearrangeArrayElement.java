import java.util.*;

class RearrangeArrayElement {
    public static int[] alternateNumbers(int[] a) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        int n = a.length;

        // Separate positives and negatives
        for (int value : a) {
            if (value > 0) {
                pos.add(value);
            } else {
                neg.add(value);
            }
        }

        int[] result = new int[n];

        // Case: more positives
        if (pos.size() > neg.size()) {

            for (int i = 0; i < neg.size(); i++) {
                result[2 * i] = pos.get(i);
                result[2 * i + 1] = neg.get(i);
            }

            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                result[index++] = pos.get(i);
            }

        } 
        // Case: more negatives or equal
        else {

            for (int i = 0; i < pos.size(); i++) {
                result[2 * i] = pos.get(i);
                result[2 * i + 1] = neg.get(i);
            }

            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                result[index++] = neg.get(i);
            }
        }

        return result;
    }
	public static void main(String argv[])
	{
		int arr[]={3,2,-4,2,-1,5,-9,7,-9,-9,-99};
		int ans[]=new int[arr.length];
		ans=alternateNumbers(arr);
		for(int value:ans)
		{
			System.out.println(value);
		}
	}
}
