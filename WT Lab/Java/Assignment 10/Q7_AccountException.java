class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) throws LessBalanceException {
        if (balance - amount < 500) {
            throw new LessBalanceException("Withdraw amount is not valid");
        }
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}

public class Q7_AccountException {
    public static void main(String[] args) {
        Account myAccount = new Account(1000);
        try {
            myAccount.withdraw(700);
            System.out.println("Withdrawal successful");
        } catch (LessBalanceException e) {
            System.out.println("Caught LessBalanceException: " + e.getMessage());
        }
        System.out.println("Current balance: " + myAccount.getBalance());
    }
    
}

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

