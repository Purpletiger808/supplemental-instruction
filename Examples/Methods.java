import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(">Welcome to the LSU Research Database, new researcher!");
        System.out.println(">Please enter your First Name and Age in years to create your account or, if you are a professor, enter Y: ");
        String userData = in.nextLine();

        if(userData.equalsIgnoreCase("Y")){
            System.out.println(">Please enter the students you would like to register one at a time: ");
            while(in.hasNextLine()){
                userData = in.nextLine();
                if(registerStudent(userData)){ //This if statement contains the METHOD CALL, where we actually tell the
                                              //computer to use the method we wrote. This jumps down to the actual method below
                    System.out.println(">>Student registered successfully. Please enter next student: ");
                }
            }

        }else{
            String name;
            int age;
            int spaceIndex = userData.indexOf(' ');
            name = userData.substring(0, spaceIndex);
            age = Integer.parseInt(userData.substring(spaceIndex+1));

            System.out.println(">>Thank you, user " + name + ", for registering! Your age is confirmed as " + age + ".");
        }

    }

    public static boolean registerStudent(String dataString){
        boolean success = false;

        String name = "";
        int age = 0;
        int spaceIndex = dataString.indexOf(' ');
        name = dataString.substring(0, spaceIndex);
        age = Integer.parseInt(dataString.substring(spaceIndex+1));

        if(age>0 && !name.equalsIgnoreCase("")){
            success = true;
        }

        return success;
    }
}
