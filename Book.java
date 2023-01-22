class Book {

    //constructor
    private String title;
    boolean borrowed;
  
    public Book(String bookTitle) {
      title = bookTitle;
      borrowed = false;
    }




    public static void displayBook(Book book) {
        System.out.println("________________________________");
        System.out.println("|        + Books List +        |");
        System.out.println("|______________________________|");
        System.out.println("|  Book Title: " + book.getTitle());
        System.out.println("|  Book Availability: " + (book.isBorrowed() ? "Borrowed" : "Available"));
        System.out.println("|______________________________|");
    }

  
    public Object borrow() {
      borrowed = true;
        return null;
    }
  
    public void returnBook() {
      borrowed = false;
    }
  
    public boolean isBorrowed() {
      return borrowed;
    }


    public String getTitle() {
      return title;
    }
}
