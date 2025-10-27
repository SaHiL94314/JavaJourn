package LLD_principles.Lecture4_LiskovSubstitutePrinciple.better_code;

public class MasterCard extends CreditCard implements InternationalPaymentCards{
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
    public void makeInternationalPayment() {
        System.out.println("intl payment impl of master card");
    }
}
