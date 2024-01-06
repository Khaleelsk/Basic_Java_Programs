import java.util.Scanner;

class Quick_Sort {
    public static void main(String... args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size :");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Before Sorting :");
        Quick_Sort obj = new Quick_Sort();
        obj.Sort(arr);
    }

    void Sort(int arr[]) {
        int i, j, pivot;
        pivot = arr[arr.length - 1];
        for (i = 0; i < arr.length - 1; i++) {
            for (j = arr.length - 1; j > i; j--) {
                if (arr[i] < pivot)
                    arr[i] = arr[i];
                else
                    ;

            }
        }
    }
}