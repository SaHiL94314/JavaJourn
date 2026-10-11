package LLD_principles.StrategyPattern.bad_code;

public class XUV700 extends Car implements PetrolEngine {
    @Override
    public String getFuel() {
        return "10L";
    }
}
