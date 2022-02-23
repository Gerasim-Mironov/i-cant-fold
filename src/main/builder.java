package main;

public class builder extends human
{
    private String experience;

    public builder()
    {
        super();
        experience = "";
    }
    public builder(String name, String gender, String race, int age, String experience)
    {
        super(name, gender, race, age);
        this.experience = experience;
    }

    public void setExperience(String experience)
    {
        this.experience = experience;
    }

    public String getExperience()
    {
        return experience;
    }

    @Override
    public String toString()
    {
        return super.getName() + ", " + super.getGender() + ", " + super.getRace() + ", " + super.getAge() + " лет."
                + " Стаж: " + experience + ".";
    }
}
