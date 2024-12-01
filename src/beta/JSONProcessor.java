package beta;

class JSONProcessor implements FileProcessor {
    @Override
    public void read(String filePath) {
        System.out.println("Reading JSON file: " + filePath);
    }

    @Override
    public void parse() {
        System.out.println("Parsing JSON data...");
    }

    @Override
    public void save() {
        System.out.println("Saving data from JSON to structured format.");
    }
}
