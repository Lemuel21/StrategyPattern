package StratPattern;

public class DodgeDefense implements DefenseStrategy{
    @Override
    public void defend() {
        System.out.println("Archer uses dodge to defend!");
    }
}
