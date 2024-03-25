import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner Reading = new Scanner(System.in);
        String movies;
        double average = 0;
        double noteMovie = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("enter your review of the film");
            noteMovie = Reading.nextDouble();
            average += noteMovie;
            System.out.println(noteMovie);
            System.out.println(average);
        }
        System.out.println("Average " +average/3);
    }
}
