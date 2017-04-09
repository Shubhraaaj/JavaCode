package Revision;

class HeapSort
{
    private static int N;

    public static void sort(int arr[])
    {
        heapify(arr);
        for(int i=N; i>0; i--)
        {
            swap(arr, 0,i);
            N = N-1;
            maxHeap(arr,0);
        }
    }

    public static void heapify(int arr[])
    {
        N = arr.length - 1;
        for(int i= N/2;i>=0; i--)
            maxHeap(arr, i);
    }

    public static void maxHeap(int arr[], int i)
    {
        int left = 2*i;
        int right = 2*i + 1;
        int max = i;
        if(left <= N && arr[left] > arr[i])
            max = left;
        if(right <= N && arr[right] > arr[max])
            max = right;

        if(max!=i)
        {
            swap(arr,i, max);
            maxHeap(arr,max);
        }
    }

    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

class QuickSort
{
    private int array[];
    private int length;

    public void sort(int arr[])
    {
        if(arr == null || arr.length == 0)
            return;
        this.array = arr;
        this.length = arr.length;
        quickSort(0,length-1);
    }

    public void quickSort(int l, int r)
    {
        int i = l, j = r, pivot = array[(l+r)/2];
        while(i <= j)
        {
            while(array[i]<pivot)
                i++;
            while(array[j]>pivot)
                j--;
            if(i<=j)
            {
                int temp = array[i];
                array[i++] = array[j];
                array[j--] = temp;
            }
        }
        if(l<j)
            quickSort(l ,j);
        if(i<r)
            quickSort(i,r);
    }
}

class MergeSort
{
    int array[];
    int tempArr[];
    int length;

    public MergeSort(int[] array)
    {
        this.array = array;
        this.length = array.length;
        this.tempArr = new int[length];
        mergeSort(0,length - 1);
    }

    public void mergeSort(int l, int u)
    {
        if(l<u)
        {
            int mid = (l+u)/2;
            mergeSort(l, mid);
            mergeSort(mid+1, u);
            merge(l,mid,u);
        }
    }

    public void merge(int l, int mid, int u)
    {
        for(int i=l;i<=u;i++)
            tempArr[i] = array[i];
        int i = l, j = mid+1, k = l;
        while(i<=mid&&j<=u)
        {
            if(tempArr[i]<=tempArr[j])
                array[k++] = tempArr[i++];
            else
                array[k++] = tempArr[j++];
        }
        while(i<=mid)
            array[k++] = tempArr[i++];
        while(j<=u)
            array[k++] = tempArr[j++];

    }
}

public class Sort
{
    public void bubbleSort(int a[])
    {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < (a.length - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort(int a[]) {
        int key, j;
        for (int i = 1; i < a.length; i++) {
            key = a[i];
            j = i - 1;
            while ((j >= 0) && (key < a[j])) {
                a[j + 1] = a[j--];
            }
            a[j + 1] = key;
        }
    }

    public void selectionSort(int a[]) {
        int small, pos;
        for (int i = 0; i < a.length; i++) {
            small = a[i];
            pos = i;
            for (int j = i; j < a.length; j++) {
                if (small > a[j]) {
                    small = a[j];
                    pos = j;
                }
            }

            if (small < a[i]) {
                int temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int[] a = {2,5,1,3,7,9,8,10,0,4, 2,5,1,3,7,9,8,10,0,4};
        long start = System.currentTimeMillis();
        Sort s = new Sort();
        s.insertionSort(a);
        System.out.print("SORTED ARRAY:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        long end = System.currentTimeMillis();
        System.out.print("\nTOTAL TIME TAKEN:" + (end - start));

        int[] b = {2,5,1,3,7,9,8,10,0,4, 2,5,1,3,7,9,8,10,0,4};
        start = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();
        quickSort.sort(b);
        System.out.print("\nSORTED ARRAY:");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        end = System.currentTimeMillis();
        System.out.print("\nTOTAL TIME TAKEN:" + (end - start));

        int[] c = {2,5,1,3,7,9,8,10,0,4, 2,5,1,3,7,9,8,10,0,4};
        start = System.currentTimeMillis();
        MergeSort mergeSort = new MergeSort(c);
        System.out.print("\nSORTED ARRAY:");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i]+" ");
        end = System.currentTimeMillis();
        System.out.println("\nTOTAL TIME TAKEN:"+(end - start));

        int[] d = {2,5,1,3,7,9,8,10,0,4,2,5,1,3,7,9,8,10,0,4};
        start = System.currentTimeMillis();
        HeapSort heapSort = new HeapSort();
        heapSort.sort(d);
        System.out.print("SORTED ARRAY:");
        for (int i = 0; i < d.length; i++)
            System.out.print(d[i]+" ");
        end = System.currentTimeMillis();
        System.out.println("\nTOTAL TIME TAKEN:"+(end - start));
    }
}

/**Bubble Sort
 * Outer loop reduces the size for comparision of inner loop by 1 each time.
 *Run outer loop to take every element to compare
 *Run inner loop to compare with each element and swap if neccessary
 **/

/**Insertion Sort
 *Start by taking the first element as sorted then take the next element.
 *If the next element and store in key is less than go on comparing with each of previous element.
 *If it is smaller than any previous element then put value of the greater element in its index.
 *Then after all the swaps, Put the value of key in the element j+1;
 **/

/**Selection Sort
 *Loop to run all elements
 *Find smallest and position of the smallest element.
 *Swap the elements in the array
 **/

/**QuickSort
 *Take a pivot and then arrange elements accordingly
 *At the time of merging they are all sorted
 **/

/**MergeSort
 * Divide the array into smaller sub-arrays
 * While merging sort them
 * **/

/**Heap Sort
 * Build Heap
 * Transform heap into Min Heap
 * Delete the root node
 * Put the last element of the heap in the root position
 * Repeat step 2 till all nodes are covered.
 ***/

/**Bucket Sort
 * Take size of Bucket_size = 10
 * Divider = Ceil((N+1)/Bucket_size)
 * j = Element/Divider
 * B[j] = A[i]
 * Put the elements in their respective buckets then sort them
 * Take them out one by one and thus they will be sorted
 * **/

/**Counting Sort
 * Find the minimum and maximum element of the array
 * Create an array starting from minimum to maximum of the array
 * Then traverse the array and put the frequency of the elements in their respective count array indices
 * Write the SumCount on another array
 * Traverse the array and then equate element from index array and sumCount array thus placing in sorted array
 * Reduce the no. of sumCounts for each repetitions
 * **/

/**Radix Sort
 * Find the maximum element and count no. of digits in it
 * Make all the elements of the same digit size by adding 0's
 * Create 10 Buckets from 0 to 9
 * Put the elements with last element 0 to 0 bucket, and in respective buckets
 * Take them out according to buckets
 * Go for last 2nd digits and again put them in respective buckets.
 * Continue the process as many times as the max size of number
 * **/

/**Shell Sort
 * Generalised Insertion Sort
 * gap = floor(N/2)
 * Compare and swap
 * gap is reduced to half after each combination till it reaches 1
 * **/