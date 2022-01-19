package edoc2week;

import java.util.Scanner;

public class b4583 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int k=0;
		while(true) {
			String a= sc.nextLine();
			
			if(a.equals("#")) {
				break;
			}
			
			
				String b="";
				for(int i=(a.length()-1);i>=0;i--) {
					char mirror=a.charAt(i);
					
					switch(mirror) {
					case 'b':
							b= b+'d';
							break;
					case 'd':
						b= b+'b';
						break;
					
					case 'p':
							b= b+'q';
							break;
					case 'q':
						b= b+'p';
						break;
							
					case 'o':
						b= b+'o';
						break;
						
					case 'i':
						b= b+'i';
						break;
					case 'v':
						b= b+'v';
						break;
					case 'w':
						b= b+'w';
						break;
					case 'x':
						b= b+'x';
						break;
						default :
							//System.out.println("INVALID");
							k=1;
							break;
					}
					
					
					
				}
				if(k==1) {
					k=0;
					System.out.println("INVALID");
				}
				else {
				System.out.println(b);
				}
		}
		sc.close();
	}

}
