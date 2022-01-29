package datastruct;

public class LineTree {
	public int left, right, value;
	public LineTree lTree, rTree;

	public LineTree() {
		// TODO Auto-generated constructor stub
		lTree = null;
		rTree = null;
	}

	public LineTree(int low, int high) {
		left = low;
		right = high;
		lTree = null;
		rTree = null;
	}

	public static LineTree build(int a[], int low, int high) {
		LineTree node = new LineTree(a[low], a[high]);
		if (low == high) {
			node.value = a[low];
		} else {
			int mid = low + (high - low) / 2;
			node.lTree = build(a, low, mid);
			node.rTree = build(a, mid + 1, high);
			node.value = node.lTree.value + node.rTree.value;
		}
		return node;
	}
}
