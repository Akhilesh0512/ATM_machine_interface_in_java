package ATMmachineinterface;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class optionmenu extends account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data = new HashMap<Integer, Integer>();
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try{
                data.put(952141,191904);
                data.put(989947,71976);
                System.out.println("welcome to the atm project");
                System.out.println("Enter your customer number");
                setcustomernumber(menuInput.nextInt());
                System.out.println("Enter your pin number:");
                setpinnumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n"+"Invalid character(s) . only numbers."+"\n");
                x=2;
            }
            int cn =getCustomernumber();
            int pn =getPinnumber();
            if(data.containsKey(cn)&& data.get(cn)==pn) {
                getaccounttype();
            } else
                System.out.println("\n" + "wrong customer number or pin number" + "\n");
        }while (x==1);
    }
    public void getaccounttype() {
        System.out.println("select the account you want to access");
        System.out.println("type 1 - checking account");
        System.out.println("type 2 - savings account");
        System.out.println("type 3 - exit");

        int selection = menuInput.nextInt();
        switch (selection)
        {
            case 1:
                getchecking();
                break;

            case 2:
                getsaving();
                break;

            case 3:
                System.out.println("thank you for using this ATM.have a nice day ,bye" + "\n");
                break;

            default:
                System.out.println("\n" + "invalid choice" + "\n");
        }
    }
    public double getchecking() {
        System.out.println("checking account:");
        System.out.println("type 1 - view balance");
        System.out.println("type 2 - withdraw funds");
        System.out.println("type 3 - deposit funds");
        System.out.println("type 4 - exit");
        System.out.println("choice :");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("checking account balance: "+moneyFormat.format(getchecking()));
                getaccounttype();
                break;
            case 2:
                getcheckingwithdrawInput();
                getaccounttype();
                break;
            case 3:
                getcheckingdepositinput();
                getaccounttype();
                break;
            case 4:
                System.out.println("thank you for using this ATM.have a nice day ,bye" + "\n");
                break;
            default:
                System.out.println("\n" + "invalid choice" + "\n");

        }
        return 0;
    }
    public double getsaving() {
        System.out.println("checking account:");
        System.out.println("type 1 - view balance");
        System.out.println("type 2 - withdraw funds");
        System.out.println("type 3 - deposit funds");
        System.out.println("type 4 - exit");
        System.out.println("choice :");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("saving account balance: "+moneyFormat.format(getsaving()));
                getaccounttype();
                break;
            case 2:
                getsavingwithdrawinput();
                getaccounttype();
                break;
            case 3:
                getsavingdepositinput();
                getaccounttype();
                break;
            case 4:
                System.out.println("thank you for using this ATM.have a nice day ,bye" + "\n");
                break;
            default:
                System.out.println("\n" + "invalid choice" + "\n");

        }
        return 0;
    }
}
