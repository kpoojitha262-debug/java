#Bubble Sort
  class BubbleSortArray {
  public static void main(String[] args) {
    int arr[] = {5,3,8,1,7,2};
    for (int i = 0; i< arr.length-1; i++){
      for (int j = 0; j< arr.length-1-i; j++){
        int (arr[j] > arr[j+1]){
    int temp = arr[j];
          arr[j]  = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    System.out.println("Sorted Array");
    for(int i = 0; i< arr.length;i++){
      System.out.println(arr[i] + "");
    }
  }
}

#2D Array Sum (Matrix Sum)
  class MatrixSum {
    public static void main(String args[]) {
        int arr[][] = {
            {1, 2},
            {3, 4}
        };

        int sum = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}

        }
        System.out.println("Sum = " + sum);
      
