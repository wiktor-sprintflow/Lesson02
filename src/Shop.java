public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productName = "Odkurzacz";
        product1.manufacturer = new Manufacturer();
        product1.manufacturer.address = new Address();

        product1.manufacturer.name = "Zelmer";
        product1.manufacturer.address.city = "Poznań";
        product1.manufacturer.address.street = "Wielka";
        product1.manufacturer.address.streetNumber = 22;
        product1.price = 200;
        product1.available = true;


        Product product2 = new Product();
        product2.manufacturer = new Manufacturer();
        product2.manufacturer.address = new Address();
        product2.productName = "Telewizor";
        product2.manufacturer.name = "Samsung";
        product2.manufacturer.address.city = "Warszawa";
        product2.manufacturer.address.street = "Wiejska";
        product2.manufacturer.address.streetNumber = 244;
        product2.price = 1200;
        product2.available = false;

        Product product3 = new Product();
        product3.manufacturer = new Manufacturer();
        product3.manufacturer.address = new Address();
        product3.productName = "Czajnik";
        product3.manufacturer.name = "Siemens";
        product3.manufacturer.address.city = "Szczecin";
        product3.manufacturer.address.street = "Nowowiejska";
        product3.manufacturer.address.streetNumber = 3;
        product3.price = 149.99;
        product3.available = true;

        System.out.println("Produkt: " + product1.productName + " firmy " + product1.manufacturer.name + " kosztuje: " + product1.price + " zł. Dostępny: " + product1.available);
        System.out.println("Produkt: " + product2.productName + " firmy " + product2.manufacturer.name + " kosztuje: " + product2.price + " zł. Dostępny: " + product2.available);
        System.out.println("Produkt: " + product3.productName + " firmy " + product3.manufacturer.name + " kosztuje: " + product3.price + " zł. Dostępny: " + product3.available);

        ////////////

        Address address = new Address();
        address.city = "Poznan";
        address.street = "Duza";
        address.streetNumber = 20;

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.name = "Milka";
        manufacturer.address = address;

        Product product = new Product();
        product.productName = "Czekolada";
        product.available=true;
        product.price=3;
        product.manufacturer=manufacturer;
    }
}
