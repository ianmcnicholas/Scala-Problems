/**
 * Flatten a nested list structure.
 */

class Problem7 {
  def flattenList(listUnderTest: List[Any]): List[Any] = {
    listUnderTest.flatMap{
      case x: List[_] => flattenList(x) // if the element itself is a List, take that list and rerun this method
      case y => List(y) // if the element is just an element, return as a list member
    }
  }

}
