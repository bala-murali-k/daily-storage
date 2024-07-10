import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String osname = System.getProperty("os.name");
        clearScreen(osname);
        System.out.println(osname);
    }

    public static void clearScreen(String sytem_name) {
        try {
            if(System.getProperty("os.name").contains("Linux")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
                e.printStackTrace();
        }
    }
}