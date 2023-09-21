import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Problem9Spec extends AnyWordSpec with Matchers {

  val problem9 = new Problem9
  val listUnderTest = List(1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5)

  "Problem 9" should {
    "pack consecutive duplicates of list elements into sub-lists" in {
      assert(problem9.packConsecutiveDuplicates(listUnderTest) == List(List(1, 1, 1), List(2), List(3, 3), List(1, 1), List(4), List(5, 5, 5, 5)))
    }
  }

}
