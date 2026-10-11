package LLD_principles.StrategyPattern.better_code;

public class BatteryEngineStrategy implements EngineStrategy{
    @Override
    public String getEngineType() {
        return "battery engine";
    }

    @Override
    public String getFuel() {
        return "25%";
    }
}
