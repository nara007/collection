package com.sy.linklist.test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.sy.linklist.LinkList;

public class TestLinkList {

	@Test
	public void testAdd() {
		LinkList ll = new LinkList();
		
		for(int i=0;i<3;i++)
		{
			ll.add(new Integer(i));
		}
		
		assertThat(ll.size(), is(3));
	}

	@Test
	public void testRemove() {
		LinkList ll = new LinkList();
		
		for(int i=0;i<3;i++)
		{
			ll.add(new Integer(i));
		}
		
		ll.remove(1);
		
		assertThat(ll.size(), is(2));
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

}
