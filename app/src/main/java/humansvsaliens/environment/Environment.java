package app.src.main.java.humansvsaliens.environment;

import app.src.main.java.humansvsaliens.beings.*;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Environment {
    private String name;
    private List<Entity> entitiesPresent;

    public Environment(String name) {
        this.name = name;
        entitiesPresent = new ArrayList<Entity>();
    }

    public void addEntity(Entity e) {
        entitiesPresent.add(e);
    }

    public List<Entity> getEntities() {
        return entitiesPresent;
    }

    public List<Alien> getAliens() {
        return entitiesPresent.stream().filter(e -> e instanceof Alien).map(a -> (Alien) a).collect(Collectors.toList());
    }

    public List<Human> getHumans() {
        return entitiesPresent.stream().filter(e -> e instanceof Human).map(a -> (Human) a).collect(Collectors.toList());
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String str = name + "\n";
        str += "There are currently " + entitiesPresent.size() + " entities present.\n";
        str += "Aliens present: " + getAliens().size() + "\n";
        str += "Humans present: " + getHumans().size() + "\n";
        for (Entity e : entitiesPresent) {
            str += "" + e + "\n";
        }

        return str;
    }
}
