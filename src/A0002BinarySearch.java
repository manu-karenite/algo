public class A0002BinarySearch {

    public static void main(String[] args) throws Exception {
        LOGGER.logHeading("Binary Search");
        binarySearch();
    }

    private static void binarySearch() throws Exception {
        final int numberOfElements = 5;
        int arr[] = ArrayUtil.readIntegerArrayFromConsole(numberOfElements);

        final int key = 5;
        LOGGER.logInfo("Key to search is : " + key, true);
        final int index = getIndexOfKey(arr,numberOfElements,key);
        if(index == -1){
            LOGGER.logInfo("Element is not present",true);
        }else{
            LOGGER.logInfo("Element is present at index : " + index,true);
        }
    }

    private static int getIndexOfKey(int[] arr, int numberOfElements, int key) {
        int start = 0;
        int end = numberOfElements - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                return key;
            } else if (arr[mid] > key) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
