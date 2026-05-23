import java.util.Scanner;

class BankView {

    Scanner sc =
        new Scanner(System.in);

    void showMenu() {

        System.out.println(
        "\n==================================");

        System.out.println(
        "SMART BANK SYSTEM");

        System.out.println(
        "==================================");

        System.out.println(
        "1. Create Account");

        System.out.println(
        "2. Deposit Money");

        System.out.println(
        "3. Withdraw Money");

        System.out.println(
        "4. Transfer Money");

        System.out.println(
        "5. Search Account");

        System.out.println(
        "6. Mini Statement");

        System.out.println(
        "7. Delete Account");

        System.out.println(
        "8. Exit");

        System.out.println(
        "==================================");
    }

    int getInt(String msg) {

        System.out.print(msg);

        return sc.nextInt();
    }

    double getDouble(String msg) {

        System.out.print(msg);

        return sc.nextDouble();
    }

    String getString(String msg) {

        sc.nextLine();

        System.out.print(msg);

        return sc.nextLine();
    }

    void showMessage(String msg) {

        System.out.println(msg);
    }
}