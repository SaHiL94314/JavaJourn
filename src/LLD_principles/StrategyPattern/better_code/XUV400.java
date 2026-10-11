package LLD_principles.StrategyPattern.better_code;

public class XUV400 extends Car implements ElectricEngine  {
    EngineStrategy engine;
    public  XUV400(EngineStrategy strategy){
        this.engine=strategy;
    }
//    public String getInfo(){
//
//        return engine.getFuel();
//    }

    @Override
    public String getFuel() {
        return engine.getFuel();
    }
}
