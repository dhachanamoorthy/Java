class Movie{
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println("playing movie "+title);
    }
    //creating method with argument
    void setRating(int rate){
        rating=rate;
    }

    //creating method with return value

    String getMovieTitle(){
        return title;
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
        a2.title="Tamil Padam";
        a2.genre="Comedy";

        //passing argument to the function 
        a1.setRating(8);
        a2.setRating(6);


        //calling methods
        a1.playIt();
        a2.playIt();

        //printing returned value from method
        System.out.println(a1.getMovieTitle());
    }
}