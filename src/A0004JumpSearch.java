public class A0004JumpSearch {

    public static void main(String[] args) throws Exception {
        LOGGER.logHeading("Jump Search");
        jumpSearch();
    }

    private static void jumpSearch() throws Exception {
        final int numberOfElements = 2;
        int[] arr = ArrayUtil.readIntegerArrayFromConsole(numberOfElements);
        final int key = 2;

        int index = getIndexOfKey(arr, numberOfElements, key);
        if (index == -1) {
            LOGGER.logInfo(String.format("Key %d is not present", key), true);
        } else {
            LOGGER.logInfo(String.format("Key %d is present at index : [%d]", key, index), true);
        }
    }

    private static int getIndexOfKey(int[] arr, int numberOfElements, int key) {
        final int jumpCount = (int) Math.sqrt(numberOfElements);

        int previousIndex = 0;

        while (previousIndex < numberOfElements) {

            if (arr[previousIndex] == key) {
                return previousIndex;
            }

            int nextIndex = previousIndex + jumpCount;
            if (nextIndex > numberOfElements) {
                nextIndex = numberOfElements - 1;
            }
            if (arr[nextIndex] == key) {
                return nextIndex;
            }
            if (key > arr[nextIndex]) {
                previousIndex = nextIndex;
            } else if (key > arr[previousIndex] && key < arr[nextIndex]) {
                return linearSearchInRange(arr, previousIndex + 1, nextIndex - 1, key);
            }

        }
        return -1;

    }

    private static int linearSearchInRange(int[] arr, int startIndex, int lastIndex, int key) {
        for (int i = startIndex; i <= lastIndex; ++i) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}