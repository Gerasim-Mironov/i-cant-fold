package main;

public class ship extends tool
{
    private int capacity;

    public ship()
    {
        super();
        capacity = 0;
    }
    public ship(String name, String sound, String description, int capacity)
    {
        super(name, sound, description);
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }

    @Override public String toString()
    {
        return super.title() + ". " + super.description();
    }
}
