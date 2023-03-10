package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.components.Effect;

public class EffectTest {
    String effectedAttribute;
    int effectedAmount;
    int recurringFrequency;
    int duration;
    Effect nonRecurringEffect;
    Effect recurringEffect;

    @BeforeEach
    void createEffect() {
        effectedAttribute = "hp";
        effectedAmount = 50;
        recurringFrequency = 3;
        duration = 15;

        nonRecurringEffect = new Effect(effectedAttribute, effectedAmount);

        recurringEffect = new Effect(effectedAttribute, effectedAmount, recurringFrequency, duration);
    }

    @Test
    void nonRecurringCase() {
        assertFalse(nonRecurringEffect.isRecurring());
    }

    @Test
    void recurringCase() {
        assertTrue(recurringEffect.isRecurring());
    }

    @Test
    void recurringSpeicificFields() {
        assertNotNull(recurringEffect.getFrequency());
        assertNotNull(recurringEffect.getDuration());
    }


}
