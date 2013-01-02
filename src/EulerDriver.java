public class EulerDriver {

	/**
	 * Algorithm to solve the First Project Euler Problem
	 * Found at : http://projecteuler.net/problem=1
	 * By William Widmer
	 */
	public static void main(String[] args) {
		int sum = multipleFinder();		
		System.out.println(sum);
	}

	
	public static int multipleFinder() {
		int sum =0;		
		for(int i=1;i<1000;i++){			
			if(i%3==0 || i%5==0){
				System.out.println(sum+" is a multiple of 3 or 5");
				sum=sum+i;
				System.out.println("The sum is now " + sum);
			}			
		}			
		return sum;

	}
}