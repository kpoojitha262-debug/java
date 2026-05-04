# Sum Array
  Class SumArray {
  public static void main(String args[]) {
    int arr [] = {10,20,30,40,50};
      int sum = 0;
    for (int i = 0; i < arr.length; i++)
      {
        sum += arr[i];
      }
    System.out.println("Sum :"+sum)
      }
}
    
#FIND MAXIMUM ELEMENT
  class MaxArray(
  public static void main(String args[]){
  int arr [] = {10,50,90,80};
  int max = arr[0];
  for (int i = 1; i < arr.length ; i++)
    {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
  System.out.println("Max = " + max );
}
}

#LINEAR SEARCH 
  class LinearSearch {
  public static void main (String args[]){
    int arr[] = {10,20,30,40};
    int key = 40 ;
    boolean found = false;
    for (int i = 0 ; i < arr.length; i++){
      if (arr[i] == key){
        System.out.println("Found at index"  + i);
        found = true;
        break;
      }
    }
    if(!found) {
      System.out.println("Not Found");
    }
  }
}
      
  
 
