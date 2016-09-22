package exercises

object Rainfall {
  /**
   *  Computes the average of a sequence of `Double`s that represents daily 
   *  rainfall readings.  
   *  
   *  The input may contain the number -999 indicating the end of the data of 
   *  interest. The function computes the average of the non-negative values in
   *  the input up to the first -999 (if it shows up).  There may be negative 
   *  numbers other than -999 in the input (representing faulty readings).  
   *  
   *  If there are no valid readings, returns `Double.NaN`.
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
  def rainfall(data: Seq[Double]): Double = {
    val usefulData = data.indexOf(-999) match {
      case -1 => data.filter(_ > 0)
      case i => data.take(i).filter(_ > 0)
    }

    usefulData.sum / usefulData.length
  }
}