package main;

public class microwave extends tool
{
    private int power;

    public microwave()
    {
        super();
        power = 0;
    }
    public microwave(String name, String sound, String description, int power)
    {
        super(name, sound, description);
        this.power = power;
    }

    public int getPower()
    {
        return power;
    }

    @Override public String toString()
    {
        return super.title() + ". " + super.description();
    }
}
