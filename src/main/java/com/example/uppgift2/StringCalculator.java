package com.example.uppgift2;


public class StringCalculator {


      public static int add(String numbers) {
            if (numbers.isEmpty()) {
                  return 0;
            } else {

                  String delimiter = "[,\n]";
                  if (numbers.startsWith("//")) {
                        int delimiterIndex = numbers.indexOf("\n");
                        delimiter = numbers.substring(2, delimiterIndex);
                        numbers = numbers.substring(delimiterIndex + 1);
                  }

                  String[] numArray = numbers.split(delimiter);

                  if (numbers.contains(".\n")) {
                        throw new IllegalArgumentException("Contains a new line after a comma");
                  }


                  int sum = 0;
                  for (String number : numArray) {
                        int num = Integer.parseInt(number);
                        if (num < 0) {
                              throw new IllegalArgumentException("Negative numbers not allowed " + num);
                        }
                        sum += num;
                  }
                  return sum;

            }


      }
}
