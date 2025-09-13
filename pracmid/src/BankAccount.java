// Encapsulation Example
class BankAccount {
    private double balance; // private variable

    public BankAccount(double initialBalance) {
        balance = initialBalance; // constructor to initialize balance
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // public method to access private variable
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // public method to access private variable
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance; // public method to access private variable
    }
}

// Polymorphism Example without Inheritance
class Animal {
    public void sound(String animalType) {
        switch (animalType.toLowerCase()) {
            case "dog":
                System.out.println("Dog barks");
                break;
            case "cat":
                System.out.println("Cat meows");
                break;
            default:
                System.out.println("Animal makes a sound");
        }
    }
}

// Static Block Example
class StaticExample {
    static int value;

    static {
        value = 10; // static block to initialize static variable
        System.out.println("Static block executed: value initialized to " + value);
    }
}

// Main Class to demonstrate all concepts
class OOPExample {
    public static void main(String[] args) {
        // Demonstrating Encapsulation
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Demonstrating Polymorphism without Inheritance
        Animal animal = new Animal();
        animal.sound("dog"); // Outputs: Dog barks
        animal.sound("cat"); // Outputs: Cat meows
        animal.sound("lion"); // Outputs: Animal makes a sound

        // Demonstrating Static Block
        System.out.println("Static value from StaticExample: " + StaticExample.value);
    }
}