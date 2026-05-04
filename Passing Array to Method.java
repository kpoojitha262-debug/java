#Passing Array to Method
  class PassArray {
    public static void display(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        display(arr);
    }
}

# REVERSE AN ARRAY
  class ReverseArray {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

