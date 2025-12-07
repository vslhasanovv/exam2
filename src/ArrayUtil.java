import java.util.Scanner;

public class ArrayUtil {

    public void processArray() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers: ");

        for (int i =0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for(int x : arr){
            if(x>max){ max = x;}
            if(x<min){ min = x;}
            sum += x;
        }
        double avg = sum/arr.length;

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println("The average number is: " + avg);
    }
}
