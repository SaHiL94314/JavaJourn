package LLD_principles.Lecture4_LiskovSubstitutePrinciple.problematic_code;

public class Visa extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("tap and pay impl of Visa");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer impl of Visa");
    }

    @Override
    public void mandatePayments() {
        System.out.println("mandate payment impl of Visa");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipe and pay impl of Visa");
    }
    @Override
    public void upiPayment(){
        throw new RuntimeException();

    }
}

