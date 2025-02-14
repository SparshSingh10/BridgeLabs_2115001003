public class Merge_Sort {

	public static void main(String[] args) {

		int[] prices = { 2, 7, 9, 1, 5 };
		prices = bookstore(prices, 0, prices.length - 1);
		for (int i = 0; i < prices.length; i++) {
			System.out.print(prices[i] + " ");
		}
	}

	public static int[] bookstore(int[] prices, int si, int ei) {
		if (si == ei) {
			int[] single = new int[1];
			single[0] = prices[ei];
			return single;
		}

		int mid = (si + ei) / 2;
		int[] first = bookstore(prices, si, mid);
		int[] second = bookstore(prices, mid + 1, ei);

		return MergeSort(first, second);

	}

	public static int[] MergeSort(int[] first, int[] second) {

		int n = first.length;
		int m = second.length;

		int i = 0;
		int j = 0;
		int k = 0;
		int[] ans = new int[n + m];

		while (i < n && j < m) {
			if (first[i] < second[j]) {
				ans[k++] = first[i++];
			} else {
				ans[k++] = second[j++];
			}
		}
		while (i < n) {
			ans[k++] = first[i++];
		}
		while (j < m) {
			ans[k++] = second[j++];
		}
		return ans;
	}
}