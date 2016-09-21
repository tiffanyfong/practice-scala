package exercises
import sys.error

/**
 * These exercises introduce you to Scala's powerful pattern matching features.
 *
 * Pattern matching can in its essence be compared to Java's 'switch' statement,
 * even though it provides many more possibilities. Whereas the Java switch statement
 * lets you 'match' primitive types up to int's, Scala's pattern matching goes much
 * further. Practically everything from all types of objects and Collections
 * can be matched, not forgetting xml and a special type of class called case classes.
 *
 * Pattern matching is also often used in combination with recursive algorithms.
 *
 * For this exercise exclusively use pattern matching constructs in order to make the
 * corresponding test work.
 * 
 * For more information on pattern matching, see:
 * 		http://docs.scala-lang.org/tutorials/tour/pattern-matching.html
 * 	AND / OR
 * 		Scala for the Impatient, 2/e Sections 14.1–14.5
 * 
 * These exercises are taken from ScalaLabs:
 * 		https://github.com/scala-labs/scala-labs/blob/master/labs/src/main/scala/org/scalalabs/basic/lab03/PatternMatchingExercise.scala
 */

object PatternMatching {

  /*************************************************************************
   * pattern matching exercises
   * For expected solution see @PatternMatchingTest
   *************************************************************************/

  def describeLanguage(s: String): String = s match {
    case "Java" | "Smalltalk" => "OOP"
    case "Clojure" | "Haskell" => "Functional"
    case "Scala" => "Hybrid"
    case "C" => "Procedural"
    case _ => "Unknown"
  }

  /**
   * Here's how matches should work. If `in` is:
   * 
   *    - a `String`, the function result is "A string with length n"
   *       where `n` is the length of `in`
   *       
   *    - a positive `Integer`, the function result is "A positive integer"
   *    
   *    - an instance of class `Person`, the function result is "A person with name: n"
   *       where `n` is the name of the person
   *       
   *    - a sequence with more than 10 elements, the function result is "Seq with more than 10 elements"
   *    
   *    - a sequence with at least three elements, the function result is "first: v1, second: v2, rest: tail"
   *        where v1, v2, and tail are the corresponding values from the sequence
   *        
   *    - null, the function result is "A null value"
   *        
   *    - anything else, the function result is "Some Scala class"
   */
  def matchOnInputType(in: Any): String = in match {
    case in: String => s"A string with length ${in.length}"
    case in: Int if in > 0 => "A positive integer"
    case Person(name, _) => s"A person with name: $name"
    case in: Seq[Any] if in.length > 10 => "Seq with more than 10 elements"
    case in: Seq[Any] if in.length >= 3 => s"first: ${in.head}, second: ${in(1)}, rest: ${in.drop(2)}"
    case null => "A null value"
    case _ => "Some Scala class"
  }

  /**
   * If the person is older than 30, return an `Option` with the person's name;
   *    otherwise return `None`
   */
  def older(p: Person): Option[String] = p match {
    case Person(name, age) if age > 30 => Some(name)
    case _ => None
  }
}

/* ---------------------------------
 * DETAILS ABOUT case classES
 * ---------------------------------
 * A case class is a nice way to declare a class whose main purpose is to
 * hold data.
 * 
 * We won't need to know too much about case classes (yet), but here is some
 * information on how they're used:
 * 
 * val person = Person('Ashley', 42)   // create a `Person` object
 * println(person.name)							   // print the `Person`'s name
 * 
 * For more information on case classes, see: 
 * 	http://docs.scala-lang.org/tutorials/tour/case-classes
 */
case class Person(name: String, age: Int)