/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boose.wordwrap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bboose
 */
public class WordwrapClient {
    private static final Logger log = Logger.getLogger(WordwrapClient.class.getName());
    public static void main(String[] args) {
    System.out.println("working dir:" + System.getProperty("user.dir"));
        String filename = "src\\main\\resources\\testfile.txt";
        String wrapCandidate = null;
        try {
            wrapCandidate = new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException ex) {
            log.log(Level.SEVERE, null, ex);
        }
        
        Wordwrap wrapMe = new Wordwrap(wrapCandidate, 13);
        String wrapped = wrapMe.createWrappedText();
        System.out.println("Before: \n " + wrapCandidate);
        System.out.println("After wrapping: \n {0}" + wrapped); 
  }
}

