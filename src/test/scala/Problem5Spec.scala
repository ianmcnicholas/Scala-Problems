import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Problem5Spec extends AnyWordSpec with Matchers {

  val problem5 = new Problem5
  val listOfThings = List(1, 2, 3, 4, 5)

  "Problem 5" should {
    "reverse a list" in {
      assert(problem5.reverseList(listOfThings) == List(5, 4, 3, 2, 1))
    }
  }

}
