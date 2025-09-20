enum season
{
    Winter("cold"), Summer("hot"), Rainy("wet");

    private String descrption;

    season(String desc)
    {
        this.descrption = desc;
    }

    public String getDescrption()
    {
        return descrption;
    }
}

public class Enum_Meth{
    public static void main(String[] args) {
        for(season s : season.values())
        {
            System.out.println(s + " : " + s.getDescrption());
        }
    }
}