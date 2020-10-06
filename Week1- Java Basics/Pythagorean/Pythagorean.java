import java.lang.Math;
public class Pythagorean {
    public double getHypo(int legA, int legB){
        double squareRoot = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        return squareRoot;
    }
}