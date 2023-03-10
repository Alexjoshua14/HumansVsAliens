package app.src.main.java.humansvsaliens.components;

public class Effect {
    private String effectedAttribute;
    private int effectedAmount;
    private boolean recurring = false;
    private int recurringFrequency;
    private int duration;

    public Effect(String attribute, int amount) {
        this.effectedAttribute = attribute;
        this.effectedAmount = amount;
    }

    public Effect(String attribute, int amount, int recurringFrequency, int duration) {
        this.effectedAttribute = attribute;
        this.effectedAmount = amount;
        this.recurring = true;
        this.recurringFrequency = recurringFrequency;
        this.duration = duration;
    }

    public String getEffectedAttribute() {
        return this.effectedAttribute;
    }

    public int getEffectedAmount() {
        return this.effectedAmount;
    }

    public boolean isRecurring() {
        return this.recurring;
    }

    public int getFrequency() {
        return this.recurringFrequency;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        String str = effectedAttribute + " " + effectedAmount;
        if (recurring)
            str +=  " every " + recurringFrequency + " for " + duration;
        return str;
    }
}
