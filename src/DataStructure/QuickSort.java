package DataStructure;

public class QuickSort
{
    private int array[];
    private int length;

    public void sort(int[] inputArr)
    {
        if(inputArr==null||inputArr.length==0)
            return;
        this.array=inputArr;
        length=inputArr.length;
        quickSort(0,length-1);
    }

    public void quickSort(int l,int u)
    {
        int i=l;
        int j=u;
        int pivot=array[(l+u)/2];
        while(i<=j)
        {
            while(array[i]<pivot)
                i++;
            while(array[j]>pivot)
                j--;
            if(i<=j)
            {
                int temp=array[i];
                array[i++]=array[j];
                array[j--]=temp;
            }
        }
        if(l<j)
            quickSort(l,j);
        if(i<u)
            quickSort(i,u);
    }

    public static void main(String args[])
    {
        QuickSort quickSort=new QuickSort();
        int[] arr={3,2,1,5,4,0};
        quickSort.sort(arr);
        System.out.println("SORTED ARRAY:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
