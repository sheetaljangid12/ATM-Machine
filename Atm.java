import java.util.*;

class OOPs{
    float balance = 0f;
    int PIN = 5374;
    Scanner sc = new Scanner(System.in);

    //checking for valid pin
    public void checkPin(){
        System.out.print("Enter your pin: ");
        int pin = sc.nextInt();
               
            if(pin == PIN){
                menu();
            }else{
                System.out.println("Invalid pin");
                System.out.println("Please enter the valid pin");
                checkPin();
            }
        }
    

    public void menu(){
        System.out.println("********************");
        System.out.println("1.  Deposit Amount");
        System.out.println("2.  Withdraw Amount");
        System.out.println("3.  Check Balance");
        System.out.println("4.  Exit");
        System.out.println("********************");
        System.out.println();
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1: depositAmount();
            break;
            case 2: withdrwAmount();
            break;
            case 3: checkBalance();
            break;
            case 4: exit();
            break;
            default: System.out.println("Please enter valid choice:");
            // menu();
            
        }
    }
    public void depositAmount(){
        System.out.print("Enter the amount to be deposited: ");
        int enteredAmount = sc.nextInt();
        balance+= enteredAmount;
        System.out.println("Your amount is deposited succesfully!");
        menu();
    }

    public void withdrwAmount(){
        System.out.print("Enter the amount to be withdrawn: ");
        int enteredAmount = sc.nextInt();
        if(balance < enteredAmount){
            System.out.println("Sorry! The transaction failed.");
            System.out.println("Your account does not have sufficient balance to be withdrwn.");
        }else{
            balance-= enteredAmount;
            System.out.println("Your amount is withdrawn succesfully!");
            
        }
        menu();

    }

    public void checkBalance(){
        System.out.println("Your current balance is: " + balance);
        menu();

    }

    public void exit(){
        System.out.println("Thank you for visiting");
        System.out.println("Do you want to exit?");
        System.out.println("Press 1 for exit and 2 for continue:");
        int exitMenu = sc.nextInt();
        switch(exitMenu){
            case 1: System.out.println("Thank you");
            break;
            case 2: menu();
            break;
        } 
    }

}

public class Atm{
    public static void main(String[] args) {
        OOPs op = new OOPs();
        op.checkPin();
    }
}


