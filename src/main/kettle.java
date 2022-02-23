package main;

enum type { acoustic, electric }

public class kettle extends tool
{
    private type kettleType;

    public kettle()
    {
        super();
    }
    public kettle(String name, String sound, String description, type kettleType)
    {
        super(name, sound, description);
        this.kettleType = kettleType;
    }

    public String getType()
    {
        return kettleType.toString();
    }

    @Override public String toString()
    {
        return super.title() + ". " + super.description();
    }
}
