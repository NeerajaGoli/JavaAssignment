

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import java.util.ListIterator;


class SList<T>
{
			Node<T> head=null;
			
			
			public SListIterator iterator()
			{
				return new SListIterator<T>(head);
			}
}

class Node<T>
{
		T data;
		Node next;
		Node(T value)
		{
			data=value;
			next=null;
		}
		
}
class SListIterator<T> 
{ 
	SList<T> list=new SList<T>();
	Node<T> currentNode;
    SListIterator(Node<T> node)
    {
    	list.head=node;
    	currentNode=node;
    }
    
    //insert node at given position
    public void add(int position,T data)
    {
    	Node<T> new_node = new Node<T>(data); 
        new_node.next = null; 
        
        Node<T> node=list.head;
        if(position==0)
        {
        	new_node.next=list.head;
        	list.head=new_node;
        	currentNode=list.head;
        }
        else
        {
        	
        
	        int index=0;
	        while(index!=position-1)
	        {
	        	node=node.next;
	        	index++;
	        }
	        new_node.next=node.next;
	        node.next=new_node;
        }
        System.out.println("node "+data+" added at "+position);
    }
    
    //insert node at the end
	public  void add(T data) 
    { 
        
        Node<T> new_node = new Node<T>(data); 
        new_node.next = null; 
  
        
       
        if(list.head==null)
        {
        	
        	currentNode=new_node;
        	list.head=currentNode;
        }
        else
        {
        	Node<T> node=list.head;
        	while(node.next!=null)
        	{
        		node=node.next;
        	}
        	node.next=new_node;
        
        }
        System.out.println("node data "+new_node.data);
        
    }
	
	
	//remove node at given position
	 public void remove(int position)
     {
     	if(list.head==null )
     	{
     		throw new IllegalStateException("list is empty");
     	}
     	else if(position==0)
     	{
     		list.head=currentNode.next;
     		currentNode=list.head;
     	}
     	else
     	{
     		Node<T> node=list.head;
     		int index=0;
        	while(index!=position-1)
        	{
        		
        		node=node.next;
        		index++;
        	}
        	Node<T> temp=node.next;
        	
        	node.next=temp.next;
        	
        	
        	
     	}
     	
     	System.out.println("node removed at index "+position);
     }
	 
	 
	 //returns current node value and moves to next node
	 public T next()
	 {
		 T data=null; 
		 
		 if(currentNode!=null)
		 {
			 data=currentNode.data;
			 currentNode=currentNode.next;
		 }
		 else
			 
			 throw new IllegalStateException("node is null");
		 
		 
		 return data;
	 }
	 
	 
	 
	 //check whether next node exists or not
	 public boolean hasNext()
	 {
		 
		 return currentNode!=null;
						 
	 }
} 

public class SingleLinkedList {

	
	public static void main(String[] args) {
		
					
		
		SList<Integer> slist=new SList<Integer>();
		SListIterator<Integer> iterator=slist.iterator();
		
		iterator.add(1);
		iterator.add(2);
		iterator.add(3);
		iterator.add(0,4);
		iterator.remove(2);

		System.out.println("*****Printing list elements****");
		while(iterator.hasNext())
		{
			
			System.out.println("value "+iterator.next());
		}
	}

}
