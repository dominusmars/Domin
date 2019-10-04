public class ConvertImpandMet extends Convert {
    boolean convert;

    public ConvertImpandMet(double input, Boolean convert, boolean way) {
        super(input, way);
        this.convert = convert;
    }

    public double MMandInch() {
        if (convert == true) {
            return input / 25.4;
        } else {
            return input * 25.4;
        }
    }

    public double CMandFeet() {
        if (convert == true) {
            return input / 30.48;
        } else {
            return input * 30.48;
        }
    }

    public double YardandM() {
        if (convert == true) {
            return input / 1.0936;
        } else {
            return input * 1.0936;
        }
    }

    public double MileandKM() {
        if (convert == true) {
            return input / 1.609344;

        } else {
            return input * 1.609344;

        }
    }

}
