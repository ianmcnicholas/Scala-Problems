import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Problem6Spec extends AnyWordSpec with Matchers {

  val problem6 = new Problem6
  val trueList = List(1, 2, 3, 2, 1)
  val falseList = List(1, 2, 3, 4, 5)

  "Problem 6" should {
    "find out if a list is a palindrome" in {
      assert(problem6.checkIfPalindrome(trueList))
      assert(!problem6.checkIfPalindrome(falseList))
    }
  }

}
