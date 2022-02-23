package main;

public class car extends tool
{
    private float engineVolume;

    public car()
    {
        super();
        engineVolume = 0f;
    }
    public car(String name, String sound, String description, float engineVolume)
    {
        super(name, sound, description);
        this.engineVolume = engineVolume;
    }

    public float getEngineVolume()
    {
        return engineVolume;
    }

    @Override public String toString()
    {
        return super.title() + ". " + super.description();
    }
}
