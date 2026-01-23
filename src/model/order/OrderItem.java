package model.order;

import model.menu.MenuItem;

public class OrderItem {
    
    // Class attributes
    private final MenuItem menuItem;
    private int quantity;
    private final double unitPrice;  // Stores price at order time (in case menu price changes later)

    // Constructor
    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
        this.unitPrice = menuItem.getPrice();  // Captures current price
    }

    // Getters
    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Business method - calculates total for this item (price * quantity)
    public double getSubtotal() {
        return unitPrice * quantity;
    }

    // Setter - allows changing quantity
    public void setQuantity(int quantity) {
        if (quantity > 0) {  // Validation: quantity must be positive
            this.quantity = quantity;
        }
    }

    // Business method - increases quantity by 1
    public void incrementQuantity() {
        this.quantity++;
    }

    // Business method - decreases quantity by 1
    public void decrementQuantity() {
        if (this.quantity > 1) {  // Prevents going below 1
            this.quantity--;
        }
    }
}