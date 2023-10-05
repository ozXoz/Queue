package javaapplicationqueue;

import java.util.Arrays;

public class ArrayQueue {
    private int [] items = new int[5];
    private int rear;
    private int front;
    private int count;
    // [10, 20 ,30, 40, 0]
    //   F              R
    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item){
        if(count==items.length)
            throw  new IllegalStateException();
        items[rear]=item;
        rear=(rear +1) % items.length;
        count++;
    }

    public int dequeue(){
        var item =items[front];
        items[front++]=0;
        front=(front +1) % items.length;

        count--;
        return item;

    }
    @Override
    public  String toString(){
        return Arrays.toString(items);
    }
}
