package com.example.uppgift2;



public class StringCalculator {


      public static int add(String numbers) {
            if (numbers.isEmpty()) {
                  return 0;
            }



            int commaIndex = numbers.indexOf(",");
            if(commaIndex == -1){
                  return Integer.parseInt(numbers);
            }
            else{
                  String firstNumber = numbers.substring(0, commaIndex);
                  String secondNumber = numbers.substring(commaIndex + 1);

                  return Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
            }



      }
}
