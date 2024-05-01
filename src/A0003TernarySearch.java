public class A0003TernarySearch {
    public static void main(String[] args) throws Exception {
        LOGGER.logHeading("Ternary Search");
        ternarySearch();
    }

    private static void ternarySearch() throws Exception {
        final int numberOfElements = 9;
        int arr[] = ArrayUtil.readIntegerArrayFromConsole(numberOfElements);

        final int key = 9;
        LOGGER.logInfo("Key to search is : " + key, true);
        final int index = getIndexOfKey(arr, numberOfElements, key);
        if (index == -1) {
            LOGGER.logInfo("Element is not present", true);
        } else {
            LOGGER.logInfo("Element is present at index : " + index, true);
        }
    }

    private static int getIndexOfKey(int[] arr, int numberOfElements, int key) {
        int start = 0;
        int end = numberOfElements - 1;
        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            LOGGER.logInfo(start + " " + mid1 + " " + mid2 + " " + end, true);
            if (key == arr[mid1]) return mid1;
            else if (key == arr[mid2]) return mid2;
            else if (key < arr[mid1]) end = mid1 - 1;
            else if (key > arr[mid2]) start = mid2 + 1;
            else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1;
    }
}
