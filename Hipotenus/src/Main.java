import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value1, value2;
        double value3;

        System.out.print("value1 giriniz:");
        value1 = input.nextInt();

        System.out.print("value2 giriniz:");
        value2 = input.nextInt();

        value3 = Math.sqrt( (value1*value1) + (value2*value2));
        System.out.println("hipotenus:" + value3);


    }
}