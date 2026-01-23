import model.user.Client;
import model.user.Establishment;
import model.enums.PlanType;
import model.menu.MenuItem;
import service.CashbackService;

public class Main {
    public static void main(String[] args) {

        // Creating an establishment
        Establishment bar = new Establishment(
            2L, 
            "Chapéu de Javali Tabacaria & Pub", 
            "contato@chapeudejavali.com", 
            "0987654321", 
            "Chapéu de Javali", 
            "12.183.895/0001-00"
        );
        
        // Creating a client
        Client client = new Client(
            1L, 
            "Márcio", 
            "marcio@marcio.com", 
            "1234567890", 
            PlanType.PREMIUM
        );

        // Creating menu items for the bar
        MenuItem burger = new MenuItem(
            1L,
            "Artisan Burger",
            "Brioche bun, 180g beef blend, cheddar cheese, caramelized onions, bacon and special sauce",
            35.90,
            "Food",
            bar.getId()  // Links the item to the establishment
        );

        MenuItem beer = new MenuItem(
            2L,
            "IPA Craft Beer",
            "Local craft IPA, 500ml, citrus notes and balanced bitterness",
            18.50,
            "Beverages",
            bar.getId()
        );

        MenuItem dessert = new MenuItem(
            3L,
            "Brownie with Ice Cream",
            "Warm chocolate brownie with vanilla ice cream and chocolate syrup",
            22.00,
            "Desserts",
            bar.getId()
        );

        // Testing MenuItem methods
        System.out.println("=== MENU ITEMS ===");
        System.out.println("Item: " + burger.getName());
        System.out.println("Description: " + burger.getDescription());
        System.out.println("Price: R$ " + burger.getPrice());
        System.out.println("Category: " + burger.getCategory());
        System.out.println("Available: " + burger.isAvailable());
        System.out.println();

        // Modifying price
        System.out.println("=== UPDATING PRICE ===");
        System.out.println("Old price: R$ " + burger.getPrice());
        burger.setPrice(39.90);
        System.out.println("New price: R$ " + burger.getPrice());
        System.out.println();

        // Disabling an item (item ran out)
        System.out.println("=== DISABLING ITEM ===");
        System.out.println(dessert.getName() + " available: " + dessert.isAvailable());
        dessert.disable();
        System.out.println(dessert.getName() + " available after disable: " + dessert.isAvailable());
        dessert.enable();
        System.out.println(dessert.getName() + " available after enable: " + dessert.isAvailable());
        System.out.println();

        // Testing cashback
        CashbackService cashbackService = new CashbackService();
        cashbackService.applyCashback(client, 200);

        System.out.println("=== CASHBACK TEST ===");
        System.out.println("Client: " + client.getName());
        System.out.println("Cashback: R$ " + client.getCashbackBalance());
        System.out.println("Establishment: " + bar.getbusinessName());
    }
}