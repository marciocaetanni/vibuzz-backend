package model;

public class Client extends User {

    private double cashbackBalance;
    private final boolean premium;
    
    public Client(
    Long id,
    String name, 
    String email, 
    String password,
    boolean premium
    ) {
        super(id, name, email, password);
        this.premium = premium;
        this.cashbackBalance = 0.0;
    }

    public double getCashbackBalance() {
        return cashbackBalance;
    }

    public boolean isPremium() {
        return premium;
    }

    public void receiveCashback(double value) {
        if (premium) {
            value *= 2;
        }
        this.cashbackBalance += value;
    }
}
