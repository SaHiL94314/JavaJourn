package LLD_principles.Lecture4_LiskovSubstitutePrinciple.problematic_code;

public abstract class CreditCard {
    private String cardnumber;
    private String cardownerName;
    private int cvv;

    public void setCardnumber(String cardnumber){
        this.cardnumber=cardnumber;
    }
    public void setCardownerName(String cardownerName){
        this.cardownerName=cardownerName;
    }
    public void setCvv(int cvv){
        this.cvv=cvv;
    }
    public abstract void tapAndPay();
    public abstract void onlineTransfer();
    public abstract void mandatePayments();
    public abstract void swipeAndPay();
    public abstract void upiPayment();
}
