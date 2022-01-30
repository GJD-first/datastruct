package datastruct;

public class Stack {
	public LinkStack top;
	public static int inf=99999;
	public Stack() {
		// TODO Auto-generated constructor stub
		top=null;
	}
	public void push(int data)
	{	
		LinkStack node=new LinkStack(data, top);
		top=node;
	}
	public void pop()
	{
		if(top!=null)
			top=top.getPre();
	}
	public boolean empty()
	{
		return top==null;
	}
	public int getTop()
	{
		if(top!=null)return top.getData();
		return inf;
	}
}
class LinkStack{
	public int data;
	public LinkStack pre;
	public LinkStack(int adata) {
		pre=null;
		data=adata;
	}
	public LinkStack(int adata,LinkStack apre) {
		data=adata;
		pre=apre;
	}
	public void setPre(LinkStack pre) {
		this.pre = pre;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public LinkStack getPre() {
		return pre;
	}
}