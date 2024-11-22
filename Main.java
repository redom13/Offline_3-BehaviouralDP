public class Main {
    public static void main(String[] args) {
        User user1 = new User("NHR");
        User user2 = new User("RJ");
        User user3 = new User("JG");

        DesiflixPlatform desiflix = new DesiflixPlatform();
    
        user1.subscribe(desiflix);
        user2.subscribe(desiflix);
        user3.subscribe(desiflix);

        user1.addFavouriteGenre("Horror");
        user1.addFavouriteGenre("Comedy");
        user2.addFavouriteGenre("Thriller");
        user3.addFavouriteGenre("Comedy");
        user3.addFavouriteGenre("Horror");

        desiflix.displayUsersGenreWise();

        desiflix.uploadMovie("The Call", "Thriller");
        desiflix.uploadMovie("The Hangover", "Comedy");
        desiflix.uploadMovie("The Conjuring", "Horror");

        user1.removeFavouriteGenre("Horror");

        desiflix.displayUsersGenreWise();

        desiflix.uploadMovie("Khanjab", "Horror");
    
    }

}
