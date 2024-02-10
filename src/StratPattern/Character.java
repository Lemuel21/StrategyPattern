package StratPattern;

public class Character {
    private CharacterType type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    public Character(CharacterType type, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }
    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
    }
}

