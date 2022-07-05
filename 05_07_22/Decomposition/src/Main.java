import java.util.ArrayList;

class GCD {
    public static int gcd(int a, int b) {
        while (b > 0) {
            a %= b;
            int tmp = a;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcd4(int a, int b, int c, int d) {
        return gcd(gcd(gcd(a, b), c), d);
    }
}

class LCM {
    public static int lcm(int a, int b) {
        return a * b / GCD.gcd(a, b);
    }
}

class SquareCalcuclator {
    public static double rightTrinagle(double a) {
        return a * a * Math.sqrt(3) / 4;
    }

    public static double rightHexagon(double a) {
        return 6 * rightTrinagle(a);
    }
}

class Point {
    int x;
    int y;
}

class MaxDistances {
    public static double calcDistance(Point point1, Point point2) {
        return Math.sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y));
    }

    public static Point[] maxDistance(Point[] points) {
        if (points.length == 1) {
            return new Point[0];
        }
        Point[] a = new Point[2];
        a[0] = points[0];
        a[1] = points[1];
        double dist = calcDistance(points[0], points[1]);
        for (int i = 0; i < points.length; ++i) {
            for (int j = i+1; j < points.length; ++j) {
                if (calcDistance(points[i], points[j]) > dist) {
                    dist = calcDistance(points[i], points[j]);
                }
            }
        }
        return a;
    }
}

class SecondMax {
    public static void findSecondMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; ++i) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        boolean check = true;
        int secondMax = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < max) {
                if (check) {
                    secondMax = a[i];
                    check = false;
                } else {
                    if (a[i] > secondMax) {
                        secondMax = a[i];
                    }
                }
            }
        }
        if (!check) {
            System.out.println(secondMax);
        }
    }
}

class MutualSimpleNumbers {
    public static boolean isMutualSimple(int a, int b) {
        int tmp = Math.min(a, b);
        for (int i = 2; i <= tmp; ++i) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMutualSimple3(int a, int b, int c) {
        return isMutualSimple(a, b) && isMutualSimple(a, c) && isMutualSimple(b, c);
    }
}

class FactorialSum {
    public static int sumFactorial() {
        int ans = 0;
        int factorial = 1;
        for (int i = 1; i <= 9; ++i) {
            factorial *= i;
            if (i % 2 == 1) {
                ans += factorial;
            }
        }
        return ans;
    }
}

class SubarraySum {
    public static int[] subarraySum(int[] a, int k, int m) {
        if (m-k < 2) {
            return new int[0];
        }
        int[] ans = new int[m-k-1];
        int tmp = a[k-1] + a[k] + a[k+1];
        ans[0] = tmp;
        for (int i = k+2; i < m; ++i) {
            tmp -= a[i-3];
            tmp += a[i];
            ans[i-k-1] = tmp;
        }
        return ans;
    }
}

class QuadrilateralSquare {
    public static double calcQuadrilateralSquare(double x, double y, double z, double t) {
        double ans = 0;
        ans += x*y/2;
        double c = Math.sqrt(x*x+y*y);
        double p = (z+t+c)/2;
        ans += Math.sqrt(p*(p-c)*(p-z)*(p-t));
        return ans;
    }
}

class Nums {
    public static int numLength(int num) {
        if (num == 0) {
            return 1;
        }
        int counter = 0;
        while (num > 0) {
            num /= 10;
            counter++;
        }
        return counter;
    }

    public static int[] numToArray(int num) {
        int[] ans = new int[numLength(num)];
        if (num == 0) {
            ans[0] = 0;
            return ans;
        }
        int counter = 0;
        while (num > 0) {
            ans[counter] = num % 10;
            num /= 10;
            counter++;
        }
        return ans;
    }

    public static int whichLonger(int a, int b) {
        if (numLength(a) > numLength(b)) {
            return a;
        }
        return b;
    }

}

class PrimeTwins {
    public static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isPrimeTwins(int n) {
        for (int i = n; i <= 2*n; i += 2) {
            if (i % 2 == 0) {
                i++;
            }
            if (isPrime(i)) {
                if (isPrime(i+2)) {
                    System.out.println(i + " " + i+2);
                }
            }
        }
    }
}

class ArmstrongNums {
    static public int numLength(int x) {
        if (x == 0) {
            return 1;
        }
        int counter = 0;
        while (x >0) {
            counter++;
            x /= 10;
        }
        return counter;
    }

    static public int[] numInArray(int x) {
        int[] a = new int[numLength(x)];
        if (x == 0) {
            a[0] = 0;
            return a;
        }
        int counter = 0;
        while (x > 0) {
            a[counter] = x % 10;
            x /= 10;
            counter++;
        }
        return a;
    }
    static public boolean isArmstrongNum(int x) {
        int[] a = numInArray(x);
        int sum = 0;
        for (int i = 0; i < a.length; ++i) {
            sum += a[i];
        }
        int ans = sum;
        for (int i = 2; i <= a.length; ++i) {
            ans *= sum;
        }
        if (ans == x) {
            return true;
        }
        return false;
    }
    static public ArrayList<Integer> armstorngNums(int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= k; ++i) {
            if (isArmstrongNum(i)) {
                a.add(i);
            }
        }

        return a;
    }
}



public class Main {
    public static void main(String args[]) {

    }
}
