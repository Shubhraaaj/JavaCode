package DataStructure;

public class InsertionSort
{
    public static void main(String args[])
    {
        int[] arr={2,1,5,6,3,4};
        InsertionSort r=new InsertionSort();
        r.insertionSort(arr);
        System.out.print("SORTED ARRAY: ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    public void insertionSort(int[] arr)
    {
        int n=arr.length;
        int key,i;
        for(int j=1;j<n;j++)
        {
            key=arr[j];
            i=j-1;
            while((i>-1)&&(arr[i]>key))
            {
                arr[i+1]=arr[i--];
            }
            arr[i+1]=key;
        }
    }
}
