import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // practise 1
        Age age = new Age();
        age.checkAge();

        // practise 2

        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.processArray();

        // practise 3


        TextCleaner cleaner = new TextCleaner();
        String result = cleaner.cleanText("   HELlo   123  woRLd   ");
        System.out.println("Cleaned text: " + result);


        // practise 4

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();

        // practise 5

        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(900);
        acc.withdraw(500);
        System.out.println("Account balance is: " + acc.getBalance());


    }
}
