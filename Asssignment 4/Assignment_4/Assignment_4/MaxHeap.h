#ifndef MAX_HEAP_
#define MAX_HEAP_
#include <memory>
#include "HeapInterface.h"
#include "PrecondViolatedExcep.h"

template<class ItemType>
class MaxHeap : public HeapInterface<ItemType>
{
private:
	static const int ROOT_INDEX = 0;		//Helps with readability
	static const int DEFAULT_CAPACITY = 100;//Capacity of nodes
	std::unique_ptr<ItemType[]> items;		//Array of heap items
	int itemCount;							//current count of heap items
	int maxItems;							//Max capacity of the heap

	//-----------------------------------------------------------------------
	// Most of the private utility methods use an array index as a parameter
	// and in claculations. This should be safe, even though the array is an
	// implementation detail, since the methods are private
	//-----------------------------------------------------------------------

	// Returns the array index of the left child (if it exists)
	int getLeftChildIndex(const int nodeIndex) const;

	// Returns the array index of the right child (if it exists)
	int getRightChildIndex(int nodeIndex) const;

	// Returns the array index of the parent node
	int getParentINdex(int nodeIndex) const;

	//Tests whether this node is a leaf
	bool isLeaf(int nodeIndex) const;

	// Converts a semiheap into a heap
	void heapRebuild(int nodeIndex);

	//Creates a heap from an unordered array
	void heapCreate();

public:
	MaxHeap();
	MaxHeap(const ItemType someArray[], const int arraySize);
	virtual ~MaxHeap();

	//HeapInterface Public Methods
	bool isEmpty() const;
	int getNumberOfNodes() const;
	int getHeight();
	ItemType peekTop() const throw(PrecondViolatedExcep);
	bool add(const ItemType& newData);
	bool remove();
	void clear();
};// end MaxHeap
#include "MaxHeap.cpp"
#endif
