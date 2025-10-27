package LLD_principles.Lecture4_LiskovSubstitutePrinciple.better_code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UpiPayment> cards=new ArrayList<>();

        for(UpiPayment card:cards){
            //now we don't require any if-else,
            // we only have those cards which support upi payment
        }
    }
}
