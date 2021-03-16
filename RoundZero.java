package TirgulPackage;

public class RoundZero {
    public static int roundUp(double x) {
        if (x < 0 || x > 1)
            return -1;
        if (x == 0) {
            return 0;
        }
        return 1;
    }

    public static int roundDown(double x) {
        if (x < 0 || x > 1)
            return -1;
        if (x == 1) {
            return 1;
        }
        return 0;

    }

    public static int round(double x) {
        if (x < 0 || x > 1) {
            return -1;
        }
        if (x >= 0.5) {
            return 1;
        }
        return 0;
    }
}






