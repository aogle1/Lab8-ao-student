package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {
  private WordCounter wordCounter;

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  @Before
  public void setUp() {
    wordCounter = new WordCounter(new HashMap<>());
    // TODO create the SUT instance
  }

  @After
  public void tearDown() {
    wordCounter = null;
    // TODO set the SUT instance to null
  }

  @Test
  public void testGetCountEmpty() {
    assertEquals(wordCounter.getCounts(), Collections.EMPTY_MAP);

    // TODO verify that the SUT initially returns an empty map

  }

  @Test
  public void testGetCountNonEmpty() {
    ArrayList<String> words = new ArrayList<>();
    words.add("Les");
    words.add("Mis");
    words.add("Friend");
    words.add("Les");
    words.add("Friend");
    words.add("Hi");
    words.add("Hi");

    Iterator i = words.iterator();
    wordCounter.countWords(i);

    assertEquals(wordCounter.getCount("Friend"), 2);
    assertEquals(wordCounter.getCount("Les"), 2);
    assertEquals(wordCounter.getCount("Hi"), 2);
    assertEquals(wordCounter.getCount("Mis"), 1);
    assertEquals(wordCounter.getCount("No"), -1);
  }

  // TODO run the SUT on a specific String iterator with some repeated words,
  // then use assertions to verify the correct counts
  // do this for at least two words in the iterator and two not in the iterator

}
