public class SelectionSort {
    /**
     * 选择最大的数，放到数组最后
     */
    public static void main(String[] args) {
        int[] arr ={8,5,1,6,4,3,10,0,-2};
        SelectionSort sort = new SelectionSort();
/*        int num = sort.selection(arr,9);
        System.out.println(num);*/
        sort.selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    private int selection(int[] arr,int n){
        int max_index=0;
        for (int i = 0; i < n; i++)
                if (arr[i] > arr[max_index]) max_index =i;
        return max_index;
    }

    public void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = n; i > 0 ; i--) {//n为数组长度i
            int max_index = selection(arr,i);
            swap(arr,i-1,max_index);//swap交换的是下标 而i是长度
        }
    }
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
