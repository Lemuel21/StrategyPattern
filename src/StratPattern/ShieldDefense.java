package StratPattern;

public class ShieldDefense implements DefenseStrategy{
    @Override
    public void defend() {
        System.out.println("Knight uses a shield to defend!");
    }
}
