public class A0005ExponentialSearch {
    public static void main(String[] args) throws Exception {
        LOGGER.logHeading("Exponential Search");
        exponentialSearch();
    }

    private static void exponentialSearch() throws Exception {
        final int n = 5;
        final int arr[] = ArrayUtil.readIntegerArrayFromConsole(n);

        final int key = 4;
        final int index = getIndex(arr, key, n);
        if (index == -1) {
            LOGGER.logInfo(String.format("Key %d not found!", key), true);
        } else {
            LOGGER.logInfo(String.format("Key %d found at index %d", key, index), true);
        }
    }

    private static int getIndex(int[] arr, int key, int n) {
        if (n == 1 && arr[0] != key) return -1;
        if (n == 1 && arr[0] == key) return 0;

        int start = 0;
        int exponent = 0;
        while (start < n && arr[start] <= key) {
            if (arr[start] == key) {
                return start;
            }
            int next = start + (int) Math.pow(2, exponent++) - 1;
            if (next >= n) next = n - 1;
            if (arr[next] == key) {
                return next;
            }
            if (key > arr[start] && key < arr[next]) {
                return binarySearch(start, next, arr, key);
            } else if (key > arr[next]) {
                start = next + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int start, int next, int[] arr, int key) {
        while (start <= next) {
            int mid = start + (next - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) next = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
