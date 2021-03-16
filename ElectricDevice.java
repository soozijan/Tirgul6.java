package TirgulPackage;

import lombok.ToString;

@ToString
public abstract class ElectricDevice {
    protected float m_voltage;
    protected boolean m_worksOnBatteries;
    protected boolean m_isFaulty;

    public ElectricDevice(float m_voltage, boolean m_worksOnBatteries) {
        this.m_voltage = m_voltage;
        this.m_worksOnBatteries = m_worksOnBatteries;
        this.m_isFaulty = false;
    }

    public static void turnOn() {
        System.out.println(" Turning device on");
    }

    public final void insertNewBatteries() {
        if (m_worksOnBatteries == true) {
            System.out.println("Inserting new batteries to the device");
        } else {
            System.out.println("!This device doesn’t use batteries");
        }

    }



    public abstract void useDevice();


        public abstract void fixDevice();
    }


