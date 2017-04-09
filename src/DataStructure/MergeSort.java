package DataStructure;

public class MergeSort
{
    private int[] array;
    private int[] tempArr;
    private int length;

    public void merge(int l,int mid,int u)
    {
        for(int i=l;i<=u;i++)
            tempArr[i]=array[i];
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid&&j<=u)
        {
            if(tempArr[i]<=tempArr[j])
                array[k++]=tempArr[i++];
            else
                array[k++]=tempArr[j++];
        }
        while(i<=mid)
            array[k++]=tempArr[i++];
        while(j<=u)
            array[k++]=tempArr[j++];
    }

    public void mergeSort(int l,int u)
    {
        if(l<u) {
            int mid = (l+u)/2;
            mergeSort(l,mid);
            mergeSort(mid+1,u);
            merge(l,mid,u);
        }
    }

    public void sort(int arr[])
    {
        this.array=arr;
        this.length=arr.length;
        this.tempArr=new int[length];
        mergeSort(0,length-1);
    }

    public static void main(String args[])
    {
        int[] arr={4,2,1,3,6,7,5,9,8};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        MergeSort ms=new MergeSort();
        ms.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
