package edoc10week;

public class programmers {

	
	    public static int solution(int n) {
	        int answer = 0;
	        
	        for(int i=2; i<=n; i++) {
	            boolean flag=true;
	                for(int j=2; j<i; j++) {
	                    if(i%j==0&&i!=1){
	                     flag=false;
	                     break;
	                 }
	            }
	                if(flag==true) answer++;
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
	}

}
