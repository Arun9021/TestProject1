package Java;

import java.io.Serializable;

public class AccountHolderObjects {
    public String fname;
    public String lname;
    public int age;
    public float accountbalance;

    public static void main(String[] args)
    {
        AccountHolderObjects Arun = new AccountHolderObjects();
        AccountHolderObjects Anu = new AccountHolderObjects();
        AccountHolderObjects Diksha = new AccountHolderObjects();
           Arun.fname = "Arun";
           Arun.lname = "Raina";
           Arun.age = 27;
           Arun.accountbalance = 20000;
           Arun.testEligibilityforCreditCard();
           System.out.println("Is Arun eligible for Credit Card :"+Arun.testEligibilityforCreditCard());

    }


}
