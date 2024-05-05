public class A0006InterpolationSearch {
    public static void main(String[] args) throws Exception {
        LOGGER.logHeading("Interpolation Search");
        interpolationSearch();
    }

    private static void interpolationSearch() throws Exception {
        final int n = 10;
        final int arr[] = ArrayUtil.readIntegerArrayFromConsole(n);

        final int key = 9;
        final int index = getIndex(arr, key, n);
        if (index == -1) {
            LOGGER.logInfo(String.format("Key %d not found!", key), true);
        } else {
            LOGGER.logInfo(String.format("Key %d found at index %d", key, index), true);
        }
    }

    private static int getIndex(int[] arr, int key, int n) {
        if (n == 1) {
            return (arr[0] == key) ? 0 : -1;
        }
        int start = 0;
        int last = n - 1;
        while (start <= last && (arr[start] <= key && key <= arr[last])) {
            int interpolatedPostion = start + ((((last - start) / (arr[last] - arr[start])) * (key - arr[start])));
            LOGGER.logInfo(interpolatedPostion + "", true);
            if (arr[interpolatedPostion] == key) return interpolatedPostion;
            else if (arr[interpolatedPostion] > key) last = interpolatedPostion - 1;
            else start = interpolatedPostion + 1;
        }
        return -1;
    }
}
