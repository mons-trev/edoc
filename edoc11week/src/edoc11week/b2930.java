package edoc11week;

import java.util.Scanner;
import java.util.Vector;

public class b2930 {

	static int record_count(char sanggeun, char friend) {
		if(sanggeun==friend) {
			return 1;
		}
		else if(sanggeun=='S'&&friend=='P'||sanggeun=='P'&&friend=='R'||sanggeun=='R'&&friend=='S') {
			return 2;
		}
		else return 0;
	}
	
	static int max_score_perround(int round_num, Vector<String> friendshape_array)//round_num은 라운드 번호(배열 인덱스)
	{
		int max[]=new int[3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<friendshape_array.size(); j++) {
				if(i==0) {
					max[i]+=record_count('S', friendshape_array.elementAt(j).charAt(round_num));
				}
				else if(i==1) {
					max[i]+=record_count('P', friendshape_array.elementAt(j).charAt(round_num));
				}
				else {
					max[i]+=record_count('R', friendshape_array.elementAt(j).charAt(round_num));
				}
			}
			
		}
		int return_max=max[0];
		for(int k=1; k<max.length; k++) {
			if(return_max<max[k]) {
				return_max=max[k];
			}
		}
		return return_max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int round_number=sc.nextInt();
		String sanggeunshape=sc.next();
		int friend_number= sc.nextInt();
		Vector<String> friendshape_array= new Vector<>();
		for(int i=0; i<friend_number; i++) {
			friendshape_array.add(sc.next());
		}
		int record= 0;
		
		for(int i=0; i<round_number; i++) {
			for(int j=0; j<friend_number; j++) {
				record+= record_count(sanggeunshape.charAt(i), friendshape_array.elementAt(j).charAt(i));
			}
		}
		int max=0;
		
		for(int i=0; i<round_number; i++) {
			max+=max_score_perround(i, friendshape_array);
		}
		
		System.out.println(record);
		System.out.println(max);
	}

}
