package beta;

class DataProcessor {
    private FileProcessor fileProcessor;

    // Method to set the strategy
    public void setFileProcessor(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    // Method to process the file
    public void processFile(String filePath) {
        fileProcessor.read(filePath);
        fileProcessor.parse();
        fileProcessor.save();
    }
}
