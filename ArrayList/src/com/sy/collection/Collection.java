package com.sy.collection;

public interface Collection<E>
{
	void add(E obj);
	int size();
	void remove(int index);
	E get(int index);
	Iterator iterator();
}
