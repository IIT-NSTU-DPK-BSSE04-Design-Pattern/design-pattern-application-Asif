package beta;

class CSVProcessor implements FileProcessor {
    @Override
    public void read(String filePath) {
        System.out.println("Reading CSV file: " + filePath);
    }

    @Override
    public void parse() {
        System.out.println("Parsing CSV data...");
    }
    @Override
    public void save() {
        System.out.println("Saving data from CSV to structured format.");
    }
}
