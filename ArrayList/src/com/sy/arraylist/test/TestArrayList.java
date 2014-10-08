package com.sy.arraylist.test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.sy.arraylist.ArrayList;

public class TestArrayList {

	@Test
	public void testAdd() {
		ArrayList array = new ArrayList();
		for(int i=0;i<19;i++)
		{
			array.add(new Object());
			//array.add(new String("abc"));
		}
		
		assertThat(array.size(), is(19));
	}

	@Test
	public void testSize() {
	}

	@Test
	public void testRemove() 
	{
		ArrayList array = new ArrayList();
		for(int i=0;i<19;i++)
		{
			array.add(new Integer(i));
			//array.add(new String("abc"));
		}
		
		//array.remove(1);
		
		//assertThat(array.get(6), is(219));
	}
	
	@Test
	public void testGet()
	{
		ArrayList array = new ArrayList();
		for(int i=0;i<19;i++)
		{
			array.add(new Integer(i));
			//array.add(new String("abc"));
		}
		
		//array.remove(1);
		
		//assertThat(array.get(6), is(219));		
	}

}
