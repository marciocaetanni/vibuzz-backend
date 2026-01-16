package model;

public class Establishment extends User {
    private final String businessName;
    private final String cnpj;

    public Establishment(
        Long id,
        String name,
        String email,
        String password,
        String businessName,
        String cnpj
    ) {
        super(id, name, email, password);
        this.businessName = businessName;
        this.cnpj = cnpj;
    }

    public String getbusinessName() {
        return businessName;
    }

    public String getCnpj() {
        return cnpj;
    }
    
}
