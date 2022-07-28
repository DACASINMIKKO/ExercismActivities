public class Hamming {
    String leftStrand;
    String rightStrand;

    public Hamming(String leftStrand, String rightStrand){
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if(leftStrand.length() > rightStrand.length() && rightStrand.length() != 0) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if(leftStrand.length() < rightStrand.length() && leftStrand.length() != 0) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if(leftStrand.isEmpty() && rightStrand.length() != 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if(rightStrand.isEmpty() && leftStrand.length() != 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
    }

    public int getHammingDistance(){
        int counter = 0;

        for (int i = 0; i < leftStrand.length(); i++){
            for (int j = 0; j < rightStrand.length(); j++){
                if (i == j && leftStrand.charAt(i) != rightStrand.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
