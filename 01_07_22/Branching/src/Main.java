import java.util.Scanner;

class Tasks {
    public static String task1(int x, int y) {
        String ans = "";
        if (x + y >= 180 || x <= 0 || x <= 0) {
            ans = "No";
            return ans;
        }
        ans += "Yes ";
        if (x + y == 90 || x == 90 || y == 90) {
            ans += "rectangular";
        } else {
            ans += "non-rectangular";
        }
        return ans;
    }

    public static int task2(int a, int b, int c, int d) {
        int tmp1 = a;
        if (b < tmp1) {
            tmp1 = b;
        }
        int tmp2 = c;
        if (d < tmp2) {
            tmp2 = d;
        }
        if (tmp1 > tmp2) {
            return tmp1;
        }
        return tmp2;
    }

    public static boolean task3(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 == x2 || x1 == x3 || x2 == x3 || y1 == y2 || y1 == y3 || y2 == y3) {
            if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
                return true;
            }
            return false;
        }
        if ((x3-x1)/(x2-x1) == (y3-y1)/(y2-y1)) {
            return true;
        }
        return false;
    }

    public static boolean task4(int a, int b, int x, int y, int z) {
        int min1 = a;
        int max1 = b;
        if (b < min1) {
            min1 = b;
            max1 = a;
        }
        int min2 = x;
        int min3 = y;
        if (y >= z && y >= x) {
            min3 = z;
        } else {
            min2 = z;
        }
        if (min2 > min3) {
            int tmp = min2;
            min2 = min3;
            min3 = tmp;
        }
        if (min2 <= min1 && min3 <= max1) {
            return true;
        }
        return false;
    }

    public static double task5(double x) {
        if (x <= 3) {
            return x*x - 3*x + 9;
        }
        return 1. / (x*x*x + 6);
    }

}

class TaskLoader {
    public static void loadTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 arguments for task 1");
        int a;
        int b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Task 1 with arguments " + a + ", " + b + ": " + Tasks.task1(a, b));
    }

    public static void loadTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 arguments for task 2");
        int a;
        int b;
        int c;
        int d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        System.out.println("Task 2 with arguments " + a + ", " + b + ", " + c + ", " + d + ": " + Tasks.task2(a, b, c, d));
    }

    public static void loadTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 arguments for task 3");
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        System.out.println("Task 3 with arguments " + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ", " + x3 + ", " + y3 + ": " + Tasks.task3(x1, y1, x2, y2, x3, y3));

    }

    public static void loadTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 arguments for task4");
        int a;
        int b;
        int x;
        int y;
        int z;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println("Task 4 with argument " + a + ", " + b + ", "+ x + ", "+ y + ", "+ z + ": " + Tasks.task4(a, b, x, y, z));

    }

    public static void loadTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 argument for task5");
        double x;
        x = scanner.nextDouble();
        System.out.println("Task 5 with argument " + x + ": " + Tasks.task5(x));

    }

}

public class Main {
    public static void main(String args[]) {
        TaskLoader.loadTask1();
        TaskLoader.loadTask2();
        TaskLoader.loadTask3();
        TaskLoader.loadTask4();
        TaskLoader.loadTask5();
    }
}
