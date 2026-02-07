

public class Main {

    public static void main(String[] args) {
        int sumTotal = sumDigits(125);
        System.out.println("Sum digits of 10: " + sumDigits(10));
        System.out.println("Sum digits of 100: " +sumDigits(100));
        System.out.println("Sum digits of 125: " +sumDigits(125));
        System.out.println("Sum digits of 994: " +sumDigits(994));
        System.out.println("Sum digits of 1001: " +sumDigits(1001));

    }

    public static int sumDigits(int number) {
        int a, b, c, d, e, f, sum;
        if (number > 0) {
            if (number >= 1 && number <= 9) {
                return number;
            }
            else if (number >= 10 && number <= 99) {
                a = number % 10;
                b = number / 10;
                sum = a + b;
                return sum;
            }
            else if (number >= 100 && number <= 999) {
                a = number % 10;
                b = number / 10;
                c = b % 10;
                d = b / 10;
                sum = a + c + d;
                return sum;
            }
            else if (number >= 1000 && number <= 9999) {
                a = number % 10;
                b = number / 10;
                c = b % 10;
                d = b / 10;
                e = d % 10;
                f = d / 10;
                sum = a + c + e + f;
                return sum;
            }
        }
        return -1;
    }
}