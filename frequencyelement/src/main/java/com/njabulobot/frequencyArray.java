package com.njabulobot;

public class frequencyArray {

   int visited = -1;
   
   int[] freqqArray(){

      givenArray array = new givenArray();
      int [] arr = array.numberArray();

      //Array frequency will store frequencies of an element
      int [] frequency = new int[arr.length];

      for(int i = 0;i < arr.length;++i){
         int count = 1;
         for(int j = i+1;j < arr.length;j++){
            if(arr[i] == arr[j]){
               count++;
               //To avoid counting same element again
               frequency[j] = visited;
            }
         }
         if(frequency[i]!=visited){
            frequency[i] = count;
         }
      }
      return frequency;
   }
}
