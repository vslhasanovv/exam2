import java.util.Scanner;

public class Age {
    public void checkAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are underage");
        }
        else if (age <= 65){
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior");
        }


    }

}
