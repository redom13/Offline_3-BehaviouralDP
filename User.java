import java.util.ArrayList;

public class User {
    private ArrayList<Genre> favouriteGenres;
    private String userName;

    public User(String userName){
        this.userName = userName;
        this.favouriteGenres = new ArrayList<Genre>();
    }

    public void addFavouriteGenre(Genre genre){
        this.favouriteGenres.add(genre);
        genre.addUser(this);
    }

    public void removeFavouriteGenre(Genre genre){
        this.favouriteGenres.remove(genre);
        genre.removeUser(this);
    }

    public void displayFavouriteGenres(){
        System.out.println("Favourite Genres of " + this.userName + ":");
        for(Genre genre : this.favouriteGenres){
            System.out.println("-"+genre.getName());
        }
    }

    public void update(String movie, Genre genre){
        System.out.println("Hey "+this.userName+"! Watch the new Movie: " + movie + "\nGenre: " + genre.getName()+"\n");
    }
}
