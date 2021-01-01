public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {4,8,9,1,2,7,5,3};
        QuickSort sort = new QuickSort();
        sort.quickSort(arr,0,7);
        for (int num : arr) System.out.println(num);
    }
    public  void quickSort(int[] arr,int l ,int r){
        if ( l >= r) {
            return;
        }
        int mid = getMid(arr,l,r);
        quickSort(arr,l,mid);
        quickSort(arr,mid+1,r);
    }
    private static int getMid(int[] arr,int l ,int r){
        int pivot = arr[l];
        while( l < r){
            while(arr[r] > pivot && r > l) r--;
            arr[l] = arr[r];
            while(arr[l] < pivot && l < r) l++;
            arr[r] = arr[l];
        }
        arr[l] = pivot;
        return l;
    }
}
