package com;

public class Four_Sum
{
	// with given sum
	public static boolean quadTuple(int[] A, int n, int sum, int count)
	{
		// if sum is reached with 4 elements, return true
		if (sum == 0 && count == 4) {
			return true;
		}

		// return false if sum is not possible
		if (count > 4 || n == 0) {
			return false;
		}
		return quadTuple(A, n - 1, sum - A[n - 1], count + 1) ||
						quadTuple(A, n - 1, sum, count);
	}

	public static void main(String[] args)
	{
		int[] A = { 2, 7, 4, 0, 9, 5, 1, 3 };
		int sum = 20;

		if (quadTuple(A, A.length, sum, 0)) {
			System.out.print("Quadruplet Exists");
		} else {
			System.out.print("Quadruplet Don't Exist");
		}
	}
}
