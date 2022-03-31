package edoc9week;

import java.util.Arrays;
import java.util.Scanner;

public class b2149 {
	public static char[][] makepasswordtable(int rownum, int columnnum, String key, String password){
		char [][] makepasswordtable = new char[rownum][columnnum];
		for(int i=0; i<makepasswordtable[0].length; i++) {
			makepasswordtable[0][i]=key.charAt(i);
		}
		for(int i=0; i<password.length(); i++) {
			makepasswordtable[(i%(rownum-1))+1][i/(rownum-1)]=password.charAt(i);
		}
		return makepasswordtable;
	}
	public static char[][] solvepasswordtable(int rownum, int columnnum, char [][] passwordtable, String key){
		char [][] solvedtable = new char [rownum][columnnum];
		Boolean ifchecked []= new Boolean[key.length()];
		for(int i=0; i<ifchecked.length; i++) {
			ifchecked[i]=false;
			solvedtable[0][i]=key.charAt(i);
		}
		for(int i=0; i<key.length(); i++) {
			for(int j=0; j<key.length(); j++) {
				if((solvedtable[0][i]==passwordtable[0][j]) && !ifchecked[j]) {
					ifchecked[j]=true;
					for(int k=1 ; k<rownum; k++) {
						solvedtable[k][i]=passwordtable[k][j];
					}
					break;
				}
			}
		}
		
		return solvedtable;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String key= sc.next(); //Ű �Է¹ޱ�
		String password=sc.next(); //��ȣ �Է¹ޱ�
		char [] keycharsort=key.toCharArray();
		Arrays.sort(keycharsort);//��ȣ ����
		String keyactivate= new String(keycharsort);
		int columnnumber=key.length(); //�� ����
		int rownumber=password.length()/key.length() + 1; //�� ����
		char [][] passwordtable=makepasswordtable(rownumber, columnnumber, keyactivate, password); //�׷��� ����
		char [][] solvedtable= solvepasswordtable(rownumber, columnnumber, passwordtable, key);
		
		for(int i=1; i<rownumber; i++) {
			for(int j=0; j<columnnumber; j++) {
				System.out.print(solvedtable[i][j]);
			}
			
		}
		
		
		
	}

}
