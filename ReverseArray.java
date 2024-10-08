import java.util.Arrays;

public class ReverseArray {

    static void reverseArray(int arr[])
    {
        System.out.println("Array Before Reverse : "+Arrays.toString(arr));
          
        int temp;
        int n = arr.length;
          
        for (int i = 0; i < n/2; i++) 
        {
            temp = arr[i];
              
            arr[i] = arr[arr.length-1-i];
              
            arr[n-1-i] = temp;
        }
          
        System.out.println("Array After Reverse : "+Arrays.toString(arr));
    }
      
    public static void main(String[] args) {
        reverseArray(new int[]{4, 5, 8, 9, 10});
          
        System.out.println("-------------------------");
          
        reverseArray(new int[]{12, 9, 21, 17, 33, 7});
          
        System.out.println("-------------------------");
          
        reverseArray(new int[]{891, 569, 921, 187, 343, 476, 555});
        
    }
}
