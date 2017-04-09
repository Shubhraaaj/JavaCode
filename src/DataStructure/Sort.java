package DataStructure;

class Sorting
{
    //For MergeSort Only
    int array[],elems;
    Sorting(int arr[],int elems)
    {
        this.elems=elems;
        array=new int[elems];
        for(int i=0;i<elems;i++)
            array[i]=arr[i];
    }
    //BubbleSort
    public void bubbleSort(int arr[], int n) {
        int tmp, i, j;
        for (i = 0; i < n; i++) {
            for (j = i; j < (n - i - 1); j++) {
                if (arr[j]>arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    //SelectionSort
    public void selectionSort(int arr[],int n)
    {
        int i,small,j,tmp,pos;
        for(i=0;i<n;i++)
        {
            pos=i;
            small=arr[i];
            for(j=i+1;j<n;j++)
            {
                if (small > arr[j])
                {
                    small = arr[j];
                    pos=j;
                }
            }
            if(arr[i]>=small)
            {
                tmp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=tmp;
            }
        }
    }
    //QuickSort Technique
    int left1,right1,pivot;
    public void quickSort(int arr[],int left,int right) {
        left1 = left;
        right1 = right;
        pivot = arr[left];
        while (left < right)
        {
            while ((arr[right] >= pivot) && left < right)
                right--;
            if (left != right) {
                arr[left] = arr[right];
                left++;
            }
            while ((arr[left] <= pivot) && left < right)
                left++;
            if(left!=right)
            {
                arr[right]=arr[left];
                right--;
            }
        }
        arr[left]=pivot;
        pivot=right;
        left=left1;
        right=right1;
        if(left<pivot)
            quickSort(arr,left,pivot-1);
        if(right>pivot)
            quickSort(arr,pivot+1,right);
    }
    //MergeSort Technique
    public void recMergeSort(int arr[],int lowerBound,int upperBound)
    {
        int mid;
        if(lowerBound<upperBound) {
            mid = (lowerBound + upperBound) / 2;
            recMergeSort(arr, lowerBound, mid);
            recMergeSort(arr, mid + 1, upperBound);
            merge(arr, lowerBound, mid + 1, upperBound);
        }
    }
    public void merge(int workspace[],int lowPtr,int highPtr,int upperBound)
    {
        int j=0;
        int lowerBound=lowPtr;
        int mid=highPtr-1;
        int n=highPtr-lowPtr+1;
        while(lowPtr<=mid&&highPtr<=upperBound)
            if(array[lowPtr]<array[highPtr])
                array[j++]=workspace[lowPtr++];
            else
                array[j++]=workspace[highPtr++];
        while (lowPtr<=mid)
            array[j++]=workspace[lowPtr++];
        while (highPtr<=upperBound)
            array[j++]=workspace[highPtr++];
    }
}
public class Sort
{
    protected static int [] a;
    public static void main(String args[])
    {
        a= new int[]{2, 3, 6, 1, 8, 7, 5, 9, 0, 4, 11, 12};
        Sorting s=new Sorting(a,12);
        s.recMergeSort(a,0,11);
        System.out.println("Array after Sorting:");
        for(int i=0;i<12;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}