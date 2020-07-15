package com.practice.Projects.mayur.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class ListQueries {
  /**
   *
   * For this problem, we have  types of queries you can perform on a List:
   *
   * Insert  at index :
   *
   * Insert
   * x y
   * Delete the element at index :
   *
   * Delete
   * x
   * Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
   *
   * Input Format
   *
   * The first line contains an integer,  (the initial number of elements in ).
   * The second line contains  space-separated integers describing .
   * The third line contains an integer,  (the number of queries).
   * The  subsequent lines describe the queries, and each query is described over two lines:
   *
   * If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
   * If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
   * Constraints
   *
   *
   *
   * Each element in is a 32-bit integer.
   * Output Format
   *
   * Print the updated list  as a single line of space-separated integers.
   *
   * Sample Input
   *
   * 5
   * 12 0 1 78 12
   * 2
   * Insert
   * 5 23
   * Delete
   * 0
   * Sample Output
   *
   * 0 1 78 12 23
   *
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(scanner.nextInt());
    }
    int queries = scanner.nextInt();
    for (int i = 0; i < queries; i++) {
      String type = scanner.next();
      if (type.equals("Insert")) {
        int key = scanner.nextInt();
        int val = scanner.nextInt();
        list.add(key, val);
      } else if (type.equals("Delete")) {
        int key = scanner.nextInt();
        list.remove(key);
      }
    }
    list.forEach(ele -> System.out.print(ele + " "));
  }
}
