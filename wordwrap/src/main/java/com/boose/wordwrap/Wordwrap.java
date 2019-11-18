/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boose.wordwrap;

import java.util.logging.Logger;
import org.apache.commons.text.WordUtils;

/**
 *
 * @author bboose
 */
public class Wordwrap {

    private static final Logger log = Logger.getLogger(Wordwrap.class.getName());
    private static final int DEFAULT_LINE_LENGTH = 12;
    private static final String NEW_LINE = "\n";
    private String textToWrap;
    private Integer lineLength;
    
    public Wordwrap() {
        
    }
    
    public Wordwrap(String text, Integer len){
        lineLength = len;
        if(len == null){
            lineLength = DEFAULT_LINE_LENGTH;
        }
        textToWrap = text;
    }
    
    public String createWrappedText(){
       String wrapped = WordUtils.wrap(textToWrap, lineLength, NEW_LINE, false, "\\W");
       return wrapped;
    }

    public String getTextToWrap() {
        return textToWrap;
    }

    public void setTextToWrap(String textToWrap) {
        this.textToWrap = textToWrap;
    }

    public Integer getLineLength() {
        return lineLength;
    }

    public void setLineLength(Integer lineLength) {
        this.lineLength = lineLength;
    }
    
}
