package LLD_principles.Lecture4_LiskovSubstitutePrinciple.problematic_code;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> cards=new ArrayList<>();

        for(CreditCard card:cards){
            if(card instanceof Rupay){

            }
        }
    }
}
