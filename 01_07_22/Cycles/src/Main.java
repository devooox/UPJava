import java.math.BigInteger;
import java.util.Scanner;

class Tasks {
    public static int task1(int a) {
        int ans = 0;
        for (int i = 1; i <= a; i++) {
            ans += i;
        }
        return ans;
    }

    public static String task2(double a, double b, double h) {
        String ans = "";
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                ans += i + " ";
            } else {
                ans += -i + " ";
            }
        }
        return ans;
    }


    public static int task3() {
        int ans = 0;
        for (int i = 1; i <= 200; i++) {
            ans += i*i;
        }
        return ans;
    }

    public static BigInteger task4() {
        BigInteger ans = new BigInteger("1");
        for (int i = 2; i <= 200; i++) {
            ans = ans.multiply(new BigInteger(Integer.toString(i*i)));
        }
        return ans;
    }

    public static double task5(double eps) {
        double ans = 0;
        double power2 = 1./2;
        double power3 = 1./3;
        while (power2 + power3 >= eps) {
            ans += power2 + power3;
            power2 /= 2;
            power3 /= 3;
        }
        return ans;
    }

    public static String task6() {
        String ans = "";
        for (int i = 1; i < 1000; i++) {
            ans += i + " " + (char) i + '\n';
        }
        return ans;
    }

    public static String task7(int m, int n) {
        String ans = "";
        for (int i = m; i <= n; ++i) {
            ans += "(" + i + ") ";
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    ans += j + " ";
                }
            }
            ans += "\n";
        }
        return ans;
    }

    public static String task8(int m, int n) {
        String ans = "";
        boolean num1[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            num1[i] = false;
        }
        if (m == 0) {
            num1[0] = true;
        }
        while (m > 0) {
            num1[m % 10] = true;
            m /= 10;
        }
        boolean num2[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            num2[i] = false;
        }
        if (n == 0) {
            num2[0] = true;
        }
        while (n > 0) {
            num2[n % 10] = true;
            n /= 10;
        }
        for (int i = 0; i < 10; ++i) {
            if (num1[i] && num2[i]) {
                ans += i + " ";
            }
        }
        return ans;
    }
}

class TaskLoader {
    public static void loadTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 argument for task 1");
        int a;
        a = scanner.nextInt();
        System.out.println("Task 1 with arguments " + a +  ": " + Tasks.task1(a));
    }

    public static void loadTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 arguments for task 2");
        double a;
        double b;
        double h;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        h = scanner.nextDouble();
        System.out.println("Task 2 with arguments " + a + ", " + b + ", " + h + ": " + Tasks.task2(a, b, h));
    }

    public static void loadTask3() {
        System.out.println("Task 3 : " + Tasks.task3());

    }

    public static void loadTask4() {
        System.out.println("Task 4 : " + Tasks.task4());
    }

    public static void loadTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 argument for task5");
        double eps;
        eps = scanner.nextDouble();
        System.out.println("Task 5 with argument " + eps + ": " + Tasks.task5(eps));
    }
    public static void loadTask6() {
        System.out.println("Task 6 : " + Tasks.task6());
    }
    public static void loadTask7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 arguments for task7");
        int m;
        int n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("Task 7 with argument " + m + ", " + n + ": " + Tasks.task7(m, n));
    }
    public static void loadTask8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 arguments for task8");
        int m;
        int n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("Task 8 with argument " + m + ", " + n + ": " + Tasks.task8(m, n));
    }

}

public class Main {
    public static void main(String args[]) {
        TaskLoader.loadTask1();
        TaskLoader.loadTask2();
        TaskLoader.loadTask3();
        TaskLoader.loadTask4();
        TaskLoader.loadTask5();
        TaskLoader.loadTask6();
        TaskLoader.loadTask7();
        TaskLoader.loadTask8();
    }
}
