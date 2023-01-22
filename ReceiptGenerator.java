import java.io.*;
import java.nio.charset.StandardCharsets;

class ReceiptGenerator {
    public static void generateReceipt(String name, String address, String title) {
        try {
            PrintWriter writer = new PrintWriter("FSKTM_library_receipt.txt", StandardCharsets.UTF_8);
            writer.println("|------------------------------|");
            writer.println("|  +  FSKTM Library Receipt  + |");
            writer.println("|------------------------------|");
            writer.println("      Name: " + name);
            writer.println("      Address: " + address);
            writer.println("      Title: " + title);
            writer.println("________________________________");
            writer.println("      Borrowed on: " + java.time.LocalDate.now());
            writer.close();
            System.out.println("|    Receipt generated successfully ***.  |");
            System.out.println("|_________________________________________|\n");
            System.out.println("|    Receipt generated in this folder.    |\n");
        } catch (IOException e) {
            System.out.println("An XXX_error_XXX occurred while generating the receipt.");
        }
    }
}
