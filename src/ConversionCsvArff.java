import java.io.File;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;


public class ConversionCsvArff {

    public static void main(String[] args) throws Exception {
        DataSource source = new DataSource("src/Csv/NewEnsembleSANSCOLONNENOM.csv");
        Instances data = source.getDataSet();

        // save ARFF
        ArffSaver saver = new ArffSaver();
        saver.setInstances(data);
        saver.setFile(new File("src/Csv/ensembleTestSansRez.arff"));
        // saver.setDestination(new File("finalgod.arff"));
        saver.writeBatch();

    }

}
