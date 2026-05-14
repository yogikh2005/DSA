class PageAllocationProblem {

        private static boolean isPossible(int[] arr, int k, int maxPages) {

        int studenrCnt = 1;
        int pages = 0;

            for(int i = 0 ;i<arr.length;i++) {

            if (pages + arr[i] <= maxPages) 
            {
                pages += arr[i];
            } 
            else 
            {
                studenrCnt++;
                pages = 0;

                if (studenrCnt > k || arr[i]>maxPages) {
                    return false;
                }
                else
                {
                    pages += arr[i];
                }
            }
        }

        return true;
    }

    public static int findPages(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }
        
        int start = 0;
        int end = 0;

        for (int num : arr) {
            start = Math.max(start, num);
            end += num;
        }

        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(arr, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else 
            {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        int k = 2;

        System.out.println(findPages(arr, k));

    }    
}