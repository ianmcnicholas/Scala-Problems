import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Problem2Spec extends AnyWordSpec with Matchers {

  val problem2 = new Problem2
  val listOfIntegers = List(1, 2, 3, 4, 5)

  "Problem 2" should {
    "return the last-but-one element in a list of integers" in {
      assert(problem2.returnLastButOne(listOfIntegers) == 4)
    }
  }

}
