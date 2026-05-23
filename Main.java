public class Main {

    public static void main(
        String[] args
    ) {

        BankController controller =
            new BankController(20);

        BankView view =
            new BankView();

        controller.createAccount(
            101,
            "Divya",
            1234,
            5000
        );

        while (true) {

            view.showMenu();

            int choice =
                view.getInt(
                    "Enter Choice: "
                );

            switch (choice) {

                case 1:

                    int accNo =
                        view.getInt(
                            "Enter Account Number: "
                        );

                    String name =
                        view.getString(
                            "Enter Name: "
                        );

                    int pin =
                        view.getInt(
                            "Set 4 Digit PIN: "
                        );

                    double balance =
                        view.getDouble(
                            "Enter Initial Balance: "
                        );

                    controller.createAccount(
                        accNo,
                        name,
                        pin,
                        balance
                    );

                    view.showMessage(
                        " Account Created Successfully"
                    );

                    break;

                case 2:

                    int depAcc =
                        view.getInt(
                            "Enter Account Number: "
                        );

                    double depAmt =
                        view.getDouble(
                            "Enter Amount: "
                        );

                    view.showMessage(
                        controller.deposit(
                            depAcc,
                            depAmt
                        )
                    );

                    break;

                case 3:

                    int withAcc =
                        view.getInt(
                            "Enter Account Number: "
                        );

                    double withAmt =
                        view.getDouble(
                            "Enter Amount: "
                        );

                    view.showMessage(
                        controller.withdraw(
                            withAcc,
                            withAmt
                        )
                    );

                    break;

                case 4:

                    int sender =
                        view.getInt(
                            "Enter Sender Account: "
                        );

                    int receiver =
                        view.getInt(
                            "Enter Receiver Account: "
                        );

                    double amount =
                        view.getDouble(
                            "Enter Amount: "
                        );

                    view.showMessage(
                        controller.transferMoney(
                            sender,
                            receiver,
                            amount
                        )
                    );

                    break;

                case 5:

                    int search =
                        view.getInt(
                            "Enter Account Number: "
                        );

                    Account a =
                        controller.searchAccount(
                            search
                        );

                    if (a != null) {

                        System.out.println(
                        "\n===== ACCOUNT DETAILS =====");

                        System.out.println(
                        "Account No : " +
                        a.accNo);

                        System.out.println(
                        "Name       : " +
                        a.name);

                        System.out.println(
                        "Balance    : ₹" +
                        a.balance);
                    }
                    else {

                        view.showMessage(
                        " Account Not Found");
                    }

                    break;

                case 6:

                    int mini =
                        view.getInt(
                            "Enter Account Number: "
                        );

                    Account m =
                        controller.searchAccount(
                            mini
                        );

                    if (m != null) {

                        System.out.println(
                        "\n===== MINI STATEMENT =====");

                        System.out.println(
                        "Name : " +
                        m.name);

                        System.out.println(
                        "Balance : ₹" +
                        m.balance);

                        System.out.println(
                        "Last Transaction : " +
                        m.lastTransaction);
                    }
                    else {

                        view.showMessage(
                        "Account Not Found");
                    }

                    break;

                case 7:

                    int del =
                        view.getInt(
                            "Enter Account Number: "
                        );

                    view.showMessage(
                        controller.deleteAccount(
                            del
                        )
                    );

                    break;

                case 8:

                    System.out.println(
                    "Thank You For Using Smart Bank");

                    return;

                default:

                    System.out.println(
                    " Invalid Choice");
            }
        }
    }
}