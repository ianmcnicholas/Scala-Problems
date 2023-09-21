/**
 * Run-length encoding of a list. Create a list of tuples from original list with number of instances and value
 */

class Problem10(problem9: Problem9) {

  def runLengthEncoding[A](listUnderTest: List[A]): List[(Int, A)] = {
    problem9.packConsecutiveDuplicates(listUnderTest).map(x => (x.size, x.head))
  }


}
