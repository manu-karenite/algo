import java.util.Scanner;

public class ArrayUtil {
    public static int[] readIntegerArrayFromConsole(final int numberOfElements) throws Exception {
        if(numberOfElements <= 0){
            LOGGER.logError(new IllegalArgumentException(String.format("Number of elements to read is [%d]. Must be greater than 0",numberOfElements)));
        }
        int[] arr = new int[numberOfElements];
        Scanner sc = new Scanner(System.in);
        int elementToRead;
        int idx = 0;
        while(idx < numberOfElements){
            LOGGER.logInfo("Enter the integer #" + (idx+1) + " : ",false);
            elementToRead = sc.nextInt();
            arr[idx++] = elementToRead;
        }
        sc.close();
        return arr;
    }
}