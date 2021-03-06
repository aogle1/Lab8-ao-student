package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    final WordCounter wordCounter = new WordCounter(new HashMap<>());
    wordCounter.countWords(input);
    final Map<String, Integer> countsMap = wordCounter.getCounts();
    final int mapSize = countsMap.size();
    final List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapSize);
    entryList.addAll(countsMap.entrySet());
    entryList.sort(new DescendingByCount());
    for (int i = 0; i < 10; i++) {
      System.out.println(entryList.get(i).toString());
    }

    // TODO complete this main program
    // 1. create a WordCounter instance
    // 2. use this to count the words in the input
    // 3. determine the size of the resulting map
    // 4. create an ArrayList of that size and
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the
    // latter)
    // 7. print the (up to) ten most frequent words in the text

  }
}
