#include "MaxHeap.h"

template<class ItemType>
int MaxHeap<ItemType>::
getLeftChildIndex(const int nodeIndex) const
{
	return (2 * nodeIndex) + 1;
}// end getLeftChildIndex

template<class ItemType>
MaxHeap<ItemType>::
MaxHeap(const ItemType someArray[], const int arraySize):
		itemCount(arraySize), maxItems(2*arraySize)
{
	// allocate the array
	items = std::make_unique<ItemType[]>(maxItems);

	//Copy given values into the array
	for (int i = 0; i < itemCount; i++)
	{
		items[i] = someArray[i];
	}

	//Reorganize the array into a heap
	heapCreate();
}// end Constructor

template<class ItemType>
void MaxHeap<ItemType>::heapCreate()
{
	for (int index = itemCount / 2 - 1; index >= 0; index--)
	{
		heapRebuild(index);
	}
}// End heapCreate

template<class ItemType>
ItemType MaxHeap<ItemType>::peekTop() const throw(PrecondViolatedExcep)
{
	if (isEmpty())
	{
		throw PrecondViolatedExcept("Attempted peek into empty heap")
	}
	return items[0];
}// end peekTop