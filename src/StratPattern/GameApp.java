package StratPattern;

public class GameApp {
    public static void main(String[] args) {
        // Creating characters with specific attack and defense strategies
        Character knight = new Character(CharacterType.KNIGHT, new SwordAttack(), new ShieldDefense());
        Character wizard = new Character(CharacterType.WIZARD, new SpellAttack(), new MagicDefense());
        Character archer = new Character(CharacterType.ARCHER, new ArrowAttack(), new DodgeDefense());

        // Performing actions and printing results
        knight.attack();
        knight.defend();

        wizard.attack();
        wizard.defend();

        archer.attack();
        archer.defend();
    }
}
