package swtesting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CircularBufferTest {

    @Test
    public void emptyBuffer() {
        CircularBuffer circularBuffer = new CircularBuffer();
        assertTrue(circularBuffer.isEmpty());
    }
    
    @Test
    public void addOneDataToBuffer() {
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.add("A");
        assertFalse(circularBuffer.isEmpty());
    }
    
    @Test
    public void removeOneDataFromBuffer() {
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.add("A");
        circularBuffer.get();
        assertTrue(circularBuffer.isEmpty());
    }
    
    @Test
    public void addAgetA() {
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.add("A");
        String actualResult = circularBuffer.get();
        assertEquals("A", actualResult);
    }
    
    @Test
    public void addGroupDataThenReturnDataGroup() {
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.add("A");
        circularBuffer.add("B");
        circularBuffer.add("C");
        assertEquals("A", circularBuffer.get());
        assertEquals("B", circularBuffer.get());
        assertEquals("C", circularBuffer.get());
    }
    
    @Test
    public void bufferSizeDefaultEqualTen() {
        CircularBuffer circularBuffer = new CircularBuffer();
        assertEquals(10, circularBuffer.size());
    }
    
    @Test
    public void customBufferSizeEqualFive() {
        CircularBuffer circularBuffer = new CircularBuffer(5);
        assertEquals(5, circularBuffer.size());
    }
    
    @Test
    public void bufferFull() {
        CircularBuffer circularBuffer = new CircularBuffer(3);
        circularBuffer.add("A");
        circularBuffer.add("B");
        circularBuffer.add("C");
        assertTrue(circularBuffer.isFull());
    }
    
    @Test
    public void bufferFull2() {
        CircularBuffer circularBuffer = new CircularBuffer(3);
        circularBuffer.add("A");
        circularBuffer.add("B");
        circularBuffer.add("C");
        assertTrue(circularBuffer.isFull());
    }
    
    @Test
    public void xxx() throws Exception {
        DAO stub = new DAO() {
            public List<String> get(int i) {
                List<String> z = new ArrayList<String>();
                z.add("dd");
                return z;
            }
        };
        
        CircularBuffer circularBuffer = new CircularBuffer(3);
        circularBuffer.setDAO(stub);
        circularBuffer.xxx();
    }
    
    @Test
    public void yyy() throws Exception {
        DAO mock = new DAO() {
            boolean isCAll = false;
            public List<String> get(int i) {
                List<String> z = new ArrayList<String>();
                z.add("dd");
                return z;
            }
            
            public void ok() {
                isCAll = true;
            }
            
            public boolean isCall() {
                return isCAll;
            }

        };
        
        CircularBuffer circularBuffer = new CircularBuffer(3);
        circularBuffer.setDAO(mock);
        circularBuffer.xxx();
        assertTrue(mock.isCall());
    }

}
