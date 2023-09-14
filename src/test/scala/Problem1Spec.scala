import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

/**
 * Find the last element of a list.
 */

class Problem1Spec extends AnyWordSpec with Matchers{

  val problem1 = new Problem1
  val listOfIntegers = List(1, 2, 3, 4, 5)

  "Problem 1" should {
    "return the last element in a list of integers" in {
      assert(problem1.returnLast(listOfIntegers) == 5)
    }
  }

}
