import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);


        System.out.println("Please enter the dimensions of the triangle you'd like to create: ");
        int triSize = in.nextInt();

        boolean notDone = true;

        if(triSize == 1){
            System.out.println("\t*");
        }else if(triSize == 2){
            System.out.println("\t*");
            System.out.println("\t*\t*");
        }else if(triSize == 3){
            System.out.println("\t*");
            System.out.println("\t*\t*");
            System.out.println("\t*\t*\t*");
        }else{
            System.out.println("And so on...");
        }

    }
}
