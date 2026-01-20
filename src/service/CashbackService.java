package service;

import model.Client;

public class CashbackService {
    public void applyCashback(Client client, double purchaseValue) {
        double cashbackValue = purchaseValue * 0.05;

        client.receiveCashback(cashbackValue);
    }
}
