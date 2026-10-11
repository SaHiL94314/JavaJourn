package LLD_principles.StrategyPattern.better_code;

public class PetrolEngineStrategy implements EngineStrategy{
    @Override
    public String getEngineType() {
        return "petrol engine";
    }

    @Override
    public String getFuel() {
        return "40L";
    }
}
