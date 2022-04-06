package LetterFrequency.letterFrequency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input string");
		String line=br.readLine();
		Lettersequence ls=new Lettersequence(line);
		TreeMap<String,Integer>frequencyMap=ls.computeFrequency();
		ls.displayFrequency(frequencyMap);
    }
}
