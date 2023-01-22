public class Journal extends Book{


    public static boolean displayJournal;
    public static Journal[] journals;

    private String title;
    private String borrowerName;
    private String borrowerAddress;
    private boolean borrowed;
    

    public static void init() {
        Journal[] journals = new Journal[6];

        journals[0] = new Journal("ScienceJournal");
        journals[1] = new Journal("NatureJournal");
        journals[2] = new Journal("HealthJournal");
        journals[3] = new Journal("AstrologyJournal");
        journals[4] = new Journal("PoliticJournal");
        journals[5] = new Journal("MedicalJournal");
    }

    public static void displayJournalList() {
        System.out.println("List of journals: ");
        Book[] journals = new Book[0];
        for (int i = 0; i < journals.length; i++) {
            System.out.println(journals[i].getTitle());
        }
    }

    public Journal(String journalTitle) {
        super(journalTitle);
        String title = journalTitle;
        borrowed = false;
    }

    public static void displayJournalList(Journal[] journals) {
    }


    public Object borrow() {
        boolean borrowed = true;
        return null;
    }
    

    public boolean isBorrowed() {
        boolean borrowed = false;
        return borrowed;
    }

    public String getTitle() {
        ;
        String title = new String();
        return title;
    }

    public void borrow(String borrowerName, String borrowerAddress) {
    }
}
