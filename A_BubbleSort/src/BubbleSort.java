public class BubbleSort {
    /**
     * 两两比较相邻位置。
     */
    public static void main(String[] args) {
        int[] arr ={8,5,1,6,4,3,10,0,-2};
        BubbleSort sort = new BubbleSort();
        sort.bubbbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private void bubble(int[] arr,int n){
        for (int i = 0; i < n-1; i++)
            if (arr[i] > arr[i+1]) swap(arr,i,i+1);


    }
    public void bubbbleSort(int[] arr){
        int n = arr.length;
        for (int i = n; i > 0 ; i--)  bubble(arr,n);//n为数组长度

    }
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
