public class CarsMechanic extends Mechanic {

    protected String[] car_types_i_can_repair;

    public CarsMechanic(String name, int experience_of_years, String[] car_types_i_can_repair) {
        super(name, experience_of_years);
        this.car_types_i_can_repair = car_types_i_can_repair;
    }

    @Override
    public void repair()   {
        System.out.println("...repairing car");

    }
    public void  replaceWheel()   {
        System.out.println("....replacing the damaged wheel");
    }
}
