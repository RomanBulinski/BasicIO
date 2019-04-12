import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIle_read {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        // OTWIERANIE PLIKU:
        try {
            fileInputStream = new FileInputStream("/home/roman/codecool/40_Advanced/05_SI_Threads/01_My_Exercises/05BasicIO/BasicIO/src/main/resources/MyInputFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD!!! Nie znaleziono pliku...");
            System.exit(1);
        }

        int bajt = 0;
        // ODCZYT KOLEJNYCH BAJTÓW Z PLIKU:
        try {
            bajt = fileInputStream.read();
            while(bajt != -1){ // wartość -1 zwracana gdy koniec pliku...
                System.out.print((char)bajt);
                bajt = fileInputStream.read();
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU!!!");
            System.exit(2);
        }

        // ZAMYKANIE PLIKU:
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}