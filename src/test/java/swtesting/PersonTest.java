package swtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

    @Test
    public void add() {
        Person person = new Person();
        person.add();
    }
    
    @Test
    public void delete() {
        Person person = new Person();
        person.delete();
    }

}
