package LLD_principles.Lecture4_LiskovSubstitutePrinciple.better_code;

public class Visa extends CreditCard implements InternationalPaymentCards{
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
    public void makeInternationalPayment() {
        System.out.println("intl payment impl of visa");
    }
}

