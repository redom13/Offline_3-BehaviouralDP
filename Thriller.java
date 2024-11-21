import java.util.ArrayList;

public class Thriller extends Genre{
    
    public Thriller(){
        this.name = "Thriller";
        this.users = new ArrayList<User>();
        this.movies = new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }
}
