package TirgulPackage;

import lombok.ToString;

@ToString
public class Teacher {
   protected String name;
    protected int id_number;

    public Teacher(String name, int id_number) {
        this.name = name;
        this.id_number = id_number;
    }
}
