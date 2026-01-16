package model;

public class Promoter extends User {
    private final String companyName;

    public Promoter(
        Long id,
        String name,
        String email,
        String password, 
        String companyName
    ) {
        super(id, name, email, password);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
