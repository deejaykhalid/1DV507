package ko222gj_assign1;

public class SumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// n is the number to calculate sum up to.
				int n = 15;
				System.out.println(sum(n));
				System.out.println(sumRecursive(1 , n/2) + sumRecursive((n/2) + 1 , n));
				System.out.println(sumRecursiveTwo(1 , n));
			}
			
	public static int sum (int num) {
		return (num * (num + 1)) / 2;
	}
			
			public static int sumRecursive (int low, int n) {
				if (n == low) {
					return low;
				}else {
					return sumRecursive(low ,(n - 1)) + n;
				}
			}
			
			public static int sumRecursiveTwo (int low, int n) {
				if (n == low) {
					return low;
				}else {
					return (sumRecursive(low ,(n/2 - 1)) + n/2) + (sumRecursive(n/2 +1 ,(n - 1)) + n);
				}
			}
		}
                              //Motivation
        //Using recursive solution to summation the number to the others
		// It is very fast and easy to implement compared to iterative 
		// implementations, as i've to copy and paste them. Meanwhile
		// you can reuse recursive implementations with ease.
