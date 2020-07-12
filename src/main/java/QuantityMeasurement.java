public class QuantityMeasurement {
    private double numberInFeet;

    public double unitConverter(double numberInFeet) {
        this.numberInFeet = numberInFeet;
        double numberInInches = numberInFeet * 12;
        return numberInInches;
    }
}
