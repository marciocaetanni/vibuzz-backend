package model.user;

public class Artist extends User {
    private final String artisticName;
    private final String genre;

    public Artist(
        Long id,
        String name,
        String email,
        String password,
        String artisticName,
        String genre
    ) {
        super(id, name, email, password); 
        this.artisticName = artisticName;
        this.genre = genre;
    }

    public String getArtisticName() {
        return artisticName;
    }

    public String getGenre() {
        return genre;
    }
}
