package TirgulPackage;

public class StudioApartment extends Apartment{
    protected int number_of_rooms;


    @Override
    public String toString() {
        return "StudioApartment{" +
                "number_of_rooms=" + number_of_rooms +
                super.toString() +
                '}';
    }
}
