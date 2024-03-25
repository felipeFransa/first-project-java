public class Conditional {

    public static void main(String[] args) {

        int releaseYearMovie;
        releaseYearMovie = 1990;
        boolean packageIncluded = false;
        double noteMovieA = 8.1;
        double noteMovieB = 6.3;
        double noteMovieC = 8.0;
        String typeMovie = "normal";

        if( releaseYearMovie >= 2022 ){
            System.out.println("Movie launch");
        }else{
            System.out.println("Movie retro");
        }

        if (packageIncluded == true || typeMovie.equals("plus") ){
            System.out.println("Movie Included!");
        } else {
            System.out.println("Movie not incluede on Plus");
        }
    }
}
