public class Que_4 {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) { // base case
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {    
            //arr sorted till now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int arr []= {1,2,4,4,5};
        System.out.println(isSorted(arr, 0));

    }
}
