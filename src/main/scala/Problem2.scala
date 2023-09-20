/**
 * Find the last but one element of a list.
 */

class Problem2 {
  def returnLastButOne(list: List[Int]): Int = {
    list.init.last
    // the .init method returns all the elements of the list except the last one.
  }

}
