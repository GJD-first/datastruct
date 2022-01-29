package datastruct;

public class Sort {
	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// [left,bound]
	public static void merge(int[] a, int left, int right, int bound) {
		int[] temp = new int[bound - left + 1];
		int i = left, j = right, k = 0;
		while (i < right && j <= bound) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		while (i < right)
			temp[k++] = a[i++];
		while (j <= bound)
			temp[k++] = a[j++];
		for (k = 0; k < temp.length; k++) {
			a[left + k] = temp[k];
		}
	}

	// [left,right]
	public static int partition(int[] a, int left, int right) {
		int x = a[right];
		int i = left;
		for (int j = left; j < right; j++) {
			if (a[j] < x) {
				swap(a, i, j);
				i++;
			}
		}
		swap(a, right, i);
		return i;
	}

	public static void bubbsort(int a[]) {
		for (int i = 1; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	public static void choicesort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
	}

	public static void insertsort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i - 1; j >= 0 && a[j] > a[j + 1]; j--) {
				swap(a, j, j + 1);
			}
		}
	}

	public static void shellsort(int[] a) {
		int h = 1;
		while (h < a.length) {
			h = 3 * h + 1;
		}
		h = (h - 1) / 3;
		while (h >= 1) {
			for (int i = 0; i < a.length; i++) {
				for (int j = i - h; j >= 0 && a[j] > a[j + h]; j -= h) {
					swap(a, j, j + h);
				}
			}
			h = (h - 1) / 3;
		}
	}

	// [left,right]
	public static void mergesort(int[] a, int left, int right) {
		if (left >= right)
			return;
		int mid = left + (right - left) / 2;
		mergesort(a, left, mid);
		mergesort(a, mid + 1, right);
		merge(a, left, mid + 1, right);
	}

	public static void quicksort(int[] a, int left, int right) {
		if (left >= right)
			return;
		int q = partition(a, left, right);
		quicksort(a, left, q - 1);
		quicksort(a, q + 1, right);
	}
}
