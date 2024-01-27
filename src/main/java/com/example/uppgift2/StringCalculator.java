package com.example.uppgift2;



public class StringCalculator {


      public static int add(String numbers) {
            if (numbers.isEmpty()) {
                  return 0;
            }



            else

            {
                  String[] numArray = numbers.split(",");
                  int sum = 0;

                  for (String number : numArray) {
                        sum += Integer.parseInt(number);
                  }
                  return sum;

            }



      }
}
