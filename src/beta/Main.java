package beta;


public class Main {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();


        dataProcessor.setFileProcessor(new CSVProcessor());
        dataProcessor.processFile("data.csv");


        dataProcessor.setFileProcessor(new JSONProcessor());
        dataProcessor.processFile("data.json");


        dataProcessor.setFileProcessor(new XMLProcessor());
        dataProcessor.processFile("data.xml");
    }
}
