
public class sum {
	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		sum a = new sum();
		System.out.println(a.addition(5));
		System.out.println("Time taken" + now);
	}
	public int addition(int a) {
		 int sum = 0;
		 sum = a*(a+1)/2;
		 return sum;
	 }
//	public int addition(int a) {
//		int sum = 0;
//		for(int i = 1;i<=a;i++) {
//			sum=sum+i;
//		}
//		return sum;
//	}
}
