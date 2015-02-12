package swtesting;

import static org.junit.Assert.*;

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

}
