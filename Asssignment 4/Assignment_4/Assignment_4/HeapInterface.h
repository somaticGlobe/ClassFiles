#pragma once
#pragma once

#ifndef HEAP_INTERFACE_
#define HEAP_INTERFACE_

template<class ItemType>
class HeapInterface
{
public:
	/**sees whether this heap is empty
	* @return True if the heap is empty, False if not*/
	virtual bool isEmpty() const = 0;

	/**Gets the number of nodes in this heap
	* @return the number of nodes in this heap*/
	virtual int getNumberOfNodes() const = 0;

	/**gets the height of this heap
	* @return the height of this heap*/
	virtual int getHeight() const = 0;

	/**
	*	Gets the data that is in the root (top) of this heap
	*	For a maxHeap, the data is the largest value in the heap;
	*	For a minHeap, the data is the smallest value;
	* @pre - the heap is not empty
	* @post - The root's data has been returned, and the heap is unchanged
	* @return - The data in the root of the heap
	*/

	virtual ItemType peekTop() const = 0;

	/**
	*	Adds a new data item to this heap
	* @param newData - The data to be added
	* @post - The heap has a new node that contains newData
	* @return - True if the additionis successful, False if not
	*/
	virtual bool add(const ItemType& newData) = 0;

	/**
	*	Removes the data that is in the root(top) of this heap
	* @return - True if the removal was successful, False if not
	*/
	virtual bool remove() = 0;

	/**
	* Removes all data from this heap
	*/
	virtual void clear() = 0;

	/**
	*	Destroys this heap and frees its assigned memory
	*/
	virtual ~HeapInterface() { }
};// end HeapInterface
#endif