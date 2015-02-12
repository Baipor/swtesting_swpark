package swtesting;

public class CircularBuffer {

    String[] buffer;
    int head;
    int tail;

    public CircularBuffer() {
        buffer = new String[10];
    }

    public CircularBuffer(int bufferSize) {
        buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return head == tail;
    }
    
    public boolean isFull() {
        return size() == head;
    }

    public void add(String data) {
        buffer[head++] = data;
    }

    public String get() {
        return buffer[tail++];
    }

    public int size() {
        return buffer.length;
    }

}
