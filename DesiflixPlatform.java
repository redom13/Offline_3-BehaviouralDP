import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DesiflixPlatform implements iflix{
    ArrayList<User> allUsers;
    ArrayList<Movie> movies;
    Map<String, ArrayList<User>> genreWiseUsers;
    
    public DesiflixPlatform(){
        this.allUsers = new ArrayList<User>();
        this.movies = new ArrayList<Movie>();
        this.genreWiseUsers = new HashMap<String, ArrayList<User>>();
    }

    public void registerUser(User user){
        this.allUsers.add(user);
    }

    public void removeUser(User user){
        this.allUsers.remove(user);

        for (var users: genreWiseUsers.values()){
            users.remove(user);
        }
    }

    public void addFavouriteGenre(User user,String genre){
        if (allUsers.contains(user)){
            if (genreWiseUsers.containsKey(genre)){
                genreWiseUsers.get(genre).add(user);
            }
            else{
                ArrayList<User> users = new ArrayList<User>();
                users.add(user);
                genreWiseUsers.put(genre,users);
            }
        }
        else {
            System.out.println("Please Subscribe first");
        }
    }

    public void removeFavouriteGenre(User user,String genre){
        if (allUsers.contains(user)){
            genreWiseUsers.get(genre).remove(user);
        }
    }

    public void notifyUsers(Movie movie){
        for (var users: genreWiseUsers.get(movie.getGenre())){
            Thread notificationThread = new Thread(() -> users.update(movie));
            notificationThread.start();
        }
    }

    public void uploadMovie(String name,String genre){
        Movie movie = new Movie(name,genre);
        this.movies.add(movie);
        notifyUsers(movie);
    }

    public void displayUsersGenreWise(){
        System.out.println("-----------------------------------------");
        for (var entry: genreWiseUsers.entrySet()){
            System.out.println("Genre: "+entry.getKey());
            for (var user: entry.getValue()){
                System.out.println("-"+user.getUserName());
            }
        }
        System.out.println("-----------------------------------------");
    }
}