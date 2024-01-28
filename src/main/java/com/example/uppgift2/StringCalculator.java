package com.example.uppgift2;


import java.util.ArrayList;
import java.util.List;

public class StringCalculator {


      public static int add(String numbers) {
            if (numbers.isEmpty()) {
                  return 0;
            }


            String delimiter = "[,|\n]";
            if (numbers.startsWith("//")) {
                  int delimiterIndex = numbers.indexOf("\n");
                  delimiter = numbers.substring(2, delimiterIndex);
                  numbers = numbers.substring(delimiterIndex + 1);
            }

            String[] numArray = numbers.split(delimiter);

            if (numbers.contains(",\n")) {
                  throw new IllegalArgumentException("Contains ',\\n'");
            }

            String negativeNumbers = "";
            for (String element : numArray) {
                  if (element.startsWith("-")) {
                        negativeNumbers += element + ",";
                  }
            }


            if (numbers.contains("-")) {
                  throw new IllegalArgumentException("Negative numbers not allowed " + negativeNumbers);
            }
            int sum = 0;
            for (String number : numArray) {
                  sum += Integer.parseInt(number);
            }
            return sum;

      }


}

