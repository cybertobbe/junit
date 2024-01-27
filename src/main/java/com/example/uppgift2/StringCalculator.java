package com.example.uppgift2;



public class StringCalculator {


      public static int add(String numbers) {
            if (numbers.isEmpty()) {
                  return 0;
            }



            else

            {
                  String[] numArray = numbers.split("[,\n]");

                  if(numbers.contains(".\n")) {
                        throw new IllegalArgumentException("Contains a new line after a comma");
                  }


                  int sum = 0;

                  for (String number : numArray) {
                        sum += Integer.parseInt(number);
                  }
                  return sum;

            }



      }
}
