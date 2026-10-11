package LLD_principles.StrategyPattern.better_code;

public class XUV700 extends Car implements PetrolEngine {

    EngineStrategy engine;
    public  XUV700(EngineStrategy strategy){
        this.engine=strategy;
    }

//    public String getInfo(){
//        return engine.getFuel();
//    }

    @Override
    public String getFuel() {
        return engine.getFuel();
    }
}
