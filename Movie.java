public class Movie {
    String name;
    String genre;
    Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public String getName(){
        return this.name;
    }

    public String getGenre(){
        return this.genre;
    }
}
