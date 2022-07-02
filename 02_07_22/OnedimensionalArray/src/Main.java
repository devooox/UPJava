import java.util.ArrayList;

class Tasks {
    public static int task1(int[] a, int k) {
        int ans = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] % k == 0) {
                ans += a[i];
            }
        }
        return ans;
    }

    public static int task2(int[] a, int z) {
        int ans = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > z) {
                a[i] = z;
                ans++;
            }
        }
        return ans;
    }

    public static int[] task3(int[] a) {
        int ans[] = new int[3];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > 0) {
                ans[2]++;
            } else if (a[i] == 0) {
                ans[1]++;
            } else {
                ans[0]++;
            }
        }
        return ans;
    }

    public static void task4(int[] a) {
        int minInd = 0;
        int maxInd = 0;
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
                maxInd = i;
            }
            if (a[i] < min) {
                min = a[i];
                minInd = i;
            }
        }
        int tmp = a[minInd];
        a[minInd] = a[maxInd];
        a[maxInd] = tmp;
    }

    public static void task5(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > i+1) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static double task6(double[] a) {
        double ans = 0;
        if (a.length < 2) {
            return ans;
        }
        ArrayList<Integer> resheto = new ArrayList<Integer>();
        resheto.add(2);
        ans += a[1];
        for (int i = 2; i < a.length; ++i) {
            boolean isPrime = true;
            int ind = i+1;
            for (int j = 0; j < resheto.size(); ++j) {
                if (resheto.get(j) <= Math.sqrt(ind)) {
                    if ((ind) % resheto.get(j) == 0) {
                        isPrime = false;
                        break;
                    }
                } else {
                    break;
                }
            }

            if (isPrime) {
                ans += a[i];
                resheto.add(ind);
            }

        }
        return ans;
    }

    public static double task7(double[] a) {
        double max = a[0] + a[a.length-1];
        for (int i = 1; i < a.length/2; ++i) {
            if (max < a[i] + a[a.length-i-1]) {
                max = a[i] + a[a.length-i-1];
            }
        }
        return max;
    }

    public static int[] task8(int[] a) {
        int min = a[0];
        int counter = 1;
        for (int i = 1; i < a.length; ++i) {
            if (a[i] == min) {
                counter++;
            }
            if (a[i] < min) {
                min = a[i];
                counter = 1;
            }
        }
        int[] ans = new int[a.length-counter];
        int currentIndex = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > min) {
                ans[currentIndex] = a[i];
                currentIndex++;
            }
        }

        return ans;
    }

    public static int task9(int[] a) {
        int resNum = a[0];
        int resCounter = 1;
        for (int i = 1; i < a.length; ++i) {
            if (a[i] == resNum) {
                resCounter++;
            }
        }
        for (int i = 1; i < a.length; ++i) {
            int counter = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) {
                    counter++;
                }
            }
            if (counter == resCounter) {
                if (a[i] < resNum) {
                    resNum = a[i];
                }
            }
            if (counter < resCounter) {
                resCounter = counter;
                resNum = a[i];
            }
        }
        return resNum;
    }

    public static void task10(int[] a) {
        int currentIndex = 0;
        for (int i = 0; i < a.length; i += 2) {
            a[currentIndex] = a[i];
            currentIndex++;
        }
        for (int i = currentIndex; i < a.length; ++i) {
            a[i] = 0;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println(Tasks.task6(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}));
    }
}
