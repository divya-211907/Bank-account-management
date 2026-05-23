class BankController {

    Account[] accounts;

    int count;

    BankController(int size) {

        accounts = new Account[size];

        count = 0;
    }

    void createAccount(
        int accNo,
        String name,
        int pin,
        double balance
    ) {

        accounts[count++] =
            new Account(
                accNo,
                name,
                pin,
                balance
            );
    }

    Account searchAccount(int accNo) {

        for (int i = 0; i < count; i++) {

            if (
                accounts[i].accNo == accNo
            ) {

                return accounts[i];
            }
        }

        return null;
    }

    boolean verifyPin(
        int accNo,
        int pin
    ) {

        Account a =
            searchAccount(accNo);

        if (
            a != null &&
            a.pin == pin
        ) {

            return true;
        }

        return false;
    }

    String deposit(
        int accNo,
        double amount
    ) {

        Account a =
            searchAccount(accNo);

        if (a == null) {

            return "Account Not Found";
        }

        a.balance += amount;

        a.lastTransaction =
            "Deposited ₹" + amount;

        return "Amount Deposited Successfully";
    }

    String withdraw(
        int accNo,
        double amount
    ) {

        Account a =
            searchAccount(accNo);

        if (a == null) {

            return "Account Not Found";
        }

        if (a.balance >= amount) {

            a.balance -= amount;

            a.lastTransaction =
                "Withdrawn ₹" + amount;

            return "Withdrawal Successful";
        }

        return "Insufficient Balance";
    }

    String transferMoney(
        int fromAcc,
        int toAcc,
        double amount
    ) {

        Account sender =
            searchAccount(fromAcc);

        Account receiver =
            searchAccount(toAcc);

        if (
            sender == null ||
            receiver == null
        ) {

            return "Invalid Account";
        }

        if (
            sender.balance >= amount
        ) {

            sender.balance -= amount;

            receiver.balance += amount;

            sender.lastTransaction =
                "Transferred ₹" +
                amount +
                " to " +
                toAcc;

            receiver.lastTransaction =
                "Received ₹" +
                amount +
                " from " +
                fromAcc;

            return "Money Transfer Successful";
        }

        return "Insufficient Balance";
    }

    String deleteAccount(
        int accNo
    ) {

        for (
            int i = 0;
            i < count;
            i++
        ) {

            if (
                accounts[i].accNo ==
                accNo
            ) {

                for (
                    int j = i;
                    j < count - 1;
                    j++
                ) {

                    accounts[j] =
                        accounts[j + 1];
                }

                accounts[count - 1] =
                    null;

                count--;

                return "Account Deleted Successfully";
            }
        }

        return "Account Not Found";
    }
}