package jun;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int basePay = input.nextInt();
        int working_hours = input.nextInt();
        int pay = basePay * working_hours;

        System.out.println("pay = " + pay);
    }
}
