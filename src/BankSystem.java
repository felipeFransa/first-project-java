import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        Scanner Reading = new Scanner(System.in);

        String firstName = "Felipe";
        int age = 27;
        String password = "a8f3s3f3";
        boolean passwordAccess = false;
        boolean accessOrBank = false;

        int bankAccountNumber = 5071;
        boolean bankAccountNumberAccess = false;

        double Balance = 3.200;
        String typeAccount = "Corrente";

        System.out.println("Type your password:");
        String verificationPassword = Reading.nextLine();
        if (password.equals(verificationPassword)) {
            passwordAccess = true;
            System.out.println("enter your account:");
            int verificationBankAccountNumber = Reading.nextInt();
            if (passwordAccess || bankAccountNumber == verificationBankAccountNumber) {
                bankAccountNumberAccess = true;
                accessOrBank = true;
            }
        }
        if (accessOrBank == true){
            System.out.println("Access or bank On!");
        }
    }
}
