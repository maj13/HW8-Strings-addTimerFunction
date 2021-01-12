package com.pirpleJava;

import java.util.*;

/*
* By Mavis Javier
* This program contains functions that returns sum of time in given 
* measurements and specified exceptions in wrong function calls.
* See line 157
*/

public class AdvancedStrings {

    public static boolean timeAdder(int value1, String label1, int value2, 
            String label2){

        try{
            if(value1 >= 0 && value2 >= 0){
                try{
                    if((isCorrectFormat(value1, label1)) && 
                            (isCorrectFormat(value2, label2))){
                        label1 = label1.toLowerCase();
                        label2 = label2.toLowerCase();
                        if(!isSeconds(label1)){
                            value1 = convertToSeconds(label1, value1);
                        }
                        if(!isSeconds(label2)){
                            value2 = convertToSeconds(label2, value2);
                        }

                        Integer sum = value1 + value2;
                        String[] output = new String[2];
                        String seconds;
                        if(sum > 1){
                            seconds = "seconds";
                        } else {
                            seconds = "second";
                        }
                        output[0] = Integer.toString(sum);
                        output[1] = seconds;
                        System.out.println(Arrays.toString(output));
                    } else {
                        System.err.println("Incorrect measurement format. "
                                + "Try changing measurement to singular or "
                                + "plural form such as \"second\" "
                                + "to \"seconds\"");
                        return false;
                    } 
                } catch(Exception exc){
                    System.err.println("Invalid input.");
                    return false;
                }
                return true;
            } else {
                System.err.println("Invalid Input.");
                return false;
            }
        } catch(RuntimeException exc) {
            System.err.println("Invalid input.");
            return false;
        }    
        
    }
    
    // endsWith​(String suffix)
    static boolean isCorrectFormat(int value, String label){
        if (value > 1){
            return label.endsWith("s");
        } else
            return true;
    } 
    
    static boolean isSeconds(String label){
        label = label.toLowerCase();
        boolean result = false;
        if(label == "second" || label == "seconds")
            result = true;
        return result;
    }

    static int convertToSeconds(String label, int value){
        if(!(label.endsWith("s"))){
            label = label.concat("s");
        }
            switch(label) {
                case "minutes":
                    return value * 60;
                case "hours":
                    return value * 3600;
                case "days":
                    return value * 86400;
                default:
                    return value;
            }
    }   


public static void main(String[] args){
    // ans: 240
    timeAdder(1,"minute",3,"minutes");
    // ans: 522,000
    timeAdder(5,"days",25,"hours");
    // ans: 300
    timeAdder(1,"minute",240,"seconds");
    // ans: 2,073,630
    timeAdder(30, "seconds", 24, "days");

    timeAdder(5,"hour",5,"minutes");
    
    /* The following function calls commented out returns a runtime error when I 
       want them to stil be runnable and print out my own exception and return 
       false*/
//        timeAdder(false,false,5,"minutes");
//        timeAdder({},"days",5,"minutes");
    }
}