package no1;

import Model.Mahasiswa;

public class no1 {
    public static void getNo1() {
        StackQueue stack = new StackQueue(10);
        stack.push(new Mahasiswa("haikal", "22552011104", "TIF RM 22 A "));
        stack.push(new Mahasiswa("islaminur", "22552011103", "TIF RM 22 B "));
        stack.push(new Mahasiswa("muharram", "22552011102", "TIF RM 22 C "));

        stack.print();
        stack.peek();
        stack.pop();
        stack.print();
        stack.clear();
        stack.print();

        StackQueue queue = new StackQueue(10);
        queue.enqueue(new Mahasiswa("haikal", "22552011104", "TIF RM 22 A "));
        queue.enqueue(new Mahasiswa("islaminur", "22552011103", "TIF RM 22 B "));
        queue.enqueue(new Mahasiswa("muharram", "22552011102", "TIF RM 22 C "));

        queue.printQueue();
        queue.peekFront();
        queue.peekRear();
        queue.dequeue();
        queue.printQueue();
    }
}
