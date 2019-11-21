/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boose.wordwrap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bboose
 */
public class WordwrapTest {
    private List<String> testList;
    private static final int STR1 = 0;
    private static final int STR2 = 1;
    
    
    public WordwrapTest() {
    }

    
    @Before
    public void setUp() {
        testList = this.generateTestCases();
    }


    /**
     * Test of createWrappedText method, of class Wordwrap.
     */
    @Test
    public void testCreateWrappedText() {
        System.out.println("createWrappedText");
        testBaseExample();
        testEmptyString();
    }
    
     
    private void testBaseExample(){
        Wordwrap instance = new Wordwrap(testList.get(STR1), 13);
        String expResult =  "Four score\n" +
                            "and seven\n" +
                            "years ago our\n" +
                            "fathers\n" +
                            "brought forth\n" +
                            "upon this\n" +
                            "continent a\n" +
                            "new nation,\n" +
                            "conceived in\n" +
                            "liberty and\n" +
                            "dedicated to\n" +
                            "the\n" +
                            "proposition\n" +
                            "that all men\n" +
                            "are created\n" +
                            "equal";
        
        String result = instance.createWrappedText();
        assertEquals(expResult, result);
    }
    
    private void testEmptyString() {
        Wordwrap instance = new Wordwrap(testList.get(STR2), 12);
        String expResult = "";
        String result = instance.createWrappedText();
        assertEquals(expResult, result);
    }
 
    
    private List<String> generateTestCases(){
        // test example case
        String str1 = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
        // test empty string
        String str2 = "";
   
        List<String> listOfTestStrings = Stream
        .of(str1, str2)
        .collect(Collectors.toList());
        
        return listOfTestStrings;
    }

   
}
