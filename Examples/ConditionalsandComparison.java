import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number please:");
        int myInt = in.nextInt();

        int num1 = 12;
        double num2 = 7.285761826387643;
        boolean conditional = true;

        if(conditional){
            num1 =60;
        }

        if(myInt > num1){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
        System.out.println(myInt);
    }
}
