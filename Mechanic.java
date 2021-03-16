package TirgulPackage;

public abstract class Mechanic {
    protected String name;
    protected int experience_of_years;

    public abstract void repair();

    public static void useScrewdriver()   {
        System.out.println(".......Using screwdriver to open this screw");
    }

    public Mechanic(String name, int experience_of_years) {
        this.name = name;
        this.experience_of_years = experience_of_years;
    }
}
