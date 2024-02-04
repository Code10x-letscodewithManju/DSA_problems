package ArrayAtlas_Proj01;

import java.util.*;

import static java.lang.System.*;

/*DSA based java project Which is capable of performing the following Operations
searching Algorithms,sorting Algorithms,finding maximum element ,minimum element ,target sum ,unique element,
reverse array,rotate array by k times,identical elements using array data structures
 */
public class ArrayOperations {
    private static void Insert() {
        Scanner sc = new Scanner(System.in);
        out.println("\nHello Welcome to Array Insertion Operation->");
        out.println("\nENTER THE SIZE OF ARRAY ->");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        out.println("\nENTER THE ARRAY ELEMENTS ->");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        // Input the position and element to be inserted
        out.print("Enter the position where you want to insert: ");
        int position = sc.nextInt();
        out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        // Shift elements to make space for the new element
        for (int i = size; i >= position; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the element at the specified position
        arr[position - 1] = element;

        // Increment the size of the array
        size++;

        // Print the updated array
        out.print("Array after insertion: ");
        for (int i = 0; i < size; i++) {
            out.print("|" + arr[i] + "|");
        }
        out.println();
        exit(0);

    }

    private static void Delete() {
        Scanner sc = new Scanner(System.in);
        out.println("\nENTER THE SIZE OF ARRAY ->");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        out.println("\nENTER THE ARRAY ELEMENTS ->");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Input the position of the element to delete
        out.print("Enter the position of the element to delete: ");
        int position = sc.nextInt();

        // Check if the position is valid
        if (position < 1 || position > size) {
            out.println("Invalid position");
        } else {
            // Shift elements to overwrite the element to be deleted
            for (int i = position - 1; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Decrement the size of the array
            size--;

            // Print the updated array
            System.out.print("Array after deletion: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            exit(0);
        }

    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int target) {
        int beg = 0, end = array.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (target < array[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }

    private static void bubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void insertionsort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Ascending order sorted array:");
        for (int value : a) {
            System.out.print(value + " ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Descending order sorted array:");
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    //Function to print array
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        mergesort(array, 0, array.length - 1);
    }

    private static void mergesort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergesort(array, left, mid);
            mergesort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    private static int MaximunElement(int arr[]) {
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    private static int MinimumElement(int arr[]) {
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }

    private static int TargetSum(int[] arr, int target) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static int UniqueElement(int arr[]){
        int uni=-1;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0){
                uni=arr[i];
            }
        }
        return uni;
    }

    private static void ReverseArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            out.print(arr[i]+" ");
        }
        out.println();
    }

    private static void rotateArray(int[] arr, int k) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        k = k % n; // To handle cases where k > array length

        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static int tripletSum(int[] arr,int target ){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        out.println("\n\t\t\tWELCOME TO ARRAY ATLAS - AN ULTIMATE ARRAY EXPLORER");
        out.println("\nDSA BASED JAVA PROJECT WHICH IS CAPABLE OF PERFORMING THE FOLLOWING OPERATIONS\n");
        out.println("\n(1)INSERTION \n(2)DELETION \n(3)LINEAR SEARCH \n(4)BINARY SEARCH \n(5)BUBBLE SORT \n(6)SELECTION SORT \n(7)INSERTION SORT \n(8)QUICK SORT \n(9)MERGE SORT \n(10)MAXIMUM ELEMENT \n(11)MINIMUM ELEMENT \n(12)TARGET SUM \n(13)UNIQUE ELEMENT \n(14)REVERSE ARRAY \n(15)ROTATE ARRAY BY K TIMES\n(16)TRIPLET SUM\n");
        out.println("\nENTER YOUR CHOICE FROM ABOVE LIST OF OPERATIONS ->");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            out.println("Hello I am Insertion Algorithm ->\n");
            Insert();
        } else if (choice == 2) {
            out.println("Hello I am Deletion Algorithm ->\n");
            Delete();
        }
        out.println("\nENTER THE SIZE OF ARRAY ->");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int high = arr.length;
        out.println("\nENTER THE ARRAY ELEMENTS ->");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


            switch (choice) {
                case 3 -> {
                    out.println("Hello I am Linear Search Algorithm ->\n");
                    out.println("Enter the Search Element:");
                    int element = sc.nextInt();
                    int output = linearSearch(arr, element);//calling the Linear Search method
                    if (output == -1)
                        out.println("Element not found in the Array");
                    else
                        out.println("Element " + element + " Found at the index " + output);
                }
                case 4 -> {
                    out.println("Hello I am Binary Search Algorithm ->\n");
                    out.println("Enter the Search Element:");
                    int ele = sc.nextInt();

                    int result = binarySearch(arr, ele);//Calling the Binary Search method

                    if (result == -1)
                        out.println("Element not found in the Array");
                    else
                        out.println("Element " + ele + " Found at the index " + result);
                }
                case 5 -> {
                    out.println("Hello I am Bubble Sort Algorithm ->\n");

                    bubbleSort(arr);//calling the bubble Sort method

                    out.println("Array after sorting in ascending order:");
                    for (int i = 0; i < arr.length; i++)
                        out.print(arr[i] + " ");
                    out.println();
                    out.println("Array after sorting in descending order");
                    for (int i = arr.length - 1; i >= 0; i--)
                        out.print(arr[i] + " ");
                    out.println();
                }
                case 6 -> {
                    out.println("Hello I am Selection Sort Algorithm ->\n");
                    out.println("Original array:");
                    printArray(arr);

                    // Calling the Selection Sort function
                    selectionSort(arr);

                    out.println("Sorted array:");
                    printArray(arr);
                }
                case 7 -> {
                    out.println("Hello I am Insertion Sort Algorithm ->");
                    insertionsort(arr);//Calling the Insertion Sort method
                }
                case 8 -> {
                    out.println("Hello I am Quick Sort Algorithm ->\n");
                    System.out.println("Original array:");
                    printArray(arr);

                    // Call the Quick Sort function
                    quickSort(arr, 0, arr.length - 1);//Calling the Quick sort method

                    System.out.println("Sorted array:");
                    printArray(arr);
                }
                case 9 -> {
                    out.println("Hello I am Merge Sort Algorithm ->\n");
                    System.out.println("Original array:");
                    printArray(arr);

                    mergeSort(arr); // Calling  the merge Sort method

                    System.out.println("Sorted array:");
                    printArray(arr);
                }

                case 10 -> {
                    out.println("Hello I am the Max Algorithm ->\n");
                    int Maximum = MaximunElement(arr);//Calling the maximum element method
                    out.println("The Maximun Element In the Array is: " + Maximum);
                }
                case 11 -> {
                    out.println("Hello I am the Min Algorithm");
                    int Minimum = MinimumElement(arr);//Calling the minimum element method
                    out.println("The Minimum Element In the Array is: " + Minimum);
                }
                case 12 -> {
                    out.println("Hello I am Target Sum Algorithm ->\n");
                    out.println("Enter the Target Sum Element: ");
                    int target = sc.nextInt();

                    int targetsum = TargetSum(arr, target);//Calling the target sum method

                    out.println("The Number of Doublets are: " + targetsum);

                }
                case 13 ->{
                    out.println("Hello I am Unique Element Algorithm ->\n");
                    int ele=UniqueElement(arr);//Calling the unique element method
                    out.println("The Unique Element in the array is:"+ele);
                }

                case 14 ->{
                    out.println("Hello I am Array Reverse Algorithm ->");
                    out.println("Array Before Reversing :");
                    printArray(arr);
                    out.println("Array After Reversing :");
                    ReverseArray(arr);//Calling the Reverse Array method
                }
                case 15 ->{
                    out.println("Hello I am Array Rotate K times Algorithm ->\n");
                    System.out.println("Original array:");
                    printArray(arr);
                    out.println("Enter the K value to rotate Array k-times:");
                    int k=sc.nextInt();
                    rotateArray(arr, k);//Calling the Rotate array method
                    System.out.println("Array after rotating by " + k + " times:");
                    printArray(arr);
                }
                case 16 ->{
                    out.println("Hello I am Triplet Sum Algorithm ->\n");
                    System.out.println("Enter the Target element");
                    int target =sc.nextInt();
                    System.out.println("The Number of Triplets are:"+" "+tripletSum(arr,target));
                }

                default ->
                        out.println("Invalid choice input");
            }

        }
    }









