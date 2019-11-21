/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boose.wordwrap;

import java.util.logging.Logger;

/**
 *
 * @author bboose
 */
public class Wordwrap {

    private static final Logger log = Logger.getLogger(Wordwrap.class.getName());
    private static final int DEFAULT_LINE_LENGTH = 13;
    private static final String NEW_LINE = "\n";  // tried using system line separator, but it wouldn't test
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
    
    /**
     * 
     * @return string wrapped to <= lineLength
     */
    public String createWrappedText() {
        if(textToWrap == null) {
            return "";
        }
        StringBuilder currentLine = new StringBuilder();
        StringBuilder completed = new StringBuilder();
        
        String [] splitUnwrappedText = textToWrap.split("\\s");
        for(int i = 0; i < splitUnwrappedText.length; i++){
           currentLine.append(splitUnwrappedText[i]).append(" ");
           boolean lenGTESize = (i+1 == splitUnwrappedText.length || ((currentLine.length() + splitUnwrappedText[i+1].length()) > lineLength));
           if (lenGTESize) {
                currentLine.deleteCharAt(currentLine.length() - 1);
                completed.append(currentLine.toString()).append(NEW_LINE);
                currentLine = new StringBuilder();
            }
        }
        String output = completed.toString().trim();
        return output;
        
        
        // I really wanted this one to work, but it doesn't handle word lengths lineLength > 
        
//        StringBuilder sb = new StringBuilder();
//        if(textToWrap == null) {
//            return "";
//        }
//        
//        Pattern p = Pattern.compile("\\b.{1," + (lineLength) + "}\\b\\W?");    
//        Matcher m = p.matcher(textToWrap);
//
//        while(m.find()) {
//                System.out.println(m.group().trim());
//                sb = sb.append(m.group().trim()).append("\n");
//        }
//        String output = sb.toString();
//        return output;
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
