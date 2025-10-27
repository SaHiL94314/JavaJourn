package LLD_principles.Lecture5_InterfaceSegregationProblem.Problematic_code;

public class Buyer implements User{
    @Override
    public boolean canBuy() {
        return false;
    }

    @Override
    public boolean canModify() {
        return false;
    }

    @Override
    public boolean canSell() {
        return false;
    }

    @Override
    public boolean canApproved() {
        return false;
    }
}
