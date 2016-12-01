import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ermakov on 01.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(reader1.readLine());
            reader1.close();


            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(reader2.readLine());
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
