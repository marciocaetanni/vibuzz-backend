import model.Client;
import model.Establishment;
import model.PlanType;
import service.CashbackService;

public class Main {
    public static void main(String[] args) {

        Establishment bar = new Establishment(
            2L, 
            "Chapéu de Javali Tabacaria & Pub", 
            "contato@chapeudejavali.com", 
            "0987654321", 
            "Chapéu de Javali", 
            "12.183.895/0001-00"
        );
        
        Client client = new Client(
            1L, 
            "Márcio", 
            "marcio@marcio.com", 
            "1234567890", 
            PlanType.PREMIUM
        );

        CashbackService cashbackService = new CashbackService();

        cashbackService.applyCashback(client, 200);

        System.out.println("Cliente: " + client.getName());
        System.out.println("Cashback: " + client.getCashbackBalance());
        System.out.println("Estabelecimento: " + bar.getbusinessName());
    }
}