import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        Scanner Reading = new Scanner(System.in);

        String firstName = "Felipe";
        int age = 27;
        double Balance = 3.200;
        String typeAccount = "Corrente";

        String password = "a8f3s3f3";
        boolean passwordAccess = false;

        int bankAccountNumber = 5071;
        boolean bankAccountAccess = false;

        boolean accessOrBank = false;

        System.out.println("enter your account:");
        int verificationBankAccountNumber = Reading.nextInt();
        if (bankAccountNumber == verificationBankAccountNumber) {
            System.out.println("Account Validate");
            bankAccountAccess = true;
        }else {
            System.out.println("Account invalidate");
        }
        System.out.println("enter your password");
        String nowPassword = Reading.nextLine();
        System.out.println(nowPassword);



        if (bankAccountAccess){
            System.out.println("Welcome " +firstName);
        }
    }
}
