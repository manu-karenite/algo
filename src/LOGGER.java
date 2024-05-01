import java.util.Date;

public class LOGGER {
    public static void logInfo(final String message, final boolean newLine){
        System.out.print("[" + new Date() + "] [INFO] " + message);
        if(newLine){
            System.out.print("\n");
        }
    }
    public static void logNewLine(){
        System.out.println("");
    }
    public static void logError(Exception e) throws Exception {
        System.out.println("[" + new Date() + "] [ERR] " + e.getMessage());
        throw e;
    }
    public static void logHeading(String title) {
        System.out.println("");
        final int width = 100;
        for(int i = 1; i <= width; ++i){
            System.out.print("#");
        }
        System.out.println("");
        int lenOfMessage = title.length();
        if(lenOfMessage % 2 == 1){
            ++lenOfMessage;
            title+="!";
        }
        final int totalLeftChars = width - lenOfMessage;
        final int halfOfTotalLeftChars = totalLeftChars / 2;
        for(int i = 1; i <= halfOfTotalLeftChars; ++i){
            System.out.print(" ");
        }
        System.out.print(title);
        for(int i = 1; i <= halfOfTotalLeftChars; ++i){
            System.out.print(" ");
        }
        System.out.println("");
        for(int i = 1; i <= width; ++i){
            System.out.print("#");
        }
        System.out.println("");
        System.out.println("");

    }
}
