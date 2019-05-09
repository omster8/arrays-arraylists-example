import java.util.*;
import java.io.*;

/**
 * The SortingCountries class reads in input from the Countries-population.txt file and stores the
 * country name, capital, population, and area in 4 ArrayLists. Then it sorts the countries in 
 * ascending alphabetical order and stores the country name and population in another text file.
 * Finally, it sorts the populations in descending order and stores the country name and population
 * in another text file. It uses a merge sort algorithm to sort the data for extra efficiency.
 * 
 * <h2>Course info:</h2>
 * ICS4U0 with Krasteva, V.
 * 
 * @version 04.03.19
 * @author Om Patel
 */ 
public class SortingCountries
{
  ArrayList<String> countries = new ArrayList<String>();
  ArrayList<String> capitals = new ArrayList<String>();
  ArrayList<String> areaInputs = new ArrayList<String>();
  ArrayList<String> populationInputs = new ArrayList<String>();
  
  /**
   * This is the input method that uses a Scanner object to read in input from the file.
   * It checks to see if the input country is a special case (with more than word for 
   * the country name or capital, or if more than one country starts with the same name).
   * Then it accordingly reads the rest of the line and stores the country name, capital
   * city, population, and country area into 4 separate ArrayLists.
   * 
   * <p>
   * <b>Local variables: </b>
   * <p>
   * <b>sc </b> Creates a Scanner object that reads in input from the Countries-Population.txt file.
   */ 
  public void input ()
  {
    try
    {
      Scanner sc = new Scanner (new File ("Countries-Population.txt"));
      String firstWord;
      while (sc.hasNext ())
      {
        firstWord = sc.next ();
        if (firstWord.equals ("Andorra") || firstWord.equals ("Brunei"))
        {
          String capital1, capital2, capital3, area, population;
          countries.add (firstWord);
          capital1 = sc.next ();
          capital2 = sc.next ();
          capital3 = sc.next ();
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
          capitals.add (capital1 + " " + capital2 + " " + capital3);
        }
        else if (firstWord.equals ("Papua") || firstWord.equals ("Antigua"))
        {
          String country2, country3, capital1, capital2, area, population;
          country2 = sc.next ();
          country3 = sc.next ();
          capital1 = sc.next ();
          capital2 = sc.next ();
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
          countries.add (firstWord + " " + country2 + " " + country3);
          capitals.add (capital1 + " " + capital2);
        }
        else if (firstWord.equals ("São"))
        {
          String country2, country3, country4 , capital1, capital2, area, population;
          country2 = sc.next ();
          country3 = sc.next ();
          country4 = sc.next ();
          capital1 = sc.next ();
          capital2 = sc.next ();
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
          countries.add (firstWord + " " + country2 + " " + country3 + " " + country4);
          capitals.add (capital1 + " " + capital2);
        }
        else if (firstWord.equals ("Argentina") || firstWord.equals ("Belarus") || firstWord.equals ("Bolivia") || firstWord.equals ("Cambodia") || firstWord.equals ("Ethiopia") || firstWord.equals ("Grenada") || firstWord.equals ("Kuwait") || firstWord.equals ("Guatemala") || firstWord.equals ("India") || firstWord.equals ("Malaysia") || firstWord.equals ("Mauritius") || firstWord.equals ("Mexico") || firstWord.equals ("Mongolia") || firstWord.equals ("Panama") || firstWord.equals ("Ukraine"))
        {
          String capital1, capital2, area, population;
          capital1 = sc.next ();
          capital2 = sc.next ();
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
          countries.add (firstWord);
          capitals.add (capital1 + " " + capital2);
        }

        else if (firstWord.equals ("Bosnia") || firstWord.equals ("Central") || firstWord.equals ("Trinidad"))
        {
          String country2, country3, capital, area, population;
          country2 = sc.next ();
          country3 = sc.next ();
          capital = sc.next ();
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
          countries.add (firstWord + " " + country2 + " " + country3);
          capitals.add (capital);
        }
        else if (firstWord.equals ("Burkina") || firstWord.equals ("Cape") || firstWord.equals ("Côte") || firstWord.equals ("Czech") || firstWord.equals ("East") || firstWord.equals ("Equatorial") || firstWord.equals ("Marshall") || firstWord.equals ("Myanmar") || firstWord.equals ("New") || firstWord.equals ("Saudi") || firstWord.equals ("Sierra") || firstWord.equals ("Solomon") || firstWord.equals ("South") || firstWord.equals ("Sri"))
        {
          String country2, capital, area, population;
          country2 = sc.next ();
          capital = sc.next ();
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
          countries.add (firstWord + " " + country2);
          capitals.add (capital);
        }
        else if (firstWord.equals ("Costa") || firstWord.equals ("Dominican") || firstWord.equals ("El") || firstWord.equals ("San"))
        {
          String country2, capital1, capital2, area, population;
          country2 = sc.next ();
          capital1 = sc.next ();
          capital2 = sc.next ();
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
          countries.add (firstWord + " " + country2);
          capitals.add (capital1 + " " + capital2);
        }
        else if (firstWord.equals ("United"))
        {
          String secondWord, area, population;
          secondWord = sc.next ();
          if (secondWord.equals ("Arab"))
          {
            String country3, capital1, capital2;
            country3 = sc.next ();
            capital1 = sc.next ();
            capital2 = sc.next ();
            countries.add (firstWord + " " + secondWord + " " + country3);
            capitals.add (capital1 + " " + capital2);
          }
          else if (secondWord.equals ("Kingdom"))
          {
            String capital = sc.next ();
            countries.add (firstWord + " " + secondWord);
            capitals.add (capital);
          }
          else
          {
            String capital1, capital2;
            capital1 = sc.next ();
            capital2 = sc.next ();
            countries.add (firstWord + " " + secondWord);
            capitals.add (capital1 + " " + capital2);
          }
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
        }
        else if (firstWord.equals ("St."))
        {
          String secondWord, area, population;
          secondWord = sc.next ();
          if (secondWord.equals ("Kitts"))
          {
            String country3, country4, capital;
            country3 = sc.next ();
            country4 = sc.next ();
            capital = sc.next ();
            countries.add (firstWord + " " + secondWord + " " + country3 + " " + country4);
            capitals.add (capital);
          }
          else if (secondWord.equals ("Lucia"))
          {
            String capital = sc.next ();
            countries.add (firstWord + " " + secondWord);
            capitals.add (capital);
          }
          else
          {
            String country3, country4, country5, capital;
            country3 = sc.next ();
            country4 = sc.next ();
            country5 = sc.next ();
            capital = sc.next ();
            countries.add (firstWord + " " + secondWord + " " + country3 + " " + country4 + " " + country5);
            capitals.add (capital);
          }
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
        }
        else if (firstWord.equals ("Korea,"))
        {
          String secondWord = sc.next (), area, population;
          String capital = sc.next ();
          area = sc.next ();
          population = sc.next ();
          countries.add (firstWord + " " + secondWord);
          capitals.add (capital);
          areaInputs.add (area);
          populationInputs.add (population);
        }
        else if (firstWord.equals ("Congo,"))
        {
          String secondWord, area, population;
          secondWord = sc.next ();
          if (secondWord.equals ("Republic"))
          {
            String country3, capital;
            country3 = sc.next ();
            capital = sc.next ();
            countries.add (firstWord + " " + secondWord + " " + country3);
            capitals.add (capital);
          }
          else
          {
            String country3, country4, country5, capital;
            country3 = sc.next ();
            country4 = sc.next ();
            country5 = sc.next ();
            capital = sc.next ();
            countries.add (firstWord + " " + secondWord + " " + country3 + " " + country4 + " " + country5);
            capitals.add (capital);
          }
          area = sc.next ();
          population = sc.next ();
          areaInputs.add (area);
          populationInputs.add (population);
        }
        else
        {
          String capital, area, population;
          capital = sc.next ();
          area = sc.next ();
          population = sc.next ();
          countries.add (firstWord);
          capitals.add (capital);
          areaInputs.add (area);
          populationInputs.add (population);
        }
      }
      sc.close ();
    }
    catch (FileNotFoundException e)
    {
      System.out.println ("File Not Found!");
    }
  }
  
  /**
   * This is a helper method for the merge sort algorithm that is used to sort the countries
   * in alphabetical order and the populations in descending order. It takes in two String
   * arrays, which are to be merged, and a String indicating the type of sort (whether the 
   * country names or the populations are being sorted). Then it accordingly merges the two
   * arrays and returns a merged array which is sorted.
   * 
   * <p>
   * <b>Local variables: </b>
   * <p>
   * <b>mergedArr </b> This is a String array which stores the merged array.
   * <p>
   * <b>arr1First </b> This is an integer that stores the current first index of arr1 that has not been sorted yet.
   * <p>
   * <b>arr2First </b> This is an integer that stores the current first index of arr2 that has not been sorted yet.
   * 
   * @param arr1 The first String array to be merged.
   * @param arr2 The second String array to be merged.
   * @param typeOfSort A String indicating the type of sort to perform.
   * 
   * @return String[] The merged array.
   */ 
  public String[] mergeArrays (String[] arr1, String[] arr2, String typeOfSort)
  {
    String[] mergedArr = new String[arr1.length + arr2.length];
    int arr1First = 0, arr2First = 0;
    
    for (int i = 0; i < mergedArr.length; i++)
    {
      if (typeOfSort.equals ("Country"))
      {
        mergedArr[i] = (arr1[arr1First].compareToIgnoreCase (arr2[arr2First]) < 0) ? arr1[arr1First] : arr2[arr2First];
      }
      else
      {
        int populationArr1 = 0, populationArr2 = 0;
        String popArr1Str = "", popArr2Str = "";
        for (int j = 0; j < arr1[arr1First].length (); j++)
        {
          if (arr1[arr1First].charAt (j) == '1' || arr1[arr1First].charAt (j) == '2' || arr1[arr1First].charAt (j) == '3' || arr1[arr1First].charAt (j) == '4' || arr1[arr1First].charAt (j) == '5' || arr1[arr1First].charAt (j) == '6' || arr1[arr1First].charAt (j) == '7' || arr1[arr1First].charAt (j) == '8' || arr1[arr1First].charAt (j) == '9')
          {
            popArr1Str = arr1[arr1First].substring (j);
            break;
          }
        }
        for (int j = 0; j < popArr1Str.length (); j++)
        {
          if (popArr1Str.charAt (j) == ',')
          {
            popArr1Str = popArr1Str.substring (0, j) + popArr1Str.substring (j + 1);
          }
        }
        populationArr1 = Integer.parseInt (popArr1Str);
        for (int j = 0; j < arr2[arr2First].length (); j++)
        {
          if (arr2[arr2First].charAt (j) == '1' || arr2[arr2First].charAt (j) == '2' || arr2[arr2First].charAt (j) == '3' || arr2[arr2First].charAt (j) == '4' || arr2[arr2First].charAt (j) == '5' || arr2[arr2First].charAt (j) == '6' || arr2[arr2First].charAt (j) == '7' || arr2[arr2First].charAt (j) == '8' || arr2[arr2First].charAt (j) == '9')
          {
            popArr2Str = arr2[arr2First].substring (j);
            break;
          }
        }
        for (int j = 0; j < popArr2Str.length (); j++)
        {
          if (popArr2Str.charAt (j) == ',')
          {
            popArr2Str = popArr2Str.substring (0, j) + popArr2Str.substring (j + 1);
          }
        }
        populationArr2 = Integer.parseInt (popArr2Str);
        mergedArr[i] = (populationArr1 < populationArr2) ? arr1[arr1First] : arr2[arr2First];
      }
      
      if (mergedArr[i].equals(arr1[arr1First]))
      {
        if (arr1First == arr1.length - 1)
        {
          if (typeOfSort.equals ("Country"))
          {
            arr1[arr1.length-1] = "zz";
          }
          else
          {
            arr1[arr1.length-1] = "a 2000000000";
          }
        }
        else
        {
          arr1First++;
        }
      }
      else if (mergedArr[i].equals(arr2[arr2First]))
      {
        if (arr2First == arr2.length - 1)
        {
          if (typeOfSort.equals ("Country"))
          {
            arr2[arr2.length-1] = "zz";
          }
          else
          {
            arr2[arr2.length-1] = "a 2000000000";
          }
        }
        else
        {
          arr2First++;
        }
      }
    }
    return mergedArr;
  }
  
  /**
   * This is the actual merge sort method that performs the algorithm on an ArrayList of 
   * Strings. It splits the ArrayList into arrays with a length of one element and stores
   * these arrays containing one element each into an ArrayList of String arrays. The
   * method also performs the specified type of sort, accordingly calling the mergeArrays
   * method.
   * 
   * <p>
   * <b>Local variables: </b>
   * <p>
   * <b>sortedArr </b> This is an ArrayList of String arrays that stores the sorted merged arrays at each level.
   * <p>
   * <b>tempLength </b> This is an integer that stores the number of arrays in the current merge sort level.
   * <p>
   * <b>prevTempLength </b> This is an integer that stores the number of arrays in the previous merge sort level,
   * and is used to help exit the merge sorting loop once there is only one merged array, which is the sorted array.   * 
   * 
   * @param inputArr The String ArrayList to be sorted.
   * @param typeOfSort A String indicating the type of sort to perform.
   * 
   * @return String[] The sorted array.
   */ 
  public String[] mergeSort (ArrayList<String> inputArr, String typeOfSort)
  {
    ArrayList<String[]> sortedArr = new ArrayList<String[]>(inputArr.size ());
    int tempLength = inputArr.size ();
    int prevTempLength = 0;
    
    for (String inputArrElement: inputArr)
    {
      String[] singleElement = {inputArrElement};
      sortedArr.add (singleElement);
    }
    while (tempLength >= 1 && (tempLength != prevTempLength))
    {
      for (int i = 0; i < tempLength; i += 2)
      {
        if (i == tempLength - 1)
        {
          sortedArr.set (i/2, sortedArr.get (i));
        }
        else
        {
          sortedArr.set (i/2, mergeArrays (sortedArr.get (i), sortedArr.get (i+1), typeOfSort));
        }
      }
      prevTempLength = tempLength;
      tempLength = (int) Math.ceil (1.0*tempLength/2);
    }
    
    return sortedArr.get (0);
  }
  
  /**
   * This method sorts an ArrayList containing the countries and population by ascending
   * alphabetical order of the countries, using the mergeSort method. It then outputs the
   * sorted array's elements line by line into the sortedByCountry.txt file by using a
   * PrintWriter object.
   *
   * <p>
   * <b>Local variables: </b>
   * <p>
   * <b>countryAndPopulation </b> This is an ArrayList of Strings that stores the country name and population,
   * separated by 3 tabs.
   * <p>
   * <b>sortedCountryAndPop </b> This is a String array that stores the sorted ArrayList.
   * <p>
   * <b>pw </b> This is the PrintWriter object that is used to read input from the file. 
   */ 
  public void sortByCountry ()
  {
    ArrayList<String> countryAndPopulation = new ArrayList<String>();
    String[] sortedCountryAndPop;
    PrintWriter pw;
    try
    {
      pw = new PrintWriter (new FileWriter ("sortedByCountry.txt"));
      for (int i = 0; i < populationInputs.size (); i++)
      {
        countryAndPopulation.add (countries.get (i) + "\t\t\t" + populationInputs.get (i));
      }
      sortedCountryAndPop = mergeSort (countryAndPopulation, "Country");
      for (String countryAndPop : sortedCountryAndPop)
      {
        pw.println (countryAndPop);
      }
      pw.close ();
    }
    catch (IOException e)
    {
      System.out.println ("Error while writing to file!");
    }
  }
  
  /**
   * This method sorts an ArrayList containing the countries and population by descending
   * numerical order of the populations, using the mergeSort method. It then outputs the
   * sorted array's elements line by line into the sortedByPopulation.txt file by using a
   * PrintWriter object. Finally, it gives the user a message indicating that the program
   * executed successfully.
   *
   * <p>
   * <b>Local variables: </b>
   * <p>
   * <b>countryAndPopulation </b> This is an ArrayList of Strings that stores the country name and population,
   * separated by 3 tabs.
   * <p>
   * <b>sortedCountryAndPop </b> This is a String array that stores the sorted ArrayList.
   * <p>
   * <b>pw </b> This is the PrintWriter object that is used to read input from the file. 
   */ 
  public void sortByPopulation ()
  {
    ArrayList<String> countryAndPopulation = new ArrayList<String>();
    String[] sortedCountryAndPop;
    PrintWriter pw;
    try
    {
      pw = new PrintWriter (new FileWriter ("sortedByPopulation.txt"));
      for (int i = 0; i < populationInputs.size (); i++)
      {
        countryAndPopulation.add (countries.get (i) + "\t\t\t" + populationInputs.get (i));
      }
      sortedCountryAndPop = mergeSort (countryAndPopulation, "Population");
      for (int i = sortedCountryAndPop.length - 1; i >= 0; i--)
      {
        pw.println (sortedCountryAndPop[i]);
      }
      pw.close ();
    }
    catch (IOException e)
    {
      System.out.println ("Error while writing to file!");
    }
    
    System.out.println ("Successfully sorted and saved country data!");
  }
  
  /** Description of main(String [] args)
    * This method calls the input, sortByCountry, and sortByPopulation methods to 
    * read data from the file, sort it by country and put it in a file, and finally
    * sort it by population and put it in another file.
    * 
    * <p>
    * <b>Local variables: </b>
    * <p>
    * <b>s </b> Creates an object of the SortingCountries class to run the program.
    * 
    * @param args[] String array that allows command line
    * parameters to be used when executing the program.
    */ 
  public static void main (String[] args)
  {
    SortingCountries s = new SortingCountries ();
    s.input ();
    s.sortByCountry ();
    s.sortByPopulation ();
  }
}