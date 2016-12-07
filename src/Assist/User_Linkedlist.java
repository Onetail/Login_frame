package Assist;


public class User_Linkedlist 
{
	public class Node
	{
		public String name;
		public String account;
		public String passwd;
		public Node next;
		public Node(String name,String account,String passwd)
		{
			this.name = name;
			this.account = account;
			this.passwd = passwd;
			this.next = null;
		}
	}
	public Node first;
	public Node last;
	
	public void print()
	{
		Node current = first;
		while(current != null)
		{
			System.out.println(""+current.account + " " + current.passwd + " " + current.name);
			current = current.next;
		}
	}
	public boolean isEmpty()
	{
		return first == null;
	}
	public void insert(String name , String account,String passwd)
	{
		Node newnode = new Node(name,account,passwd);
		if(this.isEmpty())
		{
			first = newnode;
			last = newnode;
		}else
		{
			last.next = newnode;
			last = newnode;
		}
	}
}
