package main;

public class pilot extends human
{
    private String experience;
    private boolean mentalProblems;

    public pilot()
    {
        super();
        experience = "";
        mentalProblems = false;
    }
    public pilot(String name, String gender, String race, int age, String experience, boolean criminalRecord)
    {
        super(name, gender, race, age);
        this.experience = experience;
        this.mentalProblems = criminalRecord;
    }

    public void setExperience(String experience)
    {
        this.experience = experience;
    }

    public String getExperience()
    {
        return experience;
    }
    public boolean isPsychotic()
    {
        return mentalProblems;
    }

    @Override
    public String toString()
    {
        String cr = "";
        if(mentalProblems == true)
        {
            cr = "присутсвуют.";
        }
        else if(mentalProblems == false)
        {
            cr = "отсутствуют.";
        }
        return super.getName() + ", " + super.getGender() + ", " + super.getRace() + ", " + super.getAge() + " лет."
                + " Стаж: " + experience + "." + " Психические проблемы " + cr;
    }
}
