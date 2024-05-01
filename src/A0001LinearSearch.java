public class A0001LinearSearch {

    public static void main(String[] args) throws Exception {
        LOGGER.logHeading("Linear Search");
        linearSearch();
    }

    public static void linearSearch() throws Exception {
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
        int idx = 0;
        while(idx < numberOfElements){
            if(arr[idx] == key){
                return idx;
            }
            ++idx;
        }
        return -1;
    }
}
