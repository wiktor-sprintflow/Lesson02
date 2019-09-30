import java.util.Arrays;

public class Calculator {
    public static void main(String[] args) {
        double a = 102;
        double b = 5.5;

        double sum = a + b;
        double difference = a - b;
        double multiplication = a * b;
        double division = a / b;

        System.out.println("Suma " + a + " i " + b + " wynosi: " + sum);
        System.out.println("Różnica " + a + " i " + b + " wynosi: " + difference);
        System.out.println("Iloczyn " + a + " i " + b + " wynosi: " + multiplication);
        System.out.println("Iloraz " + a + " i " + b + " wynosi: " + division);
        System.out.printf("%s%2.2f", "Wynik dzielenia: ", division);

        System.out.println();

        System.out.println("Czy liczba a jest wieksza od 0? " + (a > 0));
        System.out.println("Czy suma jest parzysta? " + (a % 2 == 0));
        System.out.println("Czy a lub b jest większe od 100? " + (a > 100 || b > 100));
        System.out.println("Czy a i b jest większe od 100? " + (a > 100 && b > 100));

        double x =20;
        double y =15;
        double z =10;

        boolean result1 = (x > y || y > z);
        boolean result2 = (x > y && y > z);
        boolean result3 = (x + z >= y);
        boolean result4 = (y - z < x);
        boolean result5 = (x * y != z);
        boolean result6 = (x * y > 1/(z/x));

        System.out.println("czy x jest większe od y lub y jest większe od z? " + result1);
        System.out.println("czy x jest większe od y oraz od z? " + result2);
        System.out.println("czy suma x i z jest większa lub równa y? " + result3);
        System.out.println("czy różnica y i z jest mniejsza od x? " + result4);
        System.out.println("czy iloczyn x i y jest różny od z? " + result5);
        System.out.println("czy iloczyn x i y jest większy niż odwrotność ilorazu z i x? " + result6);
    }
}
