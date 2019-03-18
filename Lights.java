import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Lights {

	public static void main(String args[]){
		BigInteger test = new BigInteger("999999999999998016");
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		String pattern;
	    for (int i = 1; i <= t; ++i) {
	      pattern = in.next();
	      char[] lightArray = pattern.toCharArray();//new char[pattern.length()];
	      int start = in.nextInt();
	      int end = in.nextInt();
	      int numberChecks = end-start;
	      numberChecks++;
	      start--;
	      int check = start%(lightArray.length);
	      int count = 0;
	      for(int j =0; j<numberChecks; j++){
	    	  if(lightArray[check]=='B'){
	    		  count++;
	    	  }
	    	  check++;
	    	  if (check==lightArray.length){
	    		  check=0;
	    	  }
	      }
	      System.out.println("Case #" +i+": "+count);
	    }
	}
}
