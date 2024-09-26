#pragma once
#include "GraphInterface.h"
#include"LinkedGraph.cpp"

#ifndef LINKED_GRAPH_
#define LINKED_GRAPH_


template<class LabelType>
class LinkedGraph
{
private:
	int numberOfVertices;
	int numberOfEdges;

public:
	// constructor
	LinkedGraph();
	int getNumVertices() const;
	int getNumEdges() const;
	bool add(LabelType start, LabelType end, int edgeWeight);
	bool remove(LabelType start, LabelType end);
	bool getEdgeWeight(LabelType start, LabelType end) const;
	void unvisitVertices();
	void depthFirstTraversal(LabelType startLabel,
		void visit(LabelType&));
	void breadthFirstTraversal(LabelType startLabel,
		void visit(LabelType&));
	

protected:
	void depthFirstTraversalHelper(std::shared_ptr<Vertex<LabelType>> startVertex,
		void visit(LabelType&));
	void breadthFirstTraversalHelper(std::shared_ptr<Vertex<LabelType>> startVertex,
		void visit(LabelType&));
	auto findOrCreateVertex(const LabelType& vertexLabel)
};//end LinkedGraph

#endif
