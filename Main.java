import java.util.*; // importing scanner //

class Main {
  public static void main(String[] args) {

    // Given a number of integers, combine them so it would create the largest number.
    // Example:
    // Input: [17, 7, 2, 45, 72]
    // Output: 77245217

    Scanner input = new Scanner(System.in);
    System.out.print("Largest Integer\n\nPlease enter a number of integers: "); // used to determine the size of an array //
    int count = input.nextInt();

    System.out.println("\nPlease enter each number, separating each with enter: ");
    int[] numOfint = new int[count]; // initializing array //
    for(int i = 0; i < count; i++) { // adding values //
      numOfint[i] = input.nextInt();
    }

    System.out.println("The largest number is " + largestNumber(numOfint)); // printing out the result //

  }

  public static String largestNumber(int[] arr) { // main method //
    // sorting method - bubble sort //
    for (int i = 0; i < arr.length - 1; i++) { // for every element in an array //
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (Integer.valueOf(arr[j+1] + "" + arr[j]) > Integer.valueOf(arr[j] + "" + arr[j+1])) { // comparison statement - if the value at one index higher combined with current value is greater than the current value combined with the next values, then we swap those elements since the number is larger, and hence, moving/sorting elements in an array //
          int temp = arr[j]; // if the statement is true, then temporarily hold the element to be replaced //
          arr[j] = arr[j + 1]; // this is just a replacement/switching method //
          arr[j + 1] = temp;
        }
      }
    }

    // converting int[] array to a string of numbers to display the largest number //
    String result = "";
    for (int val : arr) { // for every element in an array // 
      result += val; // add it to string result //
    }
    
    return result; // returning a string to be displayed //

  }

}

