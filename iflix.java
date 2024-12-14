public interface iflix {
    public void registerUser(User user);
    public void removeUser(User user);
    public void addFavouriteGenre(User user,String genre);
    public void removeFavouriteGenre(User user,String genre);
    public void notifyUsers(Movie movie);
    public void uploadMovie(String name,String genre);
    public void displayUsersGenreWise();
}
