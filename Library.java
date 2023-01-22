//Group 3
//Section 4: Dr. YANA MAZWIN BINTI MOHMAD HASSIM

import java.util.Scanner;
public class Library {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Store all the data on array
    Book[] books = new Book[8];
    books[0] = new Book("Marvel");
    books[1] = new Book("Naruto");
    books[2] = new Book("Titanic");
    books[3] = new Book("HarryPotter");
    books[4] = new Book("AttackOnTitan");
    books[5] = new Book("PercyJackson");
    books[6] = new ImportantBook("History", "Confidential");
    books[7] = new ImportantBook("CivilWar", "Confidential");

    //Option to choose by user
    while (true) {
      System.out.println(" _________________________________");
      System.out.println("|          FSKTM Library          |");
      System.out.println("|            Main Menu            |");
      System.out.println("|---------------------------------|");
      System.out.println("|    1. Borrow a book             |");
      System.out.println("|    2. Return a book             |");
      System.out.println("|    3. Check status of a book    |");
      System.out.println("|    4. Book List                 |");
      System.out.println("|    5. Exit Program              |");
      System.out.println("|_________________________________|\n");

      System.out.println("Insert Option: ");
      int choice = scanner.nextInt();
      System.out.println("\n\nLoading..");

      //There is will be a condition for an option
      if (choice == 4) {
        for (Book book : books) {
          Book.displayBook(book);
        }
      }

      if (choice == 1) {
        System.out.println("Enter your full name (max 20 character):");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        String name = scanner.next();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter your address:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        String address = scanner.next();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter your phone number (+60):");
        System.out.println("~~~~~~~~~~");
        String contact = scanner.next();
        System.out.println("~~~~~~~~~~");
        System.out.println("Enter the title of the book you want to borrow (no space):");
        System.out.println("~~~~~~~~~~~~");
        String title = scanner.next();
        System.out.println("~~~~~~~~~~~~\n\n");

              boolean found = false;
              for (int i = 0; i < books.length; i++) {
                if (books[i].getTitle().equals(title) && !books[i].isBorrowed()) {
                  found = true;
                  books[i].borrow();
                  System.out.println(" _____________________________________");
                  System.out.println("|You have * successfully * borrowed " + title + " Book");
                  System.out.println("|_____________________________________|");
                  ReceiptGenerator.generateReceipt(name, address, title);
                  break;
                }
              }

              if (!found) {
                System.out.println("Sorry, FSKTM Library not provide that book yet.");
              }
            } else if (choice == 2) {
              System.out.println("Enter the title of the book you want to return:");
              String title = scanner.next();

              boolean found = false;
              for (int i = 0; i < books.length; i++) {
                if (books[i].getTitle().equals(title) && books[i].isBorrowed()) {
                  found = true;
                  books[i].returnBook();
                  System.out.println("You have successfully returned " + title);
                  break;
                }
              }

              if (!found) {
                System.out.println("Sorry, the book you are looking for is not valid.");
              }
            } else if (choice == 3) {
              System.out.println("Enter the title of the book you want to check:");
              String title = scanner.next();

              boolean found = false;
              for (int i = 0; i < books.length; i++) {
                if (books[i].getTitle().equals(title)) {
                  found = true;
                  if (books[i].isBorrowed()) {
                    System.out.println(title + " is currently borrowed.");
                  } else {
                    System.out.println(title + " is available for borrowing.");
                  }
                  break;
                }
              }

              if (!found) {
                System.out.println("Sorry, FSKTM Library do not have the book you are looking for.");
              }

            }
            if (choice == 5) {
              System.out.println("Thank you for using FSKTM library program.");
              break;
            } else {
              System.out.println("       Welcome to main menu");
            }
          }
        }
      }