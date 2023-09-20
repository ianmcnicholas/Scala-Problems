/**
 * Eliminate consecutive duplicates in a list.
 */

class Problem8 {
  def removeConsecutiveDuplicates[A](listUnderTest: List[A]): List[A] = {
    listUnderTest match {
      case head :: tail => { // if there is something in the listUnderTest...
        val (dupList, remainingList) = listUnderTest.span(_ == head)
        // create two lists, one of the first element and any consecutive duplicates, then split at the first difference
        dupList.head :: removeConsecutiveDuplicates(remainingList)
        // return a list with just one of the consecutive duplicates, and the tail that gets rerun through the method
      }
      case Nil => List() // if there is nothing, then return an empty list, which is the same as returning nothing
    }
  }

}
