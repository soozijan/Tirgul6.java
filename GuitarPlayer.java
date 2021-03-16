package TirgulPackage;

public class GuitarPlayer extends Player{

    @Override
    public void play() {
        System.out.println("Playing Hotel California");
    }

    @Override
    public void compose() {
        System.out.println("composing guitar melody");
    }

    public void rockAndRoll()   {
        System.out.println("let the show begin");
    }
}
