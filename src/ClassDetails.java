/**
 *
 * @author Oussama, Ilyess
 */
public class ClassDetails {
    private final double recall;
    private final double precision;
    private final double f_measure;

    public ClassDetails(double recall, double precision, double f_measure) {
        this.recall = recall;
        this.precision = precision;
        this.f_measure = f_measure;
    }

    public double getRecall() {
        return recall;
    }

    public double getPrecision() {
        return precision;
    }

    public double getF_measure() {
        return f_measure;
    }
    
    
}
