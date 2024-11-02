
public class LinkedList05{
	Node05 head;// every list has a head node
	public void insert (int data) { //add data at the end
		Node05 node = new Node05();
		node.data = data;
		node.next = null;
		
		// first node (first object) in linked list - currently no node in the list
		if (head == null)
		{
			head = node;
		}
		else // if we have some nodes (object there)
		{
			Node05 n = head;
			while (n.next != null) 
			{
				n = n.next;
			}
			n.next = node;
		}
		
	}
	
	public void show () {
		Node05 node = head;
		while (node.next!=null){
			System.out.println(node.data);
			node = node.next;
			
		}
		System.out.println(node.data);
		
	}

}
