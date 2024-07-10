import java.io.IOException;

class Main {

    private static final String[] CLEAR_COMMAND = {"sh","-c","clear"};
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
        ProcessBuilder pb = new ProcessBuilder(CLEAR_COMMAND);
        pb.inheritIO();
        Process process = pb.start();
        process.waitFor();
    }
}