package com.heap;

public class MaxHeap extends Heap{

    public void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerIndex = getLeftChildIndex(index);

            if(hasRightChild(index) && rightChild(index)< leftChild(index)){
                smallerIndex = getRightChildIndex(index);
            }

            if(items[index]> items[smallerIndex]){
                break;
            }else{
                swap(index,smallerIndex);
            }
            index = smallerIndex;
        }
    }

    public void heapifyUp(){
        int index = size - 1;

        while(hasParent(index) && parent(index)<items[index]){
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }
}