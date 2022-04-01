package datastruct;
//calucate sum of range
 
public class LineTree {
	int[] tr;
	int n;
	LineTree(int[] a)
	{
		n=a.length;
		tr=new int[4*n];
		build(0,0,n-1,a);
	}
	private build(int id,int left,int right,int[] a)
	{
		if(right<left)return;
		if(left==right)
		{
			tr[id]=a[left];
			return;
		}
		int mid=left+(right-left)/2;
		build(id*2+1,left,mid,a);
		build(id*2+1,mid+1,right,a);
		tr[id]=tr[id*2+1]+tr[id*2+2];
	}
	private int msearch(int id,int left,int right,int aleft,int aright)
	{
		if(aleft>=left&&aright<=right)return tr[id];
		int mid=aleft+(aright-aleft)/2;
		if(mid<=right)return msearch(id*2+1,left,right,aleft,mid);
		if(left>mid) return msearch(id*2+2,left,right,mid+1,aright);
		return msearch(id*2+1,left,right,aleft,mid)+msearch(id*2+2,left,right,mid+1,aright);
	}
	public int search(int left,int right)
	{
		return msearch(0,left,right,0,n-1);
	}
	
	
	
	
	
	
	
	
}
