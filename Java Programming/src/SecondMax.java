public class SecondMax {
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int secondMaxElement(int arr[]) {
		int max=Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax = max;
				max = arr[i];
			}
			else if(arr[i]!=max &&arr[i]>secMax ) {
				secMax=arr[i];
			}
		}
		return secMax;
	}
	public static void main(String[] args) {
		SecondMax secondMax = new SecondMax();
		int arr[] = {1,3,5,6,10,8};
		printArray(arr);
		int secMax = secondMaxElement(arr);
		System.out.println("Second maximum element: " + secMax);
		
	}
}
