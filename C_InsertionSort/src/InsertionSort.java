public class InsertionSort {
    /**
     * 数组中一部分已经排好序，一部分未排号
     * Insertion：将未排好的数字key与已排好的依次比较，并右移数组中数字.
     * InsertionSort:从左到右完成Insertion
     */
    public static void main(String[] args) {
        int[] arr ={8,5,1,6,4,3,10,0,-2,2};
        InsertionSort sort = new InsertionSort ();
//        sort.insertion(arr,6);
//        System.out.println(num);
        sort.insertionSort (arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private void insertion(int[] arr,int n){
        int key = arr[n-1];//n为数组长度，key为数组最后一位
        int i = n-2;//i为数组倒数第二位，即比较的起始端
        while(i >= 0 && arr[i] > key){
           arr[i+1] = arr[i];
           i--;
        }
        arr[i+1] = key;
    }
    public void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 2; i<= n ; i++) insertion(arr,i);
    }
}
