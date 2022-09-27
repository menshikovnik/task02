import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a = readNumber("Введите коэфицент a: ");

        double b = readNumber("Введите коэфицент b: ");

        double c = readNumber("Введите коэфицент c: ");

        double D = discriminant(b, a, c);

        System.out.println(checkD(b, D, a));


    }

    public static String checkD (double b, double D, double a) {
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            return ("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            return ("Корень кравнения:" + x);

        } else {

            return ("Не имеет корней");
        }
    }

    static double readNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextDouble();
    }

    static double discriminant(double b, double a, double c) {
        return b * b - 4 * a * c;
    }
}
