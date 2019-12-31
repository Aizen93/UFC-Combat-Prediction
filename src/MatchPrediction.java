/**
 *
 * @author Oussama, Ilyess
 */
public class MatchPrediction {
    private final int number;
    private final String actual;
    private final String predicted;
    private final String error;
    private final double prediction;

    public MatchPrediction(Integer number, String actual, String predicted, String error, double prediction) {
        this.number = number;
        this.actual = actual;
        this.predicted = predicted;
        this.error = error;
        this.prediction = prediction;
    }

    public int getNumber() {
        return number;
    }

    public String getActual() {
        return actual;
    }

    public String getPredicted() {
        return predicted;
    }

    public String getError() {
        return error;
    }

    public double getPrediction() {
        return prediction;
    } 
    
}
