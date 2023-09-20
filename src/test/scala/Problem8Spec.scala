import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Problem8Spec extends AnyWordSpec with Matchers {

  val problem8 = new Problem8
  val listUnderTest = List(1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5)

  "Problem 8" should {
    "eliminate consecutive duplicates in a list" in {
      assert(problem8.removeConsecutiveDuplicates(listUnderTest) == List(1, 2, 3, 1, 4, 5))
    }
  }

}
