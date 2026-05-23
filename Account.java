class Account {

    int accNo;
    String name;
    int pin;
    double balance;
    String lastTransaction;

    Account(
        int accNo,
        String name,
        int pin,
        double balance
    ) {

        this.accNo = accNo;
        this.name = name;
        this.pin = pin;
        this.balance = balance;

        lastTransaction =
            "Account Created";
    }
}