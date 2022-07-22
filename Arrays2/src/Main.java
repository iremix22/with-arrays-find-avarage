
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// program to find the average of the numbers in the entered string
		
		
		int arr []= {9,56,90,10,74};
		
		double total =0;
		double avarage;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
			avarage=total/(arr.length);
			System.out.println(avarage);
		}
	
		
		
	}

}
