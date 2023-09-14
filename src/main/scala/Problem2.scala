class Problem2 {
  def returnLastButOne(list: List[Int]): Int = {
    list.init.last
    // the .init method returns all the elements of the list except the last one.
  }

}
