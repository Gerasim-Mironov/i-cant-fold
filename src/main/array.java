package main;

public class array implements IMath
{
    private int[] arr;
    private int size;

    public array()
    {
        size = 1;
        arr = new int[size];
    }
    public array(int[] arr, int size)
    {
        this.size = size;
        this.arr = arr;
    }

    public int max()
    {
        int max = arr[0];
        for(int i = 0; i < size; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }
    public int min()
    {
        int min = arr[0];
        for(int i = 0; i < size; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }

    public float avg()
    {
        int res = 0;
        for(int i : arr)
        {
            res += i;
        }

        res /= size;
        return res;
    }
}