import org.mockito.Mockito._
import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.mockito.MockitoSugar

class Problem10Spec extends AnyWordSpec with Matchers with MockitoSugar {

  val listUnderTest = List(1, 1, 1, 1, 2, 3, 3, 1, 1, 4, 5, 5, 5, 5)
  val mockProblem9: Problem9 = mock[Problem9]
  val problem10 = new Problem10(mockProblem9)

  "Problem 10" should {
    "do run-length encoding of a list" in {

      when(mockProblem9.packConsecutiveDuplicates(listUnderTest))
        .thenReturn(List(List(1, 1, 1), List(2), List(3, 3), List(1, 1), List(4), List(5, 5, 5, 5)))

      assert(problem10.runLengthEncoding(listUnderTest) == List((3, 1), (1, 2), (2, 3), (2, 1), (1, 4), (4, 5)))
    }
  }

}
