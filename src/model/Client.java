package model;

public class Client extends User {

    private double cashbackBalance;
    private final PlanType planType;
    
    public Client(
    Long id,
    String name, 
    String email, 
    String password,
    PlanType planType
    ) {
        super(id, name, email, password);
        this.planType = planType;
        this.cashbackBalance = 0.0;
    }

    public double getCashbackBalance() {
        return cashbackBalance;
    }

    public PlanType planType() {
        return planType;
    }

    public void receiveCashback(double value) {
        this.cashbackBalance += value * planType.cashMultiplier();
    }
}
