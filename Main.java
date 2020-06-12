package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;
import static java.lang.System.out;
import static java.util.Arrays.sort;

public class Main {

    // 1. Check if the number is double or not?

    static boolean isDouble(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //2. Multiplication table

    static void printCount(int count){
        for (int temp = 1; temp <=9; ++temp){
            out.println(count + " X " + temp + " = " + count*temp);
        }
    }

    // 4. Input 2 numbers and an operation
    static void doOperation(String num1, String num2, char c){
        if (num1 == null || num2 == null ) {
            out.println("Invalid numbers");
        }
        double first, second;
        try {
            first = Double.parseDouble(num1);
            second = Double.parseDouble(num2);
        } catch (NumberFormatException nfe) {
            out.println("Wrong numbers");
            return ;
        }
        switch (c)
        {
            case '+':
                out.println(first + " + " + second + " = " + (first + second));
                break;
            case '-':
                out.println(first + " - " + second + " = " + (first - second));
                break;
            case '*':
                out.println(first + " * " + second + " = " + (first * second));
                break;
            case '/':
                out.println(first + " / " + second + " = " + (first / second));
                break;
            case '%':
                out.println(first + " % " + second + " = " + (first % second));
                break;
            default:
                out.println("Wrong operation");
        }
       /* if(c == '+')  out.println(first + " + " + second + " = " + (first + second));
        else if (c == '-') out.println(first + " - " + second + " = " + (first - second));
        else if (c == '*') out.println(first + " x " + second + " = " + (first * second));
        else if (c == '/') out.println(first + " / " + second + " = " + (first / second));
        else  if (c == '%') out.println(first + " mod " + second + " = " + (first % second));
        else  out.println("Wrong operation");*/
    }

    //5. Is the entered number prime?

    static boolean prime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n/2; ++i) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //6. Find the nearest prime number

    public static void nearestPrime(int number){
        while (!prime(number)){
            number++;
        }
        out.println("Nearest prime number is: " +  number);
    }

    //8. Find the factorial

    public  static void fact(int number){
        if (number == 0) {
            out.println("The factorial is: " + 1);
            return;
        }
        int fact = 1;
        for(int i = 1; i <= number; ++i)
        {
            fact *= i;
        }
        out.println("The factorial is: " + fact);
    }

    // 9. Find the sum and average between the two input numbers

    public static void sumAndAverage(int first,int second){
        int sum = 0;
        for (int k= first + 1; k < second;  ++k){
            sum += k;
        }

        int count = Math.abs(first - second) - 1;
        if (count != 0){
            double average = (double)sum/count;
            out.println("The average is " + average + " and the sum is " + sum);
        } else {
            out.println("There are no numbers between: " + first + " and " + second);
        }
    }

    // 10. An array which has 10 elements and the values are double - count the average

    public static void countAverage(double array[]){
        double average = 0;
        for(int i=0; i< array.length; ++i){
            average +=  array[i];
        }
        average /= array.length;
        System.out.println("The average number is: " + average);
    }

    // 11. Put the number in an array

    public static void putArray(int number){
        String temp = Integer.toString(number);
        int array[] = new int[temp.length()];
        for (int i = 0; i < temp.length(); ++i)
        {
            array[i] = temp.charAt(i) - '0';
            out.print(array[i] + " ");

        }
           out.print("\n");
    }

    // 13. Find the prime, odd and even numbers and put it in an array
    static boolean isEven(int n){
        if(n % 2 == 0)        {
            //The given number n is even
            return true;
        }
        return false;
    }

   // 15. Check whether an element is present in the array or not

    private static void check(int[] array, int value){
        for (int element : array) {
            if (element == value) {
                out.println("The element is present in the array.");
                return;
            }
        }
        out.println("The element is not present in the array.");
    }

    // 16. Find the max and min values in the array

    public static void getMinMax(int[] array){
        int maxValue = array[0], minValue = array[0];
        for(int i=1; i < array.length; ++i){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("Minimum value is " + minValue);
        System.out.println("Maximum value is " + maxValue);
    }

    //18. Delete array value by index

    static void deleteValueByIndex(int[] array, int index){
            // Print the original array
            System.out.println("Original Array: " + Arrays.toString(array));
            System.out.println("Remove the element with index: " + index);
            if (array == null || index< 0 || index>= array.length) {
                System.out.println("No removal operation can be performed");
            }
            int newArray[] = new int[array.length - 1];
            for (int i = 0, k = 0; i <array.length; i++) {
                if (i == index) {
                    continue;
                }
                newArray[k++] = array[i];
            }
            System.out.println("Array after removal: " + Arrays.toString(newArray));
        }


    //19. Multiply each element of the array by 2.

    static void multByTwo(int[] arr) {
        if(arr.length == 0){
            out.println("[]");
        }

        for (int i = 0; i < arr.length; ++i) {
             arr[i] *= 2;
            out.print(arr[i] + " ");
        }
    }

    //20. Repeat each element 3 times

    public static void repeat(String[] array) {
        String[] arrayRepeat = new String[array.length];
        for (int index =0; index < array.length; ++index) {
            int finalIndex = index;
            String temp = IntStream.range(0, 3).mapToObj(i -> array[finalIndex]).collect(Collectors.joining(""));
            arrayRepeat[index] = temp;
            out.print(arrayRepeat[index] + "\n");
        }
    }

    // 21. Find the x and delete it and return the array
    public static void deleteXArray(String str[]){
        ArrayList newStr = new ArrayList();
        int index = 0;
        String updatedVal = "";
        for(int i =0; i<str.length; ++i){
            updatedVal = str[i];
            if (str[i].contains("x")){
                updatedVal= str[i].replace("x", "");
            }
            newStr.add(i, updatedVal);
            out.print(newStr.get(i) + " ");
        }
        if(newStr.isEmpty()){
            out.print("\n" + "[]");
        }
    }


    // 22. If the string value length is longer than the given number, delete it and return the new array without that value
    public static void checkLength(String str[], int length){
        ArrayList newStr = new ArrayList();
        int index = 0;
        for(int i =0; i<str.length; ++i){
            if(str[i].length() < length){
                newStr.add(index, str[i]);
                out.print(newStr.get(index) + " ");
            }
        }
        if(newStr.isEmpty()){
            out.print("\n" + "[]");
        }
    }

    // 23. Combine 2 arrays and return it in one function, find the sum of the averages of the 2 arrays and return it

    public static void combine(int [] arr1, int [] arr2){
        int newArr[] = new int [arr1.length+arr2.length];
        for(int i=0;i<arr1.length;++i){
            newArr[i] = arr1[i];
        }
        for(int j = 0; j<arr2.length;++j){
            newArr[j+ arr1.length] = arr2[j];
        }
        out.print("The combined array is: ");
        int sum = 0;
        for(int i=0; i<newArr.length; i++){
            sum+= newArr[i];
            out.print(+ newArr[i] + " ");
        }
    }

    public static void average(int[] arr1, int[] arr2){
        double sum1 = 0;
         for(int i =0;i<arr1.length;++i){
            sum1 += arr1[i];
        }
        sum1 /= arr1.length;

        double sum2 = 0;
        for(int i =0;i<arr2.length;++i){
            sum2 += arr2[i];
            }
        sum2 /= arr2.length;
        double sum = sum1 + sum2;
        out.print("\n" + "The sum of the average of the 2 arrays is: " + sum);
    }

   // 24. Make the third index of the array value grow 10%

   public static void growTenPerc(double[] array, int index) {
        if(index >= 0 && index < array.length){
            out.print("Previous value is: " + array[index]);
            array[index] = array[index] * 1.1;
            out.print("\n" + "The changed value is: " + array[index]);
        } else {
            out.print("The index is not valid");
           }
       }

    // 25. Find the n number in Fibonacci with recursion

    public static int fib(int n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    // 26. Find n factorial with recursion

    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    // 27. Return the most repeating age

    public static int getMax(int[] array){
        int maxValue = array[0];
        int count = -1;
        for(int i=1; i < array.length; ++i){
            if(array[i] > maxValue){
                maxValue = array[i];
                count = i;
            }
        }
        return count;
    }










    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1. Check if the number is double or not?

        out.println("Q1: Check if the number is double or not?");
        out.print("Enter a double number: ");
        String str = scan.next();
             if(isDouble(str))  out.println("It is a double number.");
             else  out.println("It is not a double number.");

        //2. Multiplication table

        out.println("\nQ2: Multiplication table");
        out.print("Enter a number: ");
        int count = scan.nextInt();
        printCount(count);

        // 3. My weight on the moon

        out.print("\n" + "Q3: Write your weight to see how much it is on the moon: ");
        double weight = scan.nextDouble();
        double moonWeight = (weight/9.81)*1.622;
        out.print("Your weight on the moon is: " + moonWeight + "\n");

        // 4. Input 2 numbers and an operation

        out.print("\nQ4: Input 2 numbers and an operation ");
        String number1 = scan.next();
        out.print("Type a second int, double or float number: ");
        String number2 = scan.next();
        out.print("Type +, -, /, % or *: ");
        char c = scan.next().charAt(0);
        doOperation( number1,  number2,  c);

        // 5.  Is the entered number prime?

        out.println("\nQ5: Is the entered number prime?");
        out.print("Type a number: ");
        int n = scan.nextInt();
        if(prime(n))  out.println("The entered number " + n + " is prime");
        else out.println("The entered number " + n + " is not prime");

        //6. Find the nearest prime number

        out.print("\nQ6: Insert a number to find the nearest prime number: ");
        int findPrime = scan.nextInt();
        nearestPrime(findPrime);

        // 7. Count the distance between 2 countries and the middle coordinate

        out.println("\nQ7: Count the distance between 2 countries and the middle coordinate");
        out.print("Insert the coordinates for the first country: ");
        double x1  = scan.nextDouble();
        double y1  = scan.nextDouble();
        out.print("Insert the coordinates for the second country: ");
        double x2  = scan.nextDouble();
        double y2  = scan.nextDouble();
        double distance = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)) ;
        out.println("The distance between the countries is: " + distance);
        double middleX = (x1 + x2)/2;
        double middleY = (y1 + y2)/2;
        out.println("The middle coordinates are: " + middleX + " " + middleY);

        //8. Find the factorial

        out.println("\nQ8: Find the factorial");
        out.print("Find the factorial of: ");
        int fac = scan.nextInt();
        fact(fac);

        // 9. Find the sum and average between the two input numbers

        out.println("\nQ9: Find the sum and average between the two input numbers");
        out.print("Enter the first number: ");
        int first =  scan.nextInt();
        out.print("Enter the second number: ");
        int second = scan.nextInt();
        sumAndAverage(first,second);

        // 10. An array which has 10 elements and the values are double - count the average

        out.println("\nQ10: Count the average for the array values");
        double array[] = {12.4, 322.4, 43.6, 76.0, 43.2, 2.3, 4.5, 1.2, 3.2, 7.4};
        countAverage(array);

        // 11. Put the number in an array

        out.print("\nQ11: Enter a number to put it in an array: ");
        int firstNumber = scan.nextInt();
        putArray(firstNumber);

        // 12. Convert the 2d array into 1d array

        out.print("\nQ12: Convert the 2d array into 1d array");
        int[][] matrix = new int[3][3];
        int newArray[] = new int[matrix.length*matrix[0].length];
        out.print("Please enter 9 integers separated by spaces:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();

        out.println("The 2d array is: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                out.print(matrix[row][column] + " ");
            }
            out.println();
        }

        out.println("The 1d array is:");
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length ; j++){
                int numb = matrix[i][j];
                newArray[i*row.length+j] = numb;
            }
        }

        for(int i = 0; i < newArray.length; i++) {
            out.print(newArray[i] + " ");
        }
        out.print("\n");

        // 13. Find the prime, odd and even numbers and put it in an array

        out.println("\nQ13:  Find the prime, odd and even numbers and put it in an array");
        out.println("The initial array is: ");
        int initialArray[] = new int[10];
        for(int i=0; i < initialArray.length; i++)
        {
            initialArray[i]  =  (int) (Math.random()*6) + 1;
            out.print(initialArray[i] + " ");
        }

        ArrayList primeNumArray = new ArrayList();
        ArrayList evenArray= new ArrayList();
        ArrayList oddArray = new ArrayList();
        int primeIndex = 0;
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i = 0; i< initialArray.length; ++i){
           if(prime(initialArray[i])){
               primeNumArray.add(primeIndex, initialArray[i]);
               primeIndex++;
           }

           if(isEven(initialArray[i])){
               evenArray.add(evenIndex, initialArray[i]);
               evenIndex++;
            }
           else{
               oddArray.add(oddIndex, initialArray[i]);
               oddIndex++;
           }
        }

        out.print("\nThe prime number array is: ");
        for(int i = 0; i< primeNumArray.size(); ++i){
                out.print(primeNumArray.get(i)+ " ");
            }
        out.print("\nThe even number array is: ");
        for(int i = 0; i< evenArray.size(); ++i){
            out.print(evenArray.get(i)+ " ");
        }
        out.print("\nThe odd number array is: ");
        for(int i = 0; i< oddArray.size(); ++i){
            out.print(oddArray.get(i)+ " ");
        }


        // 14. Sort the array

        out.println("\n\nQ14: Sort the array");
        Integer sortArray[] = new Integer[10];
        for(int i=0; i < sortArray.length; i++)
        {
            sortArray[i]  =  (int) (Math.random()*6) + 1;
            out.print(sortArray[i] + " ");
        }
        out.println("\nThe array is sorted ascending");
        sort(sortArray);
        for(int i=0; i < sortArray.length; i++)
        {
            out.print(sortArray[i] + " ");
        }
        out.println("\nThe array is sorted descending");
        Arrays.sort(sortArray, Collections.reverseOrder());

        for(int i=0; i < sortArray.length; i++)
        {
            out.print(sortArray[i] + " ");
        }


        // 15. Check whether an element is present in the array or not

        out.println("\n\nQ15: Check whether an element is present in the array or not");
        int newarr[] = { 3, 2, 1, 9, 5, 2, 16, 19 };
        int value = 9;
        check(newarr, value);

        // 16. Find the max and min values in the array

        out.println("\nQ16: Find the max and min values in the array");
        int array1[] = {233,43,-12,0,12};
        getMinMax(array1);

        // 17. Find the repeating values and return them

       out.println("\nQ17: Find the repeating values and return them");
        int frstArray[] = {2,3,5,89,6,8,90};
        int scndArray[] = {5,3,9,6,23};
        ArrayList matches  = new ArrayList();
        int m = 0;
        for ( int i = 0; i < frstArray.length; ++i) {
            for (int j = 0; j < scndArray.length; ++j) {
                if (frstArray[i] == scndArray[j]) {
                    matches.add(m ,frstArray[i]);
                    out.print(matches.get(m) + " ");
                    m++;
                }
            }
        }

        // 18. Delete array value by index

        out.println("\n\nQ18: Delete array value by index");
        int arrayByIndex[] = {1,2,3,4,5,6};
        deleteValueByIndex(arrayByIndex, 3);

        // 19. Multiply each element of the array by 2

        out.println("\nQ19: Multiply each element of the array by 2");
        int ar[] = {1,2,3,4,5,6};
        multByTwo(ar);

        // 20. Repeat each element 3 times

        out.println("\n\nQ20: Repeat each element 3 times");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        repeat(cars);

        // 21. Find the x and delete it and return the array
        out.println("\nQ21: Find the x and delete it and return the array");
        String strArrayX [] = new String[]{"Veryx", "oxld", "people", "arxe", "xoxxkx"};
        String strArray1X [] = new String[]{};
        String strArray2X [] = new String[]{"x","bxxsjwx"};

        deleteXArray(strArrayX);
        deleteXArray(strArray1X);
        out.print("\n");
        deleteXArray(strArray2X);

        // 22. If the string value length is longer than the given number, delete it and return the new array without that value
        out.println("\n\nQ22: Input a number and return a string array which has that number length");
        int numberLength = 4;
        String strArray [] = new String[]{"Very", "old", "people", "are", "ok"};
        String strArray1 [] = new String[]{"Very", "olddse", "people", "arere", "okay"};

        checkLength(strArray, numberLength);
        checkLength(strArray1, numberLength);


        // 23. Combine 2 arrays and return it in one function, find the sum of the averages of the 2 arrays and return it

        out.println("\n\nQ23: 1. Combine 2 arrays and return it in one function");
        out.println("     2. Find the sum of the averages of the 2 arrays and return it");
        int firstArray[] = {2,5,3,2,1};
        int secondArray[] = {4,5,67,8,97,5,4};
        combine(firstArray, secondArray);
        deleteXArray(strArray1X);
        average(firstArray,secondArray);

        // 24. Make the third index of the array value grow 10%

        out.println("\n\nQ24: Make the third index of the array value grow 10%");
        double array2[] = {12,3,7,4,0};
        growTenPerc(array2,3);
        out.print("\n");
        growTenPerc(array2,10);

        //25. Find the n number in Fibonacci with recursion

        out.println("\n\nQ25: Find the n number in Fibonacci with recursion");
        int numFib = 3;
        out.println("The entered fibonacci number is: " + fib(numFib));

        // 26. Find n factorial with recursion

        out.println("\nQ26: Find n factorial with recursion");
        int numFact = 5;
        out.println("The entered number factorial is: " + factorial(numFact));

        // 27. Find the oldest and youngest person first name and last name

        List<Person> aList = Arrays.asList(
                new Person("Diana", "Smith", 30, "London"),
                new Person("Arthur","Manukyan", 52, "Yerevan"),
                new Person("Kim", "Kardashyan", 32, "LA"),
                new Person("Anna","Monyan", 18, "Tallinn"),
                new Person("Sona","Johnson", 32, "Tartu"));

        out.println("\nQ27: Find the oldest and youngest person first name and last name");
        Person oldest = aList.stream().max((a,b) -> a.getAge() - b.getAge()).get();
        out.println(String.format("The oldest person is %s %s", oldest.getFirstName(), oldest.getLastName()));
        Person youngest = aList.stream().min((a,b) -> a.getAge() - b.getAge()).get();
        out.println(String.format("The youngest person is %s %s", youngest.getFirstName(), youngest.getLastName()));

        // Return the most repeating age
        int countSize[] = new int [aList.size()];
        for (int i = 0; i < aList.size(); ++i) {
            countSize[i]=0;
            for(int j = i+1; j< aList.size(); ++j){
            if(aList.get(i).getAge() == aList.get(j).getAge()){
                countSize[i]++;
            }
            }
        }

        int indexArrayAge = getMax(countSize);
        if (indexArrayAge < 0) {
            out.println("There are no repeating ages");
        }
        else {
            out.println("The most repeating age is: " + aList.get(indexArrayAge).getAge());
        }

        // Sort by age
        Collections.sort(aList, Comparator.comparing(Person::getAge));
        for (int i = 0; i < aList.size(); ++i) {
            out.println(aList.get(i).getFirstName() + " " + aList.get(i).getLastName());
        }
    }
}




