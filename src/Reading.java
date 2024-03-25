import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {

        Scanner Reading = new Scanner(System.in);

        System.out.println("enter your favorite movie:");
        String movie = Reading.nextLine();
        System.out.println("What is the year of release?");
        int releaseYear = Reading.nextInt();
        System.out.println("from your note to the film:");
        double noteMovie = Reading.nextDouble();
        // Note Movie, Years
        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(noteMovie);

    }
}
