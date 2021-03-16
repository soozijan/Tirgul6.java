package TirgulPackage;

public class AirplanesMechanic extends Mechanic {
    protected int rank;

    public AirplanesMechanic(String name, int experience_of_years, int rank) {
        super(name, experience_of_years);
        this.rank = rank;
    }

    @Override
    public void repair()   {
        System.out.println("... repairing airplane");
    }

   public static void checkEngine()   {
       System.out.println(" checking the Engine ");
   }
}
