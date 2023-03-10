import java.io.*;
import java.util.*;

public class EmployeeListings {
  public static void main(String[] args) {
    try {
      // Open the input file
      Scanner scanner = new Scanner(new File("employees.csv"));
      
      // Open the output files
      PrintWriter managerWriter = new PrintWriter(new File("managers.csv"));
      PrintWriter singleNameWriter = new PrintWriter(new File("single_name_employees.csv"));
      
      // Read each line of the input file
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        
        // Check if employee is a manager in the R&D division
        if (parts[1].equals("Manager") && parts[2].equals("R&D")) {
          managerWriter.println(line);
        }
        
        // Check if employee has no last name
        String[] nameParts = parts[0].split(" ");
        if (nameParts.length == 1) {
          singleNameWriter.println(line);
        }
      }
      
      // Close the files
      scanner.close();
      managerWriter.close();
      singleNameWriter.close();
      
      System.out.println("Done.");
      
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
  }
}
