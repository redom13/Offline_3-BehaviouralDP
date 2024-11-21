import java.util.ArrayList;

abstract class Genre{
    protected String name;
    protected ArrayList<User> users;
    protected ArrayList<String> movies;

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        this.users.remove(user);
    }

    public void notifyUsers(String movie){
        for(User user : this.users){
            Thread notificationThread = new Thread(() -> user.update(movie, this));
            notificationThread.start();
        }
    }

    public void uploadMovie(String movie){
        this.movies.add(movie);
        notifyUsers(movie);
    }

    public abstract String getName();
}