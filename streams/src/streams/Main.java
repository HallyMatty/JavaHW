package streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        byte[] data = {65, 66, 67, 68}; // A, B, C, D
        InputStream input = new ByteArrayInputStream(data);
        
        int byteRead;
        while ((byteRead = input.read()) != -1) { // читаем по одному байту
            System.out.print((char) byteRead + " "); // A B C D
        }
        System.out.println();
        

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        output.write(72); // H
        output.write(105); // i
        output.write(33); // !
        
        System.out.println(output.toString()); // Hi!
        
        String text = "Привет";
        
        // InputStream/OutputStream работают с байтами (1 символ ≠ 1 байт!)
        byte[] bytes = text.getBytes();
        System.out.println("Байт в 'Привет': " + bytes.length); // 12 (не 6!)
        
        // Reader/Writer работают с символами (учитывают кодировку)
        StringReader reader = new StringReader(text);
        System.out.println("Символов в 'Привет': " + text.length()); // 6
        
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Автоматическое закрытие");
            System.out.println("Файл записан");
        } // writer.close() вызывается автоматически
        catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Файл автоматически закрыт");
    }
}
