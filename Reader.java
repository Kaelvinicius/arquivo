import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
