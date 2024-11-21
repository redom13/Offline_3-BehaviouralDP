public class Desiflix {
    public static void main(String[] args) {
        User user1 = new User("NHR");
        User user2 = new User("RJ");
        User user3 = new User("JG");

        Thriller thriller = new Thriller();
        Comedy comedy = new Comedy();
        Horror horror = new Horror();

        user1.addFavouriteGenre(horror);
        user1.addFavouriteGenre(comedy);
        user2.addFavouriteGenre(thriller);
        user3.addFavouriteGenre(comedy);

        thriller.uploadMovie("The Invisible");
        comedy.uploadMovie("The Mask");
        horror.uploadMovie("The Conjuring");

        user1.removeFavouriteGenre(comedy);

        comedy.uploadMovie("The Hangover");
    
    }

}
