package sievetest;
import java.util.*;
import java.lang.Integer;


public class Main {
	
public static ArrayList<Integer> sievetest(int n) {
	//code algorithm from : https://stackoverflow.com/questions/586284/finding-prime-numbers-with-the-sieve-of-eratosthenes-originally-is-there-a-bet
	System.out.println("The Prime Numbers are:");
    int upperBound = (int) (1.25506 * n / Math.log(n));
    ArrayList<Integer> result = new ArrayList<Integer>(upperBound);
    if (n >= 2)
        result.add(2);

    int size = (n - 1) / 2;
    BitSet bs = new BitSet(size);

    int i = 0;
    while (i < size) {
        int p = 3 + 2 * i;
        result.add(p);

        for (int j = i + p; j < size; j += p)
            bs.set(j);

        i = bs.nextClearBit(i + 1);
        System.out.println(p);
    }

    return result;
	}

public static void main(String[] args) {

	 //code below from https://stackoverflow.com/questions/5287538/how-can-i-get-the-user-input-in-java -->
	//Scanner reader = new Scanner(System.in);  // Reading from System.in
	int n = 55; // Scans the next token of the input as an int.
	System.out.println("Testing the Sieve of a Eratosthenes with the number" + $n + ": ");
	    sievetest(n);
	}

}
