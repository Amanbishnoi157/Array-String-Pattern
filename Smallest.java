//Write a Java program to find smallest and second smallest element in an integer array?

public class Smallest {

    private static void getElement(int arr[]){
        int n = arr.length;
        int smallest = arr[0];
        int secondsmallest = arr[0];

        for(int i = 0; i < n ; i++){
            if(smallest>arr[i]){
                secondsmallest = smallest;
                smallest = arr[i];
                

            }
        }
                  
        System.out.println("Smallest Element : "+smallest);
        System.out.println("Second-Smallest Element : "+secondsmallest);


    }
    public static void main(String[] args) {
        getElement(new int[] {34,23,76,81,12});
    }
}
