//Question 8 | Amarjeet kumar singh | Roll no: 202002021073
class Q8 {
	int minDist(int arr[], int n, int x, int y)
	{
		int i, j;
		int min_dist = Integer.MAX_VALUE;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if ((x == arr[i] && y == arr[j]
					|| y == arr[i] && x == arr[j])
					&& min_dist > Math.abs(i - j))
					min_dist = Math.abs(i - j);
			}
		}
		if (min_dist > n) {
			return -1;
		}
		return min_dist;
	}

	public static void main(String[] args)
	{
		Q8 min = new Q8();
		int arr[] = { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3 };
		int n = arr.length;
		int x = 1;
		int y = 2;

		System.out.println("Minimum distance between " + x
						+ " and " + y + " is "
						+ min.minDist(arr, n, x, y));
	}
}