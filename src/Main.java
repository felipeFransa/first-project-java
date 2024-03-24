//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("This is the Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int yearMovie;
        yearMovie = 2020;

        System.out.println("Release year" + yearMovie);
        boolean packageIncluded = false;
        double noteMovieA = 8.1;
        double noteMovieB = 6.3;
        double noteMovieC = 8.0;
        double average = (noteMovieA + noteMovieB + noteMovieC)/ 3;
        int classification = (int) (average / 2);
        System.out.println(classification);

        String synopsis;
        synopsis = "80s heartthrob movie";
        System.out.println(synopsis);

        boolean movieAccess;
        movieAccess = packageIncluded;

        if (movieAccess == true){
            System.out.println("access granted!");
        }else {
            System.out.println("access denied!");
        }
    }
}
