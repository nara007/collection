package com.sy.arraylist;

import com.sy.collection.Collection;
import com.sy.collection.Iterator;

public class ArrayList<E> implements Collection<E>
{
	@Override
	public Iterator<E> iterator() 
	{
		// TODO Auto-generated method stub
		return new ArrayListIterator();
	}

	private Object[] objects = new Object[10];
	private int index=0;
	
	public void add(E obj)
	{
		if(this.index==objects.length)
		{
			Object[] newArray = new Object[objects.length+30];
			System.arraycopy(this.objects, 0, newArray, 0, this.objects.length);
			this.objects=newArray;
		}
		
		objects[index]= obj;
		this.index++;
	}
	
	public int size()
	{
		return this.index;
	}
	
	public void remove(int index)
	{
		if(index>=this.index||index<0)
		{
			System.out.println("no this object");
		}
		
		else
		{
			for(int i=index;i<this.objects.length-1;i++)
			{
				this.objects[index] = this.objects[index+1];
			}
			//Object[] tmp = new Object[this.size()-1];
			
			//System.arraycopy(this.objects, 0, tmp, 0, this.objects.length-1);
			
			//this.objects = tmp;
			this.index--;
		}
	}
	
	public E get(int index)
	{
		return (E) this.objects[index];
	}
	
	
	private class ArrayListIterator<E> implements Iterator<E>
	{
		private int localIndex=0;

		@Override
		public boolean hasNext() 
		{
			// TODO Auto-generated method stub
			if(localIndex<ArrayList.this.index)
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
			localIndex++;
			return (E) ArrayList.this.objects[localIndex-1];
		}
		
	}
	
	public static void main(String[] arg)
	{
		ArrayList<String> ll=new ArrayList<String>();
		for(int i=0;i<30;i++)
		{
			ll.add(new String(String.valueOf(i)));
		}
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
