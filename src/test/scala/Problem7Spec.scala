import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Problem7Spec extends AnyWordSpec with Matchers {

  val problem7 = new Problem7
  val listUnderTest = List(List(1, 1), 2, List(3, List(5, 8)))

  "Problem 7" should {
    "flatten a nest list structure" in {
      assert(problem7.flattenList(listUnderTest) == List(1, 1, 2, 3, 5, 8))
    }
  }

}
