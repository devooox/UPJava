import java.util.Arrays;
import java.util.Random;

class Tasks {
    public static void task1(int[][] a) {
        for (int i = 0; i < a[0].length; ++i) {
            if (i % 2 == 0) {
                if (a[0][i] > a[a.length - 1][i]) {
                    for (int j = 0; j < a.length; ++j) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void task2(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i][i]);
        }
        System.out.println();
    }

    public static void task3(int[][] a, int k, int p) {
        for (int i = 0; i < a[k - 1].length; ++i) {
            System.out.print(a[k = 1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i][p - 1] + " ");
        }
        System.out.println();
    }

    public static int[][] task4(int n) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i % 2 == 0) {
                    ans[i][j] = j + 1;
                } else {
                    ans[i][j] = n - j;
                }
            }
        }
        return ans;
    }

    public static int[][] task5(int n) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i + j <= n - 1) {
                    ans[i][j] = i + 1;
                } else {
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static int[][] task6(int n) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < n / 2; ++i) {
            for (int j = i; j < n - i; ++j) {
                ans[i][j] = 1;
            }
        }
        for (int i = n-1; i >= n / 2; --i) {
            for (int j = n-i-1; j < i+1; ++j) {
                ans[i][j] = 1;
            }
        }
        return ans;
    }

    public static double[][] task7(int n) {
        double[][] ans = new double[n][n];
        int counter =0;
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j) {
                ans[i][j] = Math.sin((double) (i*i-j*j)/n);
                if (ans[i][j] > 0) {
                    counter++;
                }
            }
        }
        System.out.println("Amount of positive elements: " + counter);
        return ans;
    }

    public static void task8(int[][] a, int x, int y) {
        for (int i = 0; i < a[x].length; ++i) {
            int tmp = a[i][x];
            a[i][x] = a[i][y];
            a[i][y] = tmp;
        }
    }

    public static double task9(double[][] a) {
        double sum = 0;
        int ind = -1;
        for (int i = 0; i < a[0].length; ++i) {
            double tmpSum = 0;
            for (int j = 0; j < a.length; ++j) {
                tmpSum += a[j][i];
            }
            if (tmpSum > sum) {
                sum = tmpSum;
                ind = i;
            }
        }
        System.out.println("Colomn with index " + ind + " have the biggest sum");
        return sum;
    }

    public static int[] task10(int[][] a) {
        int size = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i][i]> 0) {
                size++;
            }
        }
        int[] ans = new int[size];
        size = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i][i]> 0) {
                ans[size] = a[i][i];
                size++;
            }
        }
        return ans;
    }

    public static void task11() {
        int[][] a = new int[10][20];
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                a[i][j] = random.nextInt(16);
            }
        }
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Indexes of rows where number 5 constists 3 or more times: ");
        for (int i = 0; i < 10; i++) {
            int counter = 0;
            for (int j = 0; j < 20; ++j) {
                if (a[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task12(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            Arrays.sort(a[i]);
        }
        //reverse
//        for (int i = 0; i < a.length; ++i) {
//            for (int j = 0; j < a[i].length/2; ++j) {
//                int tmp = a[i][j];
//                a[i][j] = a[i][a[i].length-j-1];
//                a[i][a[i].length-j-1] = tmp;
//            }
//        }
    }

    public static void task13(int[][] a) {
        for (int i = 0; i < a[0].length; ++i) {
            int[] tmp = new int[a.length];
            for (int j = 0; j < a.length; ++j) {
                tmp[j] = a[j][i];
            }
            Arrays.sort(tmp);
            for (int j = 0; j < a.length; ++j) {
                a[j][i] = tmp[j];
            }
        }
        //reverse
//        for (int i = 0; i < a[0].length; ++i) {
//            for (int j = 0; j < a.length/2; ++j) {
//                int tmp = a[j][i];
//                a[j][i] = a[a.length-j-1][i];
//                a[a.length-j-1][i] = tmp;
//            }
//        }
    }

    public static int[][] task14(int m, int n) {
        int[][] a = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = random.nextInt(2);
            }
        }
        for (int i = 0; i < n; ++i) {
            int counter = 0;
            for (int j = 0; j < m; ++j) {
                if (a[j][i] == 1) {
                    counter++;
                }
            }
            int current = 0;
            while (counter != i) {
                if (counter > i && a[current][i] == 1) {
                    a[current][i] = 0;
                    counter--;
                }
                if (counter < i && a[current][i] == 0) {
                    a[current][i] = 1;
                    counter++;
                }
                current++;
            }
        }
        return a;
    }

    public static void task15(int[][] a) {
        int max = a[0][0];
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (a[i][j] % 2 == 1) {
                    a[i][j] = max;
                }
            }
        }
    }


}

public class Main {
    public static void main(String args[]) {
        int[][] a = new int[3][3];
        a[0][0] = 9;
        a[0][1] = 8;
        a[0][2] = 7;
        a[1][0] = 6;
        a[1][1] = 5;
        a[1][2] = 4;
        a[2][0] = 3;
        a[2][1] = 2;
        a[2][2] = 1;
        Tasks.task1(a);
        System.out.println();
        a = Tasks.task4(4);
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        a = Tasks.task5(6);
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        a = Tasks.task6(6);
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        Tasks.task11();
        System.out.println();


        int[][] b = Tasks.task14(5, 5);

        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b.length; ++j) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
