import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

/**
 * Find the number of elements in a list.
 */
class Problem4Spec extends AnyWordSpec with Matchers {

  val problem4 = new Problem4
  val listOfThings = List(1, 2, 3, 4, 5)

  "Problem 4" should {
    "return the size of the list" in {
      assert(problem4.returnSize(listOfThings) == 5)
    }
  }

}
