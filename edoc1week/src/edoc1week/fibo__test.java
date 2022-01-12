package edoc1week;

public class fibo__test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int[46];
		arr[0]=0;
		arr[1]=1;
		int j;
		for(j=2; j<arr.length; j++) {
			arr[j]=arr[j-2]+arr[j-1];
		}
		System.out.print(arr[45]);
	}

}
