package TirgulPackage;

public class Tv extends ElectricDevice {
    protected float m_screen_size;

    public Tv(float m_voltage, float m_screen_size) {
        super(m_voltage, false);
        this.m_screen_size = m_screen_size;
    }

    @Override
    public void useDevice()    {
        System.out.println("....watching tv");

    }

    @Override
    public void fixDevice()   {
        if (m_isFaulty == true)   {
            System.out.println("...fixing tv");
            m_isFaulty = false;
        }
        else{
            System.out.println("this tv is working properly");
        }
    }


}
