/**
 * Pack consecutive duplicates of list elements into sub-lists.
 */

class Problem9 {
  def packConsecutiveDuplicates[A](listUnderTest: List[A]): List[List[A]] = {
    listUnderTest match { // inspect each element of the list
      case head :: tail => // if there is "anything" in the inspected element, split it into head and tail
        val (packedList, remainingList) = listUnderTest.span(_ == head)
        // create two vals.  Split the list (.span - see Problem8) and assign the two new lists to the two vals
        packedList :: packConsecutiveDuplicates(remainingList)
      // return a new List - the head is the packedList, the tail is the recursive call on the remaining starting List
      case Nil => List()
      // if there is nothing left to inspect, append Empty List to the end of the returnedList and return from method
    }
  }

}
