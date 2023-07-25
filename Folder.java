import java.io.File;
import java.util.Scanner;

public class Folder {
    public static void main(String[] args) {
        // Showing all folders and files in the computer
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File folders [] = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        File file [] = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File files: file ){
            System.out.println(files);
        }

        Boolean success = new File(strPath + "\\subfolder").mkdir();
        System.out.println("Folder created successfully " + success );

        sc.close();
    }
}
