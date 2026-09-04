import java.util.Scanner;

public class InputTest {
    public static void main(String[] args){
        System.out.println("input an int value: ");
        Scanner input = new Scanner(System.in);
        int x ;
        x = input.nextInt();
        System.out.println("x = " + x);
        input.close();
    }
}
