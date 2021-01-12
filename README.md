# HW8-Strings-addTimerFunction
 Pirple's Fundamentals of Java HW Assignment 8

## Instructions from Pirple.com:
Create a function called "timeAdder" that can add two time values together. 
For example, it should be able to add 25 hours and 3 days together. 

The function should accept 4 parameters:

value1, label1, value2, label2

- value1 and value2 should accept positive integers  

- label1 and label2 should accept any of the following strings: "seconds", 
"minutes", "hours", "days", "second", "minute", "hour", "day"

For example your function may be called in any of the following ways (this is 
pseudocode not Java):

timeAdder(1,"minute",3,"minutes")

timeAdder(5,"days",25,"hours")

timeAdder(1,"minute",240,"seconds")



Requirements:

1. Your function must accept any possible combination of inputs 

2. If the inputs are valid, it should return an array with 2 variables inside of 
it: value3, and  label3. For example:

return [5,"minutes"]; 

The exact label you choose to return for label3 ("minutes" for example) is up 
to you (I chose seconds).

3. If the inputs are invalid or impossible, it should return false. Here are 
examples of impossible and invalid inputs:

timeAdder(5,"hour",5,"minutes") // This is impossible because "hour" is singular 
and 5 is plural

timeAdder(false,false,5,"minutes") // This is invalid because the first 2 
arguments are not the correct types

timeAdder({},"days",5,"minutes") // This is invalid because the first argument 
is the wrong type

