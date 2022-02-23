package main;

public class tool
{
    private String name;
    private String sound;
    private String desc;

    public tool()
    {
        name = "";
        sound = "";
        desc = "";
    }
    public tool(String name, String sound, String desc)
    {
        this.name = name;
        this.sound = sound;
        this.desc = desc;
    }

    public String title()
    {
        return name;
    }
    public String description()
    {
        return desc;
    }
    public String sound()
    {
        return sound;
    }
}
