import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Problem3Spec extends AnyWordSpec with Matchers {

  val problem3 = new Problem3
  val listOfIntegers = List(1, 2, 3, 4, 5)
  val K = 3

  "Problem 3" should {
    "return the Kth element in a list" in {
      assert(problem3.returnKthElement(listOfIntegers, K) == 3)
    }
  }

}
