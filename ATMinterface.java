import java.util.Scanner;
import java.util.*;

class ATMinterfaceK {
    
    double balance=100000;
    int Transaction;
    int Transitions=0;
    String customerName;
    String customerId;
    String TransitionHistory="";
    int flag = 0;


    ATMinterfaceK(String cName, String cId) {
        customerName = cName;
        customerId = cId;

    }

    public final void clrscr() {
        try {
            try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
    } catch (final Exception es) {
        // System.out.println("nothing here!");
    }

    }
    void checkName(){
            System.out.println("");
            System.out.println("");
            System.out.println("                                 *******************************************************");
            System.out.println("");
            System.out.print("                                            ENTER YOUR NAME: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        if (name.equals(customerName)){
            clrscr();
            checkId();
        }
        else{
            System.out.println("");
            System.out.println("");
            System.out.println("                                 *******************************************************");
            System.out.println("");
            System.out.println("                                                    WRONG NAME");
            
            if (flag<3){
                flag++;
                checkName();
            }
        }

    }

    void checkId() {
        System.out.println("                                                ~~~ WELCOME USER ~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("                                 *******************************************************");
        System.out.println("");
        System.out.print("                                             ENTER CUSTOMER ID : ");
        Scanner id = new Scanner(System.in);
        String chk = id.nextLine();
        if (chk.equals(customerId)) {
            clrscr();
            showMenu();
        }
        else {
            System.out.println("");
            System.out.println("");
            System.out.println("                                 *******************************************************");
            System.out.println("");
            System.out.println("                                                        WRONG ID!!");
           

            if (flag < 3) {
                flag++;
                checkId();
            }
        }
    }
    

    

private void showMenu() {
    }




public class ATMinterface {
    static ArrayList<String> ar = new ArrayList<>();
    public static void History(){
        if(ar.size()==0){
           System.out.println("No History Available"); 
        }
        for(int i=ar.size()-1;i>=0;i--){
            System.out.println(ar.get(i));
            System.out.println("----------------------------------------------------------------");
            
        }
        System.out.println("Initial Balance: 5000");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
    }
    public static void main(String[] args) {
        ATMinterfaceK ba = new ATMinterfaceK("Kumkum Kaslikar", "1012");
        ba.checkName();
        ba.checkId();
        int balance = 5000, withdraw, deposit, Transfered;
        int atmpin =1000;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("                                                  Welcome to ATM");
            System.out.println("                                                 ****************");
            System.out.println("");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 1. Withdrawl           |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 2. Deposit             |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 3. Check Balance       |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 4. Trasfer Money       |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 5. Transiction History |");
            System.out.println("                                             --------------------------");
            System.out.println("                                             | 6. Quit                |");
            System.out.println("                                             --------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("                                 *******************************************************");
            System.out.println("");
            System.out.println("                                               : ENTER THE OPTION :");
            System.out.println("");
            System.out.println("                                 *******************************************************");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter ATM Pin: ");
                int pin=s.nextInt();
                if(atmpin == pin){
                    
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                                 *******************************************************");
                    System.out.println("");
                    System.out.println("                                                Enter the amount to withdraw");
                    
                 withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    ar.add("Withdraw: "+withdraw+"  ||  Balance: "+balance);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
            }
            else{
                System.out.println("Incorrect ATM pin");
                System.exit(0);
            }
   
 
                case 2:
                System.out.print("Enter ATM Pin: ");
                int apin=s.nextInt();
                if(atmpin == apin){ 
                    System.out.println("");
            System.out.println("");
            System.out.println("                                 *******************************************************");
            System.out.println("");
            System.out.println("                                                 Enter the amount to deposit");
                
                deposit = s.nextInt();
                balance = balance + deposit;
                ar.add("Deposit: "+deposit+"  ||  Balance: "+balance);
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
                }
                else{
                    System.out.println("Incorrect Atm Number or pin");
                    System.exit(0);
                }
 
                case 3:
                System.out.print("Enter ATM Pin: ");
                int cpin=s.nextInt();
                if(atmpin==cpin){ 
                    System.out.println("-----------------");
                System.out.println("Balance : "+balance);
                System.out.println("-----------------");
                System.out.println("");
                break;
                }
                else{
                    System.out.println("Incorrect Atm Number or pin");
                    System.exit(0);
               }
     
 
                case 4:
                System.out.print("Enter ATM Pin: ");
                int bpin=s.nextInt();
                if(atmpin==bpin){ 
                    System.out.println("");
                    System.out.println("                                                     : Enter Amount to Transfer :");
                    System.out.println("");
                    System.out.println("                                 *******************************************************");
                
                Transfered = s.nextInt();
                if(balance >= Transfered)
                {
                    balance = balance - Transfered;
                    System.out.println("");
                    System.out.println("                                                     : Money Transfered Sucessfully :");
                    System.out.println("");
                    System.out.println("                                 *******************************************************");
                    
                    ar.add("Tranfer: "+Transfered+"  ||  Balance: "+balance);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
            }
            else{
                System.out.println("Incorrect Atm Number or pin");
                System.exit(0);
           }
                case 5:
                System.out.println("---------------------------------------------------------------");
                   System.out.println("Transaction History are : ");
                   History();
                   break;

                case 6:
                System.exit(0);
            }
        }
    }     
}
}        
    

