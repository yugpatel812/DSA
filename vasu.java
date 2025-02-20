// given a sorted array and a target value,
// return the index if target is found .
// if not , return index where it would be if it were inserted in order.




class vasu{


    static int find_index(int[] arr, int n, int K)
    {


        int start = 0;
        int end = n - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;


            if (arr[mid] == K)
                return mid;

            else if (arr[mid] < K)
                start = mid + 1;

            else
                end = mid - 1;
        }


        return end + 1;
    }


    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 5, 6 };
        int n = arr.length;
        int K = 2;

        System.out.println(find_index(arr, n, K));
    }
}



