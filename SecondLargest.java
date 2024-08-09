public class SecondLargest {

    public static int getSecondLargest(int[] a, int total) {
		int temp;
		for(int i = 0; i<total; i++) {
			for(int j = i+1; j<total; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-2];
	}
	public static void main(String[] args) {
		int[] arr1 = {42,51,72,20,22};
		int[] arr2 = {972,975,997,1000,996};
		int[] arr3 = {9232,9455,9459,2000,9622};
		int[] arr4 = {74562,74565,73456,76520,12322};
		
		System.out.println("arr1: "+getSecondLargest(arr1,5));
		System.out.println("arr2: "+getSecondLargest(arr2,5));
		System.out.println("arr3: "+getSecondLargest(arr3,5));
		System.out.println("arr4: "+getSecondLargest(arr4,5));
    }
    
}
