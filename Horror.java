import java.util.ArrayList;

public class Horror extends Genre{
    
    public Horror(){
        this.name = "Horror";
        this.users = new ArrayList<User>();
        this.movies = new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }
}
