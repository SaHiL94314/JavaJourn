package LLD_principles.StrategyPattern.bad_code;

public class XUV400 extends Car implements ElectricEngine {
    @Override
    public String getFuel() {
        return "30%";
    }
}
