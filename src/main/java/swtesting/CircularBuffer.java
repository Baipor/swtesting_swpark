package swtesting;

import java.util.List;

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
    
    DAO dao;
    public void setDAO(DAO dao) {
        this.dao = dao;
    }
    
    public DAO getDAO() {
        if(this.dao == null) {
            return new DAO();
        }
        return this.dao;
    }
    
    public void xxx() {
        List<String> result = getDAO().get(1);
        if( !result.isEmpty() ) {
            getDAO().ok();
        } else {
            result = dao.get(2);
        }
    }
    

}
