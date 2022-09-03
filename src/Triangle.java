import java.util.Arrays;

public class Triangle {

    private double[] side;

    public Triangle(double side1, double side2, double side3) {
        side = new double[] {side1, side2, side3};
        Arrays.sort(side);
    }

    boolean isEquilateral() {
        if (side[0] == side[1] && side[0] == side[2]){
            return true;
        }
        return false;
    }

    boolean isIsosceles() {
        if (side[0] == side[1] || side[0] == side[2] || side[1] == side[2]){
            return true;
        }
        return false;
    }

    boolean isScalene() {
        if (side[0] != side[1] && side[0] != side[2] && side[1] != side[2]){
            return true;
        }
        return false;
    }
}
