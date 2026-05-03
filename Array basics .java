# Arrays in java
  An array is a collection of elements of the same data type stored in continuous memory locations.
--> Program
  int marks[] = {10, 20, 30, 40, 50};
# Declaration of Array:
int arr[];
# Memory Allocation
arr = new int[5];
# Initialization
int arr[] = {1, 2, 3, 4, 5};

#Example
  class ArrayExample {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40};

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

# one - Dimensional
 -->Program
  class OneDArray {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

# Two - Dimensional
  --> Program :
  class TwoDArray {
    public static void main(String args[]) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}




  
