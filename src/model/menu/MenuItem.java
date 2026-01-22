package model.menu;

public class MenuItem {
    
    // Atributos da classe
    private final Long id;
    private final String name;
    private final String description;
    private double price;
    private final String category;
    private final Long establishmentId;  // ID do estabelecimento dono deste item
    private boolean available;
    private String imagePath;

    // Construtor - método especial para criar objetos MenuItem
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
        this.available = true;  // Por padrão, o item está disponível
        this.imagePath = null;  // Pode ser adicionado depois
    }

    // Getters - métodos para ACESSAR os valores dos atributos
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

    // Setters - métodos para MODIFICAR valores (apenas para atributos que podem mudar)
    public void setPrice(double price) {
        if (price >= 0) {  // Validação: preço não pode ser negativo
            this.price = price;
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    // Método de negócio - desabilita o item
    public void disable() {
        this.available = false;
    }

    // Método de negócio - habilita o item
    public void enable() {
        this.available = true;
    }
}
