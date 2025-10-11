import java.util.*;

public class SingleElementFinder {

    public static int getSingleElement(List<Integer> arr) {
        int xorr = 0;
        for (int i = 0; i < arr.size(); i++) {
            xorr = xorr ^ arr.get(i);
        }
        return xorr;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        System.out.println("Single element is: " + getSingleElement(arr));
    }
}
