import java.io.IOException;

public class Loading {

    public static void main(String[] args) {
        char[] ch = { '|', '/', '-', '\\' };
        while (true) {
            for (int i = 0; i < ch.length; i++) {
                try {
                    System.out.println(ch[i]);
                    Thread.sleep(500);
                    clearTerminal();
                } catch (Exception e) {
                }
            }
        }

    }

    public static void clearTerminal() {
        try {
            ProcessBuilder processBuilder;
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows
                processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                // For Unix-like systems (macOS, Linux, etc.)
                processBuilder = new ProcessBuilder("clear");
            }
            processBuilder.inheritIO();
            Process process = processBuilder.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
