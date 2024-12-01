package beta;

class XMLProcessor implements FileProcessor {
    @Override
    public void read(String filePath) {
        System.out.println("Reading XML file: " + filePath);
    }

    @Override
    public void parse() {
        System.out.println("Parsing XML data...");
    }

    @Override
    public void save() {
        System.out.println("Saving data from XML to structured format.");
    }
}
