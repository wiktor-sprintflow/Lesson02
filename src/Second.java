public class Second {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int sum = a+b;

        System.out.println("Suma to: " + sum);

        int c = a++;
        System.out.println(c);

        System.out.println(a);

        c = ++a;
        System.out.println(c);

        double d = 4.5;

        System.out.println(a+d);
        System.out.println((int) (a + d));
    }
}
