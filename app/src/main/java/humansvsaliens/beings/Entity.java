package app.src.main.java.humansvsaliens.beings;

public class Entity {
    protected String name;
    protected int baseHP;
    protected int hp;
    protected double weight;

    public Entity(String name, int hp, double weight) {
        this.name = name;
        this.baseHP = hp;
        this.hp = hp;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public double getWeight() {
        return this.weight;
    }

    public int takeDamage(int damage) {
        this.hp = Math.max(0, hp - damage);
        return this.hp;
    }

    public int heal(int amount) {
        this.hp = Math.min(baseHP, hp + amount);
        return this.hp;
    }
}
