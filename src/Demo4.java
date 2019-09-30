public class Demo4 {
    public static void main(String[] args) {

        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.age = 20;
        person.address = new Address();
        person.address.city = "Wrocław";
        person.address.street = "Długa";
        person.address.streetNumber = 20;

        System.out.println("Imię: " + person.firstName);
        System.out.println("Imię: " + person.lastName);
        System.out.println("Miasto: " + person.address.city);
        System.out.println("Ulica: " + person.address.street);
        System.out.println("Numer: " + person.address.streetNumber);
    }
}
