package com.sy.linklist;

import com.sy.arraylist.ArrayList;
import com.sy.collection.Collection;
import com.sy.collection.Iterator;

public class LinkList<E> implements Collection<E>
{
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new LinkListIterator();
	}

	private int length=0;
	private Node head=null;
	private Node tail=null;
	
	public void add(E obj)
	{
		Node node = new Node(obj, null);
		if(this.head==null)
		{
			//this.head.setNext(node);
			this.head = node;
		}
		
		else
		{
			this.tail.setNext(node);
			
		}
		this.tail = node;
		this.length++;
	}
	
	public void remove(int index)
	{
		if(index>this.length||index<=0)
		{
			System.out.println("no this node");
		}
		else
		{
			if(1==this.length)
			{
				this.head=null;
				this.tail=null;
			}
			
			else
			{
				if(1==index)
				{
					this.head = this.head.getNext();
				}
				else 
				{
					Node predecessor = this.head;
					Node successor = this.head;
					for(int i=1;i<index;i++)
					{
						successor = successor.getNext();
					}
					
					for(int i=1;i<index-1;i++)
					{
						predecessor = predecessor.getNext();
					}
					
					if(successor==this.tail)
					{
						predecessor.setNext(null);
						this.tail = predecessor;
					}
					else
					{
						predecessor.setNext(successor.getNext());
					}
				}
			}
			
			this.length--;
		}
	}
	
	public int size()
	{
		return this.length;
	}
	
	public E get(int index)
	{
		if(index<=0||index>this.size())
		{
			return null;
		}
		else
		{
			Node tmp = this.head;
			for(int i=1;i<index;i++)
			{
				tmp = tmp.getNext();
			}
			
			return (E) tmp.getObj();
		}
	}
	
	private class LinkListIterator<E> implements Iterator<E>
	{

		private Node tmpNode=head;
		@Override
		public boolean hasNext() 
		{
			// TODO Auto-generated method stub
			if(tmpNode!=null)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}

		@Override
		public E next() 
		{
			// TODO Auto-generated method stub
			Node tmp=tmpNode;
			tmpNode=tmpNode.getNext();
			return (E) tmp.getObj();
		}
		
	}
	
	public static void main(String[] arg)
	{
		LinkList<Integer> ll=new LinkList<Integer>();
		for(int i=0;i<30;i++)
		{
			ll.add(new Integer(i));
		}
		
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}
}
