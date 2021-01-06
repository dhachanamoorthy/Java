class Movie{
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("playing movie "+title);
    }
}
public class MainMovieObject{
    public static void main(String args[]) {
        //creating objects
        Movie a1=new Movie();
        Movie a2=new Movie();
        //initializing object attributes value
        a1.title="Master";
        a1.genre="Commercial";
        a1.rating=8;
        a2.title="Tamil Padam";
        a2.genre="Comedy";
        a2.rating=6;
        //calling methods
        a1.playIt();
        a2.playIt();
    }
}