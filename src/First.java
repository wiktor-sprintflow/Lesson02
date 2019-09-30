public class First {
    public static void main(String[] args) {
        String name = "Jan";
        final int age = 20;
        System.out.println("Mam na imię " + name);
        System.out.println("Mam " + age + " lat.");

        name = "Karol";
        System.out.println("A teraz " + name);

        //age = 25; zmienna finalna, nie można zmieniać
    }
}
