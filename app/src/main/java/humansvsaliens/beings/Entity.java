package app.src.main.java.humansvsaliens.beings;

public class Entity {
    protected String name;
    protected int hp;
    protected double weight;

    public Entity(String name, int hp, double weight) {
        this.name = name;
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
}
