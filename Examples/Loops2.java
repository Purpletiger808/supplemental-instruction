import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Please enter the sepsis number you would like to calculate the square root of: ");
        int numMax = in.nextInt();


        for(int i = 0; i < numMax; i++){
            if(i*i == numMax){
                System.out.println(i + " is the square root of " + numMax);
            }
        }

        boolean isDone = false;

        while(!isDone){
            System.out.println("Would you like to exit the program (y/n): ");
            String done = in.nextLine();
            if(done.equalsIgnoreCase("Y")){
                isDone = true;
            }else{
                System.out.println("Please enter the number you would like to calculate the square root of: ");
                numMax = in.nextInt();

                for(int i = 0; i < numMax; i++){
                    if(i*i == numMax){
                        System.out.println(i + " is the square root of " + numMax);
                    }
                }
            }
        }
    }
}
