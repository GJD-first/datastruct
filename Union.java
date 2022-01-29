package datastruct;

public class Union {
	// find the parent of node i
	public static int find(int[] a, int i) {
		int j = i;
		while (a[j] >= 0) {
			j = a[j];
		}
		while (i != j) {
			int t = a[i];
			a[i] = j;
			i = t;
		}
		return j;
	}

	public static void union(int[] a, int i, int j) {
		if (i == j)
			return;
		int ii = find(a, i), jj = find(a, j);// find the parent of i ,find the parent of j
		if (ii == jj)
			return;
		int xi = -a[ii], xj = -a[jj];
		if (xi >= xj) {
			a[jj] = ii;
			a[ii]--;
		} else {
			a[ii] = jj;
			a[jj]--;
		}
	}
}
