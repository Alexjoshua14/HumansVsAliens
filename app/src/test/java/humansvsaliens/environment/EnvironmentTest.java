package app.src.test.java.humansvsaliens.environment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.environment.*;
import app.src.main.java.humansvsaliens.beings.*;
import app.src.main.java.humansvsaliens.components.*;

import java.util.List;
import java.util.ArrayList;

public class EnvironmentTest {
    Environment titan;
    List<Alien> aliens;
    List<Human> humans;
    List<Entity> entities;
    List<Entity> entitiesNotHere;

    @BeforeEach
    void setUpEnvironment() {
        titan = new Environment();

        aliens = new ArrayList<Alien>();
        humans = new ArrayList<Human>();
        entities = new ArrayList<Entity>();
        entitiesNotHere = new ArrayList<Entity>();

        Alien a = new Alien("a", 400, 273);
        a.addPower(new Power("Telekinesis", "Spooky action at a distance"));
        a.addPower(new Power("Mutation", "Ability to take on an alternate form"));

        Alien b = new Alien("a", 250, 273);
        b.addPower(new Power("Telekinesis", "Spooky action at a distance"));

        Alien c = new Alien("a", 500, 273);
        c.addPower(new Power("Mutation", "Ability to take on an alternate form"));

        Alien d = new Alien("a", 190, 273);

        Human jill = new Human("Jill", 200, 132);
        Human stefan = new Human("Stefan", 290, 214);
        Human luis = new Human("Luis", 193, 109);

        entities.add(a);
        entities.add(b);
        entities.add(c);
        entities.add(d);

        aliens.add(a);
        aliens.add(b);
        aliens.add(c);
        aliens.add(d);

        entities.add(jill);
        entities.add(stefan);
        entities.add(luis);

        humans.add(jill);
        humans.add(stefan);
        humans.add(luis);

        Entity unknown = new Entity("Unknown", 99999, 1);
        Alien bob = new Alien("Bob", 730, 174);
        bob.addPower(new Power("Maths", "Exceptionally talented in Maths"));
        entitiesNotHere.add(unknown);
        entitiesNotHere.add(bob);

        for (Entity e : entities) titan.addEntity(e);
    }

    @Test
    void environmentEntities() {
        assertEquals(entities, titan.getEntities());
        assertNotEquals(entitiesNotHere, titan.getEntities());
    }

    @Test
    void environmentAliens() {
        assertEquals(aliens, titan.getAliens());
    }

    @Test
    void environmentHumans() {
        assertEquals(humans, titan.getHumans());
    }
}
