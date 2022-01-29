package datastruct;
public class Heap {
	public static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static int parent(int i)
	{
		return (i-1)/2;
	}
	public static int left(int i)
	{
		return i*2+1;
	}
	public static int right(int i)
	{
		return i*2+2;
	}
	public static void heapify(int[] a,int i) {
		int l=left(i),r=right(i);
		int largest=i;
		if(l<a.length&&a[l]>a[i])
			largest=l;
		if(r<a.length&&a[r]>a[largest])
			largest=r;
		if (largest!=i) {
			swap(a, i, largest);
			heapify(a, largest);
		}
	}
	public static void build(int[] a) {
		for(int i=(a.length-1)/2;i>=0;i--)
		{
			heapify(a, i);
		}
	}
}