/**
 *COPYRIGHT (C) 2016 Rijkard Igualas. All Rights Reserved.
 *Class to calculate prime numbers.
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

/**
  * Calculates sequence of primes.
  */

public class PrimeSequence implements Sequence{
    private int number = 1;
       
    /**
     * Tests for prime number
     * @return next prime number
     */
    public int next()
    {
        do{
            number++;
        }while(!PrimeNum(number));
        
        return number;
        
    }  

    /**
     * Determines if number is prime
     * @param num the number calculated
     * @return the state of number
     */
    public boolean PrimeNum(int num)
    {
        for(int test = 2; test <= num / 2; test++ )
        {
            if(num % test == 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
