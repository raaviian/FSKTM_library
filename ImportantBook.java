public class ImportantBook extends Book{
    private String importance;

    public ImportantBook(String title, String importance) {
        super(title);
        this.importance = importance;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}
