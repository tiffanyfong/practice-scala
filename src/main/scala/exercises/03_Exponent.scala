package exercises

object Exponent {
  
  /**
   * Provide a recursive implementation of the exponent function:
   * 		expt(n, e) = n^e
   *
   * You can assume that n and e are both non-negative
   * 
   * For a description of a recursive exponent algorithm and code in Java, see:
   * 		https://www.cs.cmu.edu/~ref/pgss/lecture/7/
   * 
   * NOTE: Scala has a built-in exponent function, but you're not allowed to
   * use it to implement `expt`
   */

  // From the improved recursive algorithm via the link above
  //if n even:    x to n = (x to 2) to n/2
  //if n odd:     x to n = x * (x to 2) to (n-1)/2

//  def expt(n: Int, e: Int): Int =
//  if (e == 0) 1
//  else if (e == 1) n
//  else if (e % 2 == 0) n*n * expt(n,e/2)
//  else n*n*n * expt(n, (e-1)/2)

  def expt(n: Int, e: Int): Int = if (e == 0) 1 else n * expt(n, e-1)

}