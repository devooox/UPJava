import java.util.Scanner;

class Tasks {
    public static int task1(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }

    public static double task2(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b);
    }

    public static double task3(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y)));
    }

    public static double task4(Double x) {
        int a = x.intValue() % 1000;
        double tmp = 1000 * x;
        int b = (int) tmp % 1000;
        double ans = (double) (b + (double) a / 1000);
        return ans;
    }

    public static String task5(int t) {
        int hours = t / 3600;
        hours %= 24;
        t %= 3600;
        int minutes = t / 60;
        t %= 60;
        String ans = "";
        if (hours < 10) {
            ans += '0';
        }
        ans += hours + "ч ";
        if (minutes < 10) {
            ans += '0';
        }
        ans += minutes + "мин ";
        if (t < 10) {
            ans += '0';
        }
        ans += t + "с";
        return ans;
    }

    public static boolean task6(double x, double y) {
        if (y > 4 || y < -3 || x > 4 || x < -4) {
            return false;
        }
        if (y > 0) {
            if (x > 2 || x < -2) {
                return false;
            }
            return true;
        }
        double dist = x*x + (y + 0.5)*(y+0.5);
        if (dist < 0.25) {
            return false;
        }
        return true;
    }
}

class TaskLoader {
    public static void loadTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 arguments for task 1");
        int a;
        int b;
        int c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Task 1 with arguments " + a + ", " + b + ", " + c + ": " + Tasks.task1(a, b, c));
    }

    public static void loadTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 arguments for task 2");
        double a;
        double b;
        double c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        System.out.println("Task 2 with arguments " + a + ", " + b + ", " + c + ": " + Tasks.task2(a, b, c));
    }

    public static void loadTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 arguments for task 3");
        double x;
        double y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        System.out.println("Task 3 with arguments " + x + ", " + y + ": " + Tasks.task3(x, y));

    }

    public static void loadTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 argument for task4");
        double x;
        x = scanner.nextDouble();
        System.out.println("Task 4 with argument " + x + ": " + Tasks.task4(x));

    }

    public static void loadTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 argument for task5");
        int t;
        t = scanner.nextInt();
        System.out.println("Task 5 with argument " + t + ": " + Tasks.task5(t));

    }

    public static void loadTask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 arguments for task 6");
        double x;
        double y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        System.out.println("Task 6 with arguments " + x + ", " + y + ": " + Tasks.task6(x, y));

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
    }
}
