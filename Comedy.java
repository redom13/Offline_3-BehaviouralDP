import java.util.ArrayList;

public class Comedy extends Genre{
    
    public Comedy(){
        this.name = "Comedy";
        this.users = new ArrayList<User>();
        this.movies = new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }
}
