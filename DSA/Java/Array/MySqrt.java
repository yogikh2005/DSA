
class MySqrt {

    static public double mySqrt(int x) {

        int s = 1;
        int e = x;
        double ans = -1;

        if (x == 0) {
            return 0;
        }

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m == x / m) {
                return m; 
            }else if (m > x / m) {
                e = m - 1; 
            }else {
                ans = m;
                s = m + 1;
            }
        }

        double factor = 1;
        int totalPrecision = 3;

        for (int round = 1; round <= totalPrecision; round++) {
            factor = factor / 10;

            for (int i = 1; i <= 10; i++) {
                double newAns = ans + factor;

                //equality case is ignored as of now, but make sure that you keep this in your final code
                if (newAns * newAns == x) {
                    return newAns;
                }

                if (newAns * newAns < x) {
                    ans = newAns;
                } else {
                    // newAns * newAns > x
                    break;
                }
            }

        }
        return (Math.round(ans*1000)/1000.0);
    }

    public static void main(String[] args) {
        
        System.out.println("Sqrt of "+mySqrt(56));
    }
}
