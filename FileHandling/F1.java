import java.io.FileWriter;
import java.io.IOException;

public class F1 {
    static FileWriter fw;

    public static void main(String[] args) {
        try {
            fw = new FileWriter("Anu.java");
            String s = "\"hellow world from anu\"";
            F1.fw.write("public class Anu{ public static void main(String[] args){System.out.println(" + s + ");}}");
        } catch (Exception e) {
            System.out.println("file not Found !");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
