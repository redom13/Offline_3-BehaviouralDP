import java.util.ArrayList;

public class User {
    private DesiflixPlatform desiflix;
    private ArrayList<String> favouriteGenres;
    private String userName;

    public User(String userName){
        this.userName = userName;
        this.favouriteGenres = new ArrayList<String>();
    }

    public void subscribe(DesiflixPlatform desiflix){
        this.desiflix = desiflix;
        desiflix.registerUser(this);
    }

    public void addFavouriteGenre(String genre){
        this.favouriteGenres.add(genre);
        desiflix.addFavouriteGenre(this, genre);
    }

    public void removeFavouriteGenre(String genre){
        this.favouriteGenres.remove(genre);
        desiflix.removeFavouriteGenre(this, genre);
    }

    public void displayFavouriteGenres(){
        System.out.println("Favourite Genres of " + this.userName + ":");
        for(String genre : this.favouriteGenres){
            System.out.println("-"+genre);
        }
    }

    public void update(Movie movie){
        System.out.println("Hey "+this.userName+"!\nWatch the new Movie: " + movie.getName() + "\nGenre: " + movie.getGenre()+"\n");
    }

    public String getUserName(){
        return this.userName;
    }
}
