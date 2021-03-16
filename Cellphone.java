package TirgulPackage;

public class Cellphone extends ElectricDevice {
    protected String m_brand;

    public Cellphone(float m_voltage, boolean m_worksOnBatteries, String brand) {
        super(m_voltage, true);
        this.m_brand = m_brand;
    }


    public void useDevice()   {
        System.out.println("talking on the phone");

    }

    public void fixDevice()   {
        if (m_isFaulty == true)   {
            System.out.println("...fixing cellphone");
        }
    }
}
