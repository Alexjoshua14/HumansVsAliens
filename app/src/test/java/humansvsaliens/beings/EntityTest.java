package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.beings.Entity;

public class EntityTest {
    String name;
    int hp;
    double weight;
    Entity entity;

    @BeforeEach
    void createEntity() {
        name = "Jill";
        hp = 500;
        weight = 100;
        entity = new Entity(name, hp, weight);
    }

    @Test 
    void entityHasName() {
        assertEquals(name, entity.getName());
    }

    @Test 
    void entityHasHP() {
        assertEquals(hp, entity.getHP());
    }

    @Test
    void hasWeight() {
        assertEquals(weight, entity.getWeight());
    }

    @Test
    void canTakeDamage() {
        entity.takeDamage(142);
        assertEquals(hp - 142, entity.getHP());
    }
}
