package com.example.uppgift2;


import java.util.regex.Pattern;

public class StringCalculator {


      public static int add(String numbers) {
            if (numbers.isEmpty()) {
                  return 0;
            }

            String delimiter = "[,|\n]";
            if (numbers.startsWith("//")) {
                  int delStartIndex = numbers.indexOf("//") + 2;
                  int delEndIndex = numbers.indexOf('\n');
                  String customDelimiter = numbers.substring(delStartIndex, delEndIndex);
                  delimiter = "[" + Pattern.quote(customDelimiter) + "|\n]";
                  numbers = numbers.substring(delEndIndex + 1);
            }

            String[] numArray = numbers.split(delimiter);

            if (numbers.contains(",\n")) {
                  throw new IllegalArgumentException("Contains ',\\n'");
            }

            StringBuilder negativeNumbers = new StringBuilder();
            for (String element : numArray) {
                  if (element.startsWith("-")) {
                        negativeNumbers.append(element).append(",");
                  }
            }


            if (numbers.contains("-")) {
                  throw new IllegalArgumentException("Negative numbers not allowed " + negativeNumbers);
            }
            int sum = 0;
            for (String number : numArray) {

                  if (!number.isEmpty()) {
                        int num = Integer.parseInt(number);

                        if (num > 1000)

                              num = 0;
                        sum += num;


                  }

            }
            return sum;
      }

}



