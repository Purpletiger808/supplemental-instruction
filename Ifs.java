import java.util.*;

public class Ifs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //These are the correct values for the passwords to our system
        int userPasskey = 81734; 
        int adminPasskey = 12345;
        //These booleans are used to ensure that our authentication is working as intended. Users should only be logged in, while admins should be logged in as both user and admin
        boolean loggedIn = false;
        boolean adminLoggedIn = false;

        System.out.println("Enter 1 or 2 to choose sign in authentication method:"); //Option 1 uses the switch statement, and option 2 uses a ternary operator
        int signInChoice = in.nextInt();

        System.out.println("Please enter your passkey:"); //We collect the user's password here because we can use it in either branch of the if statement
        int passkey = in.nextInt();

        if(signInChoice == 1){ //The initial if statement here uses the operator symbols "==" to compare the value entered by the user for sign in choice to send the user down the correct path, ignoring the code in the unchosen path

           switch(passkey){ //This is the conditional piece of the switch statement, where we declare what value we are actually checking inside the parenthesis. In this case, we are comparing the value of the user's entered passkey
                case 81734: //By declaring "case 81734", we are telling Java to check the entered password against 81734, the stated correct user passkey. If they are the same, we enter into this case, otherwise we move onto the next case
                    System.out.println("Welcome, user! You are now logged in!");
                    loggedIn = true;
                    break; //This break serves to mark the end of this case, as we do not want the switch statement to move on to the next case. Without a break, the switch would continue to check cases until it hits, and runs, the default case
                case 12345: //This case works in the same way as the previous case, but is only ever checked if the first case is false, meaning the passkey entered was not the user passkey
                    System.out.println("Welcome, admin! You are now logged in!");
                    loggedIn = true;
                    adminLoggedIn = true;
                    break;
                default: //This is the default case, if none of the previous cases are successful and a break is not hit, the code in this case will be executed, similar to an "else" statement in an if-else
                    System.out.println("Log in failed: please try again!");
            }

        }else{ 
            loggedIn = (passkey == userPasskey || passkey == adminPasskey)  ? true : false; //This is a ternary operation, functioning similarly to an if-else on a singular line. The "?" character is preceeded by the condition being checked. If the condition is true, the value between the "?" and the ":" is set, otherwise the value after is set
            adminLoggedIn = adminPasskey == passkey ? true : false; //Just as above, we are assigning the value obtained after the execution of our ternary operation into the variable before the "=", in this case adminLoggedIn
        }

        System.out.println("Is the user logged in: " + loggedIn); //If everything is successful, then the user entering a user password will be logged in and a message will be displayed
        System.out.println("Is the admin logged in: " + adminLoggedIn); //If the user is an administrator, an additional message will be displayed notifying them they are logged in as an admin as well

    }
}
