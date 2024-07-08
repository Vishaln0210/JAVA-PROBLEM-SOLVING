import java.util.*;

/*public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; i < columns; j++) {
                row.add(sc.nextInt());
            }
            List.add(row);
        }
        System.out.print("Enter the element to search for: ");
        int searchElement = sc.nextInt();

        // Search for the element in the 2D ArrayList
        boolean found = false;
        for (ArrayList<Integer> row : List) {
            if (row.contains(searchElement)) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
       
    }
}*/
import java.util.ArrayList;
import java.util.Scanner;

public class SearchIn2DArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the 2D ArrayList
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the 2D ArrayList
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        // Read the elements of the 2D ArrayList
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(scanner.nextInt());
            }
            arrayList.add(row);
        }

        // Read the element to be searched
        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();

        // Search for the element in the 2D ArrayList
        boolean found = false;
        for (ArrayList<Integer> row : arrayList) {
            if (row.contains(searchElement)) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
