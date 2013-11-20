import java.util.ArrayList;

public class Solution {
	public static void main(String args[]){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int primesIndex = -1;
		final int limit = 1000;
		int i = 1;

		while(true){
			i++;
			if(isPrime(i)){
				primes.add(i);
				final int s = sum(primes);
				System.out.println(s);
				if(s >= limit){
					break;
				} else if(isPrime(s)){
					sums.add(s);
					primesIndex = primes.size();
				}
			}
		}

		for(Integer p : primes.subList(0, primesIndex)){
			System.out.print(" "+p);
		}
		System.out.println("\n"+primes.subList(0, primesIndex).size());
		System.out.println(sums.get(sums.size()-1));
	}

	public static int sum(ArrayList<Integer> ns){
		int r = 0;
		for(Integer p : ns){
			r += p;
		}
		return r;
	}

	public static boolean isPrime(int x){
		for(int i = 2; i < x; i++){
			if(x % i == 0){
				return false;
			}
		}
		return true;
	}
}