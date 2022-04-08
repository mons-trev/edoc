package edoc10week;

public class programmers {

	
	    public static int solution(int n) {
	        int answer = 0;
	        
	        boolean [] prime = new boolean [n+1];
	        
	        for(int i=2; i<n+1; i++) {
	        	prime[i]=true;
	        }
	        for(int i=2; i<n+1; i++) {
	        	if(prime[i]==true) {
	        		for(int j=2; i*j<n+1; j++) {
	        			prime[i*j]=false;
	        		}
	        	}
	        }
	        for(int i=2; i<n+1; i++) {
	        	if(prime[i]==true) {
	        		answer++;
	        		System.out.println(i);
	        	}
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(8));
	}

}
