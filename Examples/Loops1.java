import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int targetNum;
        int startingNum;

        int mult;
        int multResult = 0;
        int exp = 0;
        int expResult = 0;

        System.out.println("Give target number: ");
        targetNum = in.nextInt();
        System.out.println("Give starting number: ");
        startingNum = in.nextInt();


        for(mult = 1; multResult < targetNum /*condition segment*/; mult++ /*step*/){
            multResult = mult * startingNum; //code
        }
        //end of loop
        System.out.println(startingNum + "*" + mult + ">=" + targetNum);

        while(/*the condition*/ expResult < targetNum){
            expResult = (int)Math.pow(startingNum, exp++);
        }
    }
}
