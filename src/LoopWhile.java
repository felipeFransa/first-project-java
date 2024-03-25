import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner Reading = new Scanner(System.in);
        String movies;
        double average = 0;
        double noteMovie = 0;
        int totalMarks = 0;


        while (noteMovie != -1) {
            System.out.println("enter your review of the film");
            noteMovie = Reading.nextDouble();

            if (noteMovie != -1) {
                average += noteMovie;
                totalMarks++;
                System.out.println("Total notes movies " +totalMarks);
            }
        }
        System.out.println("Total notes movies " +totalMarks);
        System.out.println("Average " +average/ totalMarks);
    }
}
