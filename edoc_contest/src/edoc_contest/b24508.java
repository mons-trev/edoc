package edoc_contest;

import java.io.*;
import java.util.StringTokenizer;

public class b24508 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		st = new StringTokenizer(sc.readLine());
		
		int basket= Integer.parseInt(st.nextToken());
		int nadoriboom= Integer.parseInt(st.nextToken());
		int t= Integer.parseInt(st.nextToken());
		int [] a= new int[basket];
		
		//StringTokenizer st2 = null;
		st = new StringTokenizer(sc.readLine());
		for(int i=0; i<a.length; i++) {
			
			a[i]=Integer.parseInt(st.nextToken());
		}
		int sum=0;
		int j=0;
		while(j<t) {
			int maxindex=0;
			
			for(int i=0;i<a.length;i++) {
				if(a[maxindex]<=a[i]) {
					maxindex=i;
				}
			}
			for(int i=0; i<a.length; i++) {
				if(i!=maxindex&&a[i]>0) {
					a[i]=a[i]-1;
					a[maxindex]=a[maxindex]+1;
					break;
				}
			}
			if(a[maxindex]==nadoriboom) {
				a[maxindex]=0;
			}
			int sum2=0;
			for(int i=0; i<a.length; i++) {
				sum2+=a[i];
			}
			if(sum2<nadoriboom) {
				break;
			}
			j++;
		}
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		if(sum==0) {
			bw.write("YES");
			
		}
		else {
			bw.write("NO");
		}
		bw.flush();
		bw.close();
	}

}
