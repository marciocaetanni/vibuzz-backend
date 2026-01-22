package model.menu;

public class MenuItem {
    
    // Class attributes
    private final Long id;
    private final String name;
    private final String description;
    private double price;
    private final String category;
    private final Long establishmentId;  // ID of the establishment that owns this item
    private boolean available;
    private String imagePath;

    // Constructor - special method to create MenuItem objects
    public MenuItem(
        Long id,
        String name,
        String description,
        double price,
        String category,
        Long establishmentId
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.establishmentId = establishmentId;
        this.available = true;  // By default, item is available
        this.imagePath = null;  // Can be added later
    }

    // Getters - methods to ACCESS attribute values
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Long getEstablishmentId() {
        return establishmentId;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getImagePath() {
        return imagePath;
    }

    // Setters - methods to MODIFY values (only for attributes that can change)
    public void setPrice(double price) {
        if (price >= 0) {  // Validation: price cannot be negative
            this.price = price;
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    // Business method - disables the item
    public void disable() {
        this.available = false;
    }

    // Business method - enables the item
    public void enable() {
        this.available = true;
    }
}