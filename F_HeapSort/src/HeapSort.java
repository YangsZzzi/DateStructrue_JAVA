

public class HeapSort {
    public static void main(String[] args) {
    int[] arr = {4,6,1,10,8,5,9};
        for (int num:arr) {
            System.out.println(num);
        }
    HeapSort sort = new HeapSort();
    sort.heapSort(arr,arr.length);
        for (int num:arr) {
            System.out.println(num);
        }
    }

    /**
     *
     * @param tree
     * @param n
     */
    public void heapSort(int[] tree,int n){
        System.out.println("开始堆排序...");
        build_heap(tree,n);
        for (int i = n-1;i>=0;i--){
            swap(tree,0,i);
            build_heap(tree,i);
        }

    }

    /**
     * 从下到上，从右到左。
     * @param tree
     * @param n
     */
    public void build_heap(int[] tree,int n){
        int last_node = n-1;
        int last_level = (last_node-1)/2;
        for (int i = last_level; i >=0 ; i--) {
            heapify(tree,n,i);
        }
    }
    /**
     *功能将以i对应的非叶子节点调节为大顶堆。
     * @param tree 待调整的树
     * @param n 对多少个元素进行调整，n在逐渐减少。（数组最后一个被剔除了）
     * @param i 非叶子节点在数组中的索引
     */
    public void heapify(int[] tree,int n,int i){
        //递归出口
        if( i > n ) return;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        //寻找最大值所在的数组索引
        int max = i;
        if (n > l && tree[l] > tree[max]) max =l;
        if (n > r && tree[r] > tree[max]) max =r;
        //最大值替换，并进行下一层的递归
        if(max != i) {
            swap(tree,max,i);
            heapify(tree,n,max);//??? 因为替换后的子节点发生了变化，需要重新heapify
        }
    }

    /**
     *
     * @param arr
     * @param i
     * @param j
     */
    public void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
