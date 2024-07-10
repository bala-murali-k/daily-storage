import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String osname = System.getProperty("os.name");
        try {
            clearScreen();
            System.out.println("Cleared sucessfully");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(osname);
    }

    public static void clearScreen() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("clear");
        pb.inheritIO();
        Process process = pb.start();
        process.waitFor();
    }
}