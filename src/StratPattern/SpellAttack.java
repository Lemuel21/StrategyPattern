package StratPattern;

public class SpellAttack implements AttackStrategy{

    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}
