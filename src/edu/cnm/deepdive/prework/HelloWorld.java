package edu.cnm.deepdive.prework;

public class HelloWorld {


  public static void main(String[] args) {
    salute((args.length > 0) ? args[0] : "World");

    //Using "main" to invoke "salute"
//    salute(target: "World")

    //     This was a simple if else control statement
//    if (args.length > 0)  {
//
//      salute(args[0]);
//    } else {
//      salute("World");
//    }
  }
  private static void salute(String target) {
    //Example of String Concatenation (combines multiple strings into single string)
    System.out.println("Hello, " + target + "!");
  }
}
