/**
 *COPYRIGHT (C) 2016 Rijkard Igualas. All Rights Reserved.
 *Class to test Prime sequence.
 *Solves COP 3337 homework assignment #5
 *@author Rijkard Igualas
 *@version 2.00 2016-03-28
 * Rijkard Igualas
 * 3321856
 * COP 3337
 * section U02
 * I affirm that this program is entirely my own work and none 
* of it is the work of any other person.
 *	___________________
 * 	(your signature)
 *
 */
public class SequenceTester
{
    public static void main (String [] args)
    {
        //Initialize rows and columns
        final int ROW = 10;
        final int COLUMN = 10;
        //Create 2D array for prime numbers
        int [][] primes = new int [ROW][COLUMN];
        
        PrimeSequence seq = new PrimeSequence();
        //Assigns seq values untill array is filled and displays array
        for (int cIndex = 0; cIndex < COLUMN; cIndex++)
        {
            System.out.print(" | ");
            for (int rIndex = 0; rIndex < ROW; rIndex++)
            {
                primes[rIndex][cIndex] = seq.next() ;
                System.out.printf("%5s", primes[rIndex][cIndex] );
                System.out.print(" | ");
            }
            System.out.println();
        }         
    }
}
