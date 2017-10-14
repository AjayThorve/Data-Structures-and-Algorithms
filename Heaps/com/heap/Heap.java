package com.heap;
import java.util.Arrays;
public abstract class Heap{

    protected int capacity;
    protected int size;
    protected int[] items;

    public Heap(){
        this.capacity = 10;
        this.size = 0;
        this.items = new int[capacity];
    }

    public void ensureCapacity(){
        if(size == capacity){
            capacity = capacity << 1;
            items = Arrays.copyOf(items,capacity);
        }
    }

    public int getLeftChildIndex(int parentIndex){
        return 2*parentIndex + 1;
    }

    public int getRightChildIndex(int parentIndex){
        return 2*parentIndex + 2;
    }

    public int getParentIndex(int childIndex){
        return (childIndex-1)/2;
    }

    public boolean hasLeftChild(int parentIndex){
        return getLeftChildIndex(parentIndex) < size;
    }

    public boolean hasRightChild(int parentIndex){
        return getRightChildIndex(parentIndex) < size;
    }

    public boolean hasParent(int childIndex){
        return getParentIndex(childIndex)>=0;
    }

    public int leftChild(int index){
        return items[getLeftChildIndex(index)];
    }

    public int rightChild(int index){
        return items[getRightChildIndex(index)];
    }

    public int parent(int index){
        return items[getParentIndex(index)];
    }

    public void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    public int peek(){
        isEmpty("Peek");

        return items[0];
    }


    public void isEmpty(String methodName) {
        if(size == 0) {
            throw new IllegalStateException(
                "You cannot perform '" + methodName + "' on an empty Heap."
            );
        }
    }

    public int extractTop(){
        isEmpty("ExtractMin");

        int item = items[0];
        items[0] = items[size-1];

        size--;
        heapifyDown();
        return item;
    } 

    public void add(int item){
        ensureCapacity();
        items[size]=item;
        size++;
        heapifyUp();
    }

    public abstract void heapifyDown();
    
    public abstract void heapifyUp();


}