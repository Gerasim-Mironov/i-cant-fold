package main;

public class sailor extends human
{
    private String experience;
    private boolean criminalRecord;

    public sailor()
    {
        super();
        experience = "";
        criminalRecord = false;
    }
    public sailor(String name, String gender, String race, int age, String experience, boolean criminalRecord)
    {
        super(name, gender, race, age);
        this.experience = experience;
        this.criminalRecord = criminalRecord;
    }

    public void setExperience(String experience)
    {
        this.experience = experience;
    }

    public String getExperience()
    {
        return experience;
    }
    public boolean getCriminalRecord()
    {
        return criminalRecord;
    }

    @Override
    public String toString()
    {
        String cr = "";
        if(criminalRecord == true)
        {
            cr = "есть.";
        }
        else if(criminalRecord == false)
        {
            cr = "нету.";
        }
        return super.getName() + ", " + super.getGender() + ", " + super.getRace() + ", " + super.getAge() + " лет."
                + " Стаж: " + experience + "." + " Судимость " + cr;
    }
}
