package com.njabulobot;

public class Main {
    public static void main(String[] args) {
        //Display the frequency of each element present in array
        System.out.println("----------------------------");
        System.out.println("Element | Frequency");
        System.out.println("----------------------------");
        frequencyArray freq = new frequencyArray();
        givenArray give = new givenArray();
        int [] giveArray = give.numberArray();
        int [] freArray = freq.freqqArray();
        for(int i = 0;i < freArray.length; i++){
            if(freArray[i] != freq.visited){
                System.out.println(" "+giveArray[i]+" | "+freArray[i]);
            }
            
        }
        System.out.println("----------------------------");
    }
}