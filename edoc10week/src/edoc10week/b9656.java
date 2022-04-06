package edoc10week;
import java.io.*;

public class b9656 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int remainder= n%4;
		switch(remainder) {
			case 0:
					System.out.println("SK");
					break;
			case 1:
					System.out.println("CY");
					break;
			case 2:
					System.out.println("SK");
					break;
			case 3:
					System.out.println("CY");
		}
		br.close();
	}

}
