import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("input.txt");
        FileOutputStream out = new FileOutputStream("output.txt");

        int data;
        while((data = in.read())!=-1){
            out.write(data);
        }

        in.close();
        out.close();
    }   
}
