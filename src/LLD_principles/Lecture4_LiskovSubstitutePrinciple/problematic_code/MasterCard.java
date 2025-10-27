package LLD_principles.Lecture4_LiskovSubstitutePrinciple.problematic_code;

public class MasterCard extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("tap and pay impl of mastercard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer impl of mastercard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("mandate payment impl of mastercard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipe and pay impl of mastercard");
    }

    @Override
    public void upiPayment(){
        throw new RuntimeException();
    }
}
