package edoc7week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class b2607 {	
	public static int[] count(String word) {
		int arr[] = new int[26];
		Arrays.fill(arr, 0);
		for(int i=0; i<word.length(); i++) {
			arr[word.charAt(i)-'A']++;
		}
		return arr;
	}
	public static int solution(int n, String [] words) {
		int answer=0;
		int freq_sample [] = new int [26];
		int freq_compare [] = new int [26];
		int diff;
		
		freq_sample=count(words[0]);
		
		for(int i=1; i<n; i++) {
			diff=0;
			freq_compare=count(words[i]);
			for(int j=0; j<freq_compare.length; j++) {
				diff=diff+Math.abs(freq_sample[j]-freq_compare[j]);
			}
			if(diff==0||diff==1||diff==2) {
				answer++;
			}
		}
		
		return answer;
	}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] words = new String[n];
		int answer;
		
		for (int i=0; i<n; i++) words[i] = br.readLine();
		
		
		
		answer = solution(n, words);
		System.out.println(answer);
	}
}
