package LLD_principles.Lecture4_LiskovSubstitutePrinciple.better_code;

public class Rupay extends CreditCard implements UpiPayment{
    @Override
    public void tapAndPay() {
        System.out.println("tap and pay impl of Rupay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer impl of Rupay");
    }

    @Override
    public void mandatePayments() {
        System.out.println("mandate payment impl of Rupay");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipe and pay impl of Rupay");
    }

    @Override
    public void upiPayment(){
        System.out.println("upi payment impl of rupay");
    }

    @Override
    public void makeUpiPayment() {
        System.out.println("upi payment impl of rupay");
    }
}

