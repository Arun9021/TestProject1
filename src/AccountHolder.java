public class AccountHolder {
    String fname;
    String lname;
    int age;
    float accountbalance;
    boolean eligibleforCreditCard;

    public void testEligibilityforCreditCard() {
        if (age > 25 && accountbalance >= 10000) {
            eligibleforCreditCard = true;
        } else {
            eligibleforCreditCard = false;
        }


    }
}
