package ATMmachineinterface;

import java.text.DecimalFormat;
import java.util.Scanner;

public class account {
    private int customernumber;
    private int pinnumber;
    private double checkingbalance = 0;
    private double savingbalance = 0;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");

    public int setcustomernumber(int customernumber) {
        this.customernumber = customernumber;
        return customernumber;
    }

    public int getCustomernumber() {
        return customernumber;
    }

    public int setpinnumber(int pinnumber) {
        this.pinnumber = pinnumber;
        return pinnumber;
    }

    public int getPinnumber() {
        return pinnumber;
    }

    public double getCheckingbalance() {
        return checkingbalance;
    }

    public void setSavingbalance(double savingbalance) {
        this.savingbalance = savingbalance;
    }

    public double calccheckingwithdraw(double amount) {
        checkingbalance = (checkingbalance - amount);
        return checkingbalance;
    }

    public double calcsavingwithdraw(double amount) {
        savingbalance = (checkingbalance + amount);
        return savingbalance;
    }

    public double calccheckingdeposit(double amount) {
        checkingbalance = (checkingbalance + amount);
        return checkingbalance;
    }

    public double calcsavingdeposit(double amount) {
        savingbalance = (savingbalance + amount);
        return savingbalance;
    }

    public void getcheckingwithdrawInput() {
        System.out.println("checking account balance:" + moneyformat.format(checkingbalance));
        System.out.println("amount you want to withdraw from checking amount");
        double amount = input.nextDouble();

        if ((checkingbalance - amount) >= 0) {
            calccheckingwithdraw(amount);
            System.out.println("new checking account balance: " + moneyformat.format(checkingbalance));
        } else {
            System.out.println("balance cannot be negative." + "\n");
        }
    }

    public void getsavingwithdrawinput() {
        System.out.println("saving account balance:" + moneyformat.format(savingbalance));
        System.out.println("amount you want to withdraw from saving account:");
        double amount = input.nextDouble();

        if ((savingbalance - amount) >= 0) {
            calcsavingwithdraw(amount);
            System.out.println("new saving accountbalance: " + moneyformat.format(savingbalance));
        } else {
            System.out.println("baalnce cannot be negative" + "\n");
        }
    }

    public void getcheckingdepositinput(){
        System.out.println("checking account balance:" + moneyformat.format(checkingbalance));
        System.out.println("amount you want to withdraw from checking account:");
        double amount = input.nextDouble();

        if ((checkingbalance + amount) >= 0) {
            calccheckingdeposit(amount);
            System.out.println("new checking accountbalance: " + moneyformat.format(checkingbalance));
        } else {
            System.out.println("balance cannot be negative" + "\n");
        }
    }

    public void getsavingdepositinput() {
        System.out.println("saving account balance:" + moneyformat.format(savingbalance));
        System.out.println("amount you want deposit from saving account:");
        double amount = input.nextDouble();

        if ((savingbalance + amount) >= 0) {
            calcsavingdeposit(amount);
            System.out.println("new saving account balance: " + moneyformat.format(savingbalance));
        } else {
            System.out.println("baalnce cannot be negative" + "\n");
        }
    }
}
